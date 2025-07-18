package com.superx.Loginpages;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class signup {

    Scene signupScene,termsScene;
    Stage signupstage;

    public void setSignupScene(Scene signupScene) {
        this.signupScene = signupScene;
    }

    public void setSignupstage(Stage signupstage) {
        this.signupstage = signupstage;
    }

    public HBox signupBox(Runnable back) {
        BackgroundImage bg = new BackgroundImage(
                new Image("images/purple.png", 1920, 1080, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);

        DropShadow dp = new DropShadow();
        dp.setOffsetX(3.0);
        dp.setOffsetY(3.0);
        dp.setHeight(100);
        dp.setWidth(100);
        dp.setBlurType(BlurType.GAUSSIAN);
        dp.setColor(Color.rgb(146, 146, 146, 1));

        Rectangle signinBox = new Rectangle();
        signinBox.setArcHeight(100);
        signinBox.setArcWidth(100);
        signinBox.setHeight(900);
        signinBox.setWidth(800);
        signinBox.setFill(Color.rgb(247, 247, 251));
        signinBox.setEffect(dp);
        Image image = new Image(
                "images/Lucid_Realism_Modern_minimal_logo_design_for_an_EHelp_Desk_app_1-removebg-preview.png");
        ImageView iv = new ImageView(image);
        iv.setFitHeight(1000);
        iv.setFitWidth(900);
        VBox vBox = new VBox(iv);

        Label signinText = new Label("Sign up");
        signinText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 50));
        signinText.setAlignment(Pos.CENTER_LEFT);
        Label subtext = new Label("to your account");
        subtext.setFont(Font.font("arial", 10));
        subtext.setTextFill(Color.GREY);
        subtext.setAlignment(Pos.CENTER_LEFT);

        VBox vbtext = new VBox(10, signinText, subtext);

        Label emailLabel = new Label("Email");
        emailLabel.setFont(Font.font("arial", FontWeight.BOLD, 20));
        emailLabel.setAlignment(Pos.CENTER_LEFT);
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter Email");
        emailTextField.setMinHeight(50);
        emailTextField.setBorder(
                new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, new CornerRadii(5),
                        BorderWidths.DEFAULT)));

        VBox vbemail = new VBox(10, emailLabel, emailTextField);

        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(Font.font("arial", FontWeight.BOLD, 20));
        passwordLabel.setAlignment(Pos.CENTER_LEFT);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setMinHeight(50);
        passwordField.setBorder(
                new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, new CornerRadii(5),
                        BorderWidths.DEFAULT)));

        Label use8 = new Label("Use 8 or more character with a mix of letter,number & symbol");
        use8.setFont(Font.font("arial", 10));
        use8.setTextFill(Color.GREY);

        VBox vbpass = new VBox(10, passwordLabel, passwordField, use8);

        Label repeatPass = new Label("Repeat Password");
        repeatPass.setFont(Font.font("arial", FontWeight.BOLD, 20));
        repeatPass.setAlignment(Pos.CENTER_LEFT);

        PasswordField repePasswordField = new PasswordField();
        repePasswordField.setPromptText("Enter Password");
        repePasswordField.setMinHeight(50);
        repePasswordField.setBorder(
                new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, new CornerRadii(5),
                        BorderWidths.DEFAULT)));

        VBox vbrepass = new VBox(10, repeatPass, repePasswordField);

        CheckBox terms = new CheckBox();
        terms.setOnAction(event -> {

        });

        Label term = new Label("I accept the");
        term.setFont(Font.font("arial", FontWeight.BOLD, 10));
        term.setAlignment(Pos.CENTER_LEFT);

        Hyperlink termss = new Hyperlink("terms");
        termss.setOnAction(event -> {
                initializeterns();
                signupstage.setScene(termsScene);

        });

        HBox termsBox = new HBox(10, terms, term, termss);
        termsBox.setAlignment(Pos.CENTER_LEFT);
        Line line1 = new Line(0, 0, 300, 0);
        Line line2 = new Line(0, 0, 300, 0);
        HBox divider = new HBox(10, line1, new Text("Or with"), line2);
        divider.setAlignment(Pos.CENTER);

        Image image2 = new Image("images//Group 26.png");
        ImageView imageView = new ImageView(image2);

        Button signinwithgoogle = new Button("Sign Up with Google");
        signinwithgoogle.setMinHeight(40);
        signinwithgoogle.setGraphic(imageView);
        signinwithgoogle.setOnAction(event -> {

        });
        Image image3 = new Image("images//Vector (1).png");
        ImageView imageview2 = new ImageView(image3);
        Button mobileno = new Button("Sign Up with mobile NO");
        mobileno.setMinHeight(40);
        mobileno.setGraphic(imageview2);
        mobileno.setOnAction(event -> {

        });
        HBox hBox = new HBox(10, signinwithgoogle, mobileno);
        hBox.setAlignment(Pos.CENTER);

        Button signInButton = new Button("Sign Up");
        signInButton.setFont(Font.font("arial", FontWeight.BOLD, 20));
        signInButton.setStyle(
                "-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;");
        signInButton.setOnMouseEntered(e -> signInButton.setStyle(
                "-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;"));
        signInButton.setOnMouseExited(e -> signInButton.setStyle(
                "-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;"));
        signInButton.setAlignment(Pos.CENTER);
        signInButton.setMaxWidth(750);
        signInButton.setOnAction(event -> {

        });

        Text tx = new Text("Already have an Account?");
        tx.setFont(Font.font("arial", 10));
        tx.setFill(Color.GREY);
        Hyperlink signup = new Hyperlink("Sign In");
        signup.setOnAction(event -> {
            back.run();
        });

        HBox hBox2 = new HBox(10, tx, signup);
        hBox2.setAlignment(Pos.CENTER);

        VBox vbline = new VBox(10, vbrepass, termsBox, divider, hBox, signInButton, hBox2);

        VBox vb = new VBox(50, vbtext, vbemail, vbpass, vbline);
        // 20,signinText,subtext,emailLabel,emailTextField,passwordLabel,passwordField,forgotPassword,divider,hBox,signInButton,hBox2

        vb.setAlignment(Pos.CENTER_LEFT);
        vb.setPadding(new Insets(30));

        StackPane sp = new StackPane();

        sp.getChildren().addAll(signinBox, vb);
        sp.setPadding(new Insets(50, 50, 50, 50));
        HBox hb1 = new HBox(10);
        hb1.setBackground(new Background(bg));
        hb1.getChildren().addAll(vBox, sp);
        hb1.setPrefSize(1920, 1080);

        return hb1;

    }
    private void initializeterns(){
        terms page = new terms();
        page.setTermsScene(termsScene);
        termsScene = new Scene(page.termsBox(this::handle), 1920, 1080);
        page.setTermsStage(signupstage);
    }
    private void handle(){
        signupstage.setScene(signupScene);
    }
}
