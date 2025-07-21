package com.superx.view.Loginpages;



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
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class forgot {

    private Scene forgotScene;
    private Stage forgotStage;
    public com.superx.Controller.ViewController mainController;

    public void setForgotScene(Scene forgotScene) {
        this.forgotScene = forgotScene;
    }

    public void setForgotStage(Stage forgotStage) {
        this.forgotStage = forgotStage;
    }
    

    public HBox forgotBox(Runnable showlogin,com.superx.Controller.ViewController controller) {
        this.mainController = controller;
        
        BackgroundImage bg = new BackgroundImage(
                new Image("images/green.png", 1920, 1080, false, true),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);

        
        DropShadow dp = new DropShadow(BlurType.GAUSSIAN, Color.rgb(146, 146, 146), 10, 0.5, 3, 3);

        Rectangle card = new Rectangle(800, 700);
        card.setArcHeight(100);
        card.setArcWidth(100);
        card.setFill(Color.rgb(247, 247, 251));
        card.setEffect(dp);

        
        Image image = new Image("images/Lucid_Realism_Modern_minimal_logo_design_for_an_EHelp_Desk_app_1-removebg-preview.png");
        ImageView logo = new ImageView(image);
        logo.setFitHeight(1000);
        logo.setFitWidth(900);
        VBox logoBox = new VBox(logo);

        
        Label title = new Label("Forgot Password?");
        title.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 50));

        Label subtitle = new Label("Enter your email to reset Password");
        subtitle.setFont(Font.font("Arial", 10));
        subtitle.setTextFill(Color.GREY);

        VBox titleBox = new VBox(10, title, subtitle);

        Label emailLabel = new Label("Email");
        emailLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        TextField emailField = new TextField();
        emailField.setPromptText("Enter Email");
        emailField.setMinHeight(50);
        emailField.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID,
                new CornerRadii(5), BorderWidths.DEFAULT)));

        VBox emailBox = new VBox(10, emailLabel, emailField);

        
        Button submitButton = new Button("Submit");
        submitButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        submitButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-background-radius: 10;");
        submitButton.setOnMouseEntered(e -> submitButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-background-radius: 10;"));
        submitButton.setOnMouseExited(e -> submitButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-background-radius: 10;"));
        submitButton.setMaxWidth(200);
        submitButton.setOnAction(event->{
             controller.getForgotPasswordController().handlePasswordReset(emailField);
        });

        Button cancelButton = new Button("Cancel");
        cancelButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        cancelButton.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-background-radius: 10;");
        cancelButton.setOnMouseEntered(e -> cancelButton.setStyle("-fx-background-color: #cccccc; -fx-text-fill: black; -fx-background-radius: 10;"));
        cancelButton.setOnMouseExited(e -> cancelButton.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-background-radius: 10;"));
        cancelButton.setMaxWidth(200);
        

        HBox buttonRow = new HBox(50, submitButton, cancelButton);
        buttonRow.setAlignment(Pos.CENTER_LEFT);

        VBox formGroup = new VBox(50, titleBox, emailBox, buttonRow);
        formGroup.setPadding(new Insets(30));
        formGroup.setAlignment(Pos.CENTER_LEFT);

        StackPane formOverlay = new StackPane(card, formGroup);
        formOverlay.setPadding(new Insets(50));

        HBox root = new HBox(10, logoBox, formOverlay);
        root.setBackground(new Background(bg));
        root.setPrefSize(1920, 1080);

        return root;
    }
}
