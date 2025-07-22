package com.superx.view.Loginpages;

import com.superx.Controller.SignupController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class signup {

    public HBox signupBox(com.superx.Controller.ViewController controller) {

        BackgroundImage bg = new BackgroundImage(
                new Image("images/purple.png", 1920, 1080, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);

        DropShadow dp = new DropShadow(BlurType.GAUSSIAN, Color.rgb(146, 146, 146), 10, 0.5, 3, 3);

        Rectangle signupBox = new Rectangle(800, 900);
        signupBox.setArcHeight(100);
        signupBox.setArcWidth(100);
        signupBox.setFill(Color.rgb(247, 247, 251));
        signupBox.setEffect(dp);

        ImageView logo = new ImageView(new Image(
                "images/logo.png"));
        logo.setFitHeight(900);
        logo.setFitWidth(750);

        VBox logoBox = new VBox(logo);

        Label title = new Label("Sign Up");
        title.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 40));
        Label subtitle = new Label("to create your account");
        subtitle.setFont(Font.font("Arial", 10));
        subtitle.setTextFill(Color.GREY);
        VBox textBlock = new VBox(5, title, subtitle);

        Label fNameLabel = new Label("First Name");
        fNameLabel.setFont(Font.font("arial", FontWeight.BOLD, 16));
        TextField fNameField = new TextField();
        fNameField.setPromptText("Enter First Name");
        fNameField.setMinHeight(40);
        VBox vbFName = new VBox(5, fNameLabel, fNameField);

        Label lNameLabel = new Label("Last Name");
        lNameLabel.setFont(Font.font("arial", FontWeight.BOLD, 16));
        TextField lNameField = new TextField();
        lNameField.setPromptText("Enter Last Name");
        lNameField.setMinHeight(40);
        VBox vbLName = new VBox(5, lNameLabel, lNameField);

        HBox nameBox = new HBox(20, vbFName, vbLName);

        Label emailLabel = new Label("Email");
        emailLabel.setFont(Font.font("arial", FontWeight.BOLD, 16));
        TextField emailField = new TextField();
        emailField.setPromptText("Enter Email");
        emailField.setMinHeight(40);
        VBox vbEmail = new VBox(5, emailLabel, emailField);

        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(Font.font("arial", FontWeight.BOLD, 16));
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setMinHeight(40);
        Label guideTx = new Label("Use 8 or more characters with a mix of letters, numbers & symbols");
        guideTx.setFont(Font.font("arial", 10));
        guideTx.setTextFill(Color.GREY);
        VBox vbPass = new VBox(5, passwordLabel, passwordField, guideTx);

        Label repeatLabel = new Label("Repeat Password");
        repeatLabel.setFont(Font.font("arial", FontWeight.BOLD, 16));
        PasswordField repeatPasswordField = new PasswordField();
        repeatPasswordField.setPromptText("Enter Password Again");
        repeatPasswordField.setMinHeight(40);
        VBox vbRepeat = new VBox(5, repeatLabel, repeatPasswordField);

        CheckBox termsBox = new CheckBox();
        Label termsLabel = new Label("I accept the");
        termsLabel.setFont(Font.font("arial", FontWeight.BOLD, 10));
        Hyperlink termsLink = new Hyperlink("terms");
        termsLink.setOnAction(e -> controller.showTermsScene());
        HBox termsAgreement = new HBox(10, termsBox, termsLabel, termsLink);
        termsAgreement.setAlignment(Pos.CENTER_LEFT);

        Line line1 = new Line(0, 0, 300, 0);
        Line line2 = new Line(0, 0, 300, 0);
        HBox divider = new HBox(10, line1, new Text("Or"), line2);
        divider.setAlignment(Pos.CENTER);

        ImageView googleIcon = new ImageView(new Image("images/Group 26.png"));
        Button googleButton = new Button("Sign Up with Google", googleIcon);
        googleButton.setMinHeight(40);

        HBox altSignup = new HBox(10, googleButton);
        altSignup.setAlignment(Pos.CENTER);

        Button signupBtn = new Button("Sign Up");
        signupBtn.setFont(Font.font("arial", FontWeight.BOLD, 20));
        signupBtn.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-background-radius: 10;");
        signupBtn.setAlignment(Pos.CENTER);
        signupBtn.setMaxWidth(750);

        signupBtn.setOnAction(event -> {
            SignupController signupController = controller.getSignupController();
            signupController.handleSignup(
                    fNameField,
                    lNameField,
                    emailField,
                    passwordField,
                    repeatPasswordField,
                    termsBox);
        });

        Text loginQuestion = new Text("Already have an account?");
        loginQuestion.setFont(Font.font("arial", 10));
        loginQuestion.setFill(Color.GREY);
        Hyperlink loginLink = new Hyperlink("Sign In");
        loginLink.setTextFill(Color.BLUE);
        loginLink.setOnAction(e -> controller.showLoginScreen());
        HBox loginPrompt = new HBox(10, loginQuestion, loginLink);
        loginPrompt.setAlignment(Pos.CENTER);

        VBox formGroup = new VBox(15, vbRepeat, termsAgreement, signupBtn, loginPrompt, divider, altSignup);

        VBox signupForm = new VBox(20, textBlock, nameBox, vbEmail, vbPass, formGroup);
        signupForm.setAlignment(Pos.CENTER_LEFT);
        signupForm.setPadding(new Insets(30));

        StackPane sp = new StackPane(signupBox, signupForm);
        sp.setPadding(new Insets(50));

        HBox root = new HBox(10, logoBox, sp);
        root.setBackground(new Background(bg));
        root.setPrefSize(1920, 1080);
        root.setAlignment(Pos.CENTER);

        return root;
    }
}