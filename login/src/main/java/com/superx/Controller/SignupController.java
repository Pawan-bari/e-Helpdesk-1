package com.superx.Controller;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.CheckBox;

public class SignupController extends AuthController {
    
    private ViewController mainController;
    
    public SignupController(ViewController mainController) {
        this.mainController = mainController;
    }

    public void handleSignup(TextField emailField, PasswordField passwordField, 
                           PasswordField confirmPasswordField, CheckBox termsCheckBox) {
        String email = emailField.getText().trim();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (validateSignupInput(email, password, confirmPassword, termsCheckBox)) {
            if (signUp(email, password)) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Account created successfully!");
                mainController.showDocScene();
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Signup failed. Please try again.");
            }
        }
    }

    private boolean validateSignupInput(String email, String password, 
                                      String confirmPassword, CheckBox termsCheckBox) {
        if (email.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter your email.");
            return false;
        }
        if (!isValidEmail(email)) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter a valid email address.");
            return false;
        }
        if (password.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter a password.");
            return false;
        }
        if (password.length() < 6) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Password must be at least 6 characters long.");
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

    public void navigateToLogin() {
        mainController.showLoginScreen();
    }

    public void showTerms() {
        mainController.showTermsScene();
    }
}
