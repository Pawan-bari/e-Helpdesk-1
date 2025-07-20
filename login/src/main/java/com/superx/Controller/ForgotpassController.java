package com.superx.Controller;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ForgotpassController extends AuthController {
    
    private ViewController mainController;
    
    public ForgotpassController(ViewController mainController) {
        this.mainController = mainController;
    }

    public void handlePasswordReset(TextField emailField) {
        String email = emailField.getText().trim();

        if (validateEmail(email)) {
            if (resetPassword(email)) {
                showAlert(Alert.AlertType.INFORMATION, "Success", 
                         "Password reset email has been sent to your email address.");
                mainController.showLoginScreen();
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", 
                         "Failed to send password reset email. Please check your email address.");
            }
        }
    }

    private boolean validateEmail(String email) {
        if (email.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter your email address.");
            return false;
        }
        if (!isValidEmail(email)) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter a valid email address.");
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
}
