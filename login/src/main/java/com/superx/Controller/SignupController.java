package com.superx.Controller;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class SignupController extends AuthController {

    private ViewController mainController;

    public SignupController(ViewController mainController) {
        this.mainController = mainController;
    }

    public void handleSignup(TextField fNameField, TextField lNameField, TextField emailField,
                           PasswordField passwordField, PasswordField confirmPasswordField, CheckBox termsCheckBox) {
        String firstName = fNameField.getText().trim();
        String lastName = lNameField.getText().trim();
        String email = emailField.getText().trim();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (validateSignupInput(firstName, lastName, email, password, confirmPassword, termsCheckBox)) {
            String response = signUp(email, password);

            if (response != null && !response.contains("error")) {
                JSONObject jsonResponse = new JSONObject(response);
                String localId = jsonResponse.getString("localId"); 

                
                if (createUserInFirestore(localId, firstName, lastName, email)) {
                    showAlert(Alert.AlertType.INFORMATION, "Success", "Account created successfully!");
                    
                    
                    ViewController.setCurrentUserId(localId);
                    mainController.showDocScene();
                } else {
                     showAlert(Alert.AlertType.ERROR, "Error", "Signup succeeded, but failed to save profile.");
                }

            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Signup failed. The email might already be in use.");
            }
        }
    }
    
    private boolean createUserInFirestore(String uid, String firstName, String lastName, String email) {
        Firestore db = FirestoreClient.getFirestore();
        Map<String, Object> user = new HashMap<>();
        user.put("firstName", firstName);
        user.put("lastName", lastName);
        user.put("email", email);
        user.put("joinedDate", com.google.cloud.Timestamp.now());
        user.put("mobileNumber", ""); 
        user.put("about", "");
        user.put("profilePictureUrl", "");

        try {
            
            db.collection("users").document(uid).set(user).get();
            System.out.println("User profile created in Firestore for UID: " + uid);
            return true;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return false;
        }
    }


    private boolean validateSignupInput(String firstName, String lastName, String email, String password,
                                      String confirmPassword, CheckBox termsCheckBox) {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter your first and last name.");
            return false;
        }
        if (email.isEmpty() || !isValidEmail(email)) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter a valid email address.");
            return false;
        }
        if (password.length() < 8) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Password must be at least 8 characters long.");
            return false;
        }
        if (!password.equals(confirmPassword)) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Passwords do not match.");
            return false;
        }
        if (!termsCheckBox.isSelected()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please accept the terms and conditions.");
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}