package com.superx.Loginpages;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class forgot {

    Scene forgotScene;
    Stage forgotStage;

    public void setForgotScene(Scene forgotScene) {
        this.forgotScene = forgotScene;
    }

    public void setForgotStage(Stage forgotStage) {
        this.forgotStage = forgotStage;
    }

    public HBox forgotBox(Runnable backRunnable) {
        BackgroundImage bg = new BackgroundImage(
                new Image("images/green.png", 1920, 1080, false, true),
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
        signinBox.setHeight(700);
        signinBox.setWidth(800);
        signinBox.setFill(Color.rgb(247, 247, 251));
        signinBox.setEffect(dp);
        Image image = new Image(
                "images/Lucid_Realism_Modern_minimal_logo_design_for_an_EHelp_Desk_app_1-removebg-preview.png");
        ImageView iv = new ImageView(image);
        iv.setFitHeight(1000);
        iv.setFitWidth(900);
        VBox vBox = new VBox(iv);

        Label signinText = new Label("Forgot Password ?");
        signinText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 50));
        signinText.setAlignment(Pos.CENTER_LEFT);
        Label subtext = new Label("Enter your email to reset Password");
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

        Button signInButton = new Button("Submit");
        signInButton.setFont(Font.font("arial", FontWeight.BOLD, 20));
        signInButton.setStyle(
                "-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;");
        signInButton.setOnMouseEntered(e -> signInButton.setStyle(
                "-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;"));
        signInButton.setOnMouseExited(e -> signInButton.setStyle(
                "-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;"));
        signInButton.setAlignment(Pos.CENTER);
        signInButton.setMaxWidth(200);
        signInButton.setOnAction(event -> {

        });

        Button cancel = new Button("Cancel");
        cancel.setFont(Font.font("arial", FontWeight.BOLD, 20));
        cancel.setTextFill(Color.BLACK);
        cancel.setMaxWidth(200);
        
        cancel.setStyle(
                "-fx-background-color: #ffffffff;  -fx-padding: 10 20 10 20; -fx-background-radius: 10;");
        cancel.setOnMouseEntered(e -> cancel.setStyle(
                "-fx-background-color: #949eaaff;  -fx-padding: 10 20 10 20; -fx-background-radius: 10;"));
        cancel.setOnMouseExited(e -> cancel.setStyle(
                "-fx-background-color: #ffffffff;  -fx-padding: 10 20 10 20; -fx-background-radius: 10;"));
        cancel.setOnAction(event -> {
            backRunnable.run();
        });

        HBox vbline = new HBox(50, signInButton, cancel);
        vbline.setAlignment(Pos.CENTER_LEFT);

        VBox vb = new VBox(50, vbtext, vbemail, vbline);
        

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
}
