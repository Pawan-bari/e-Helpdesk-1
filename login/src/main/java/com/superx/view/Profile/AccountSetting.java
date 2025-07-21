package com.superx.view.Profile;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class AccountSetting {
     Stage accStage,profStage,secStage;
    Scene accScene,profScene,Secscene,notiScene;
    public void setAccStage(Stage accStage) {
        this.accStage = accStage;
    }

    public void setAccScene(Scene accScene) {
        this.accScene = accScene;
    }

   

    public BorderPane accountSettingsBox(Runnable showProfileScreen,Runnable showSecurityScreen,Runnable showDocScene,Runnable showNotification,Runnable showStorage) {

        BorderPane mainbox = new BorderPane();
        mainbox.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff); -fx-font-family: 'Inter', 'Segoe UI', sans-serif;");

        
        HBox welboxBar = new HBox(50);
        welboxBar.setPadding(new Insets(15, 40, 15, 40));
        welboxBar.setAlignment(Pos.CENTER_LEFT);
        welboxBar.setStyle("-fx-background-color: #f5f9ff; -fx-border-width: 0 0 1 0; -fx-border-color: #e0e7ff;");

        Label logoLabel = new Label("e-help Desk");
        logoLabel.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        logoLabel.setStyle("-fx-text-fill: #1e3a8a;");

        Region topSpacer = new Region();
        HBox.setHgrow(topSpacer, Priority.ALWAYS);

        Label welcomeLabel = new Label("Welcome Pawan");
        welcomeLabel.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        welcomeLabel.setStyle("-fx-text-fill: #4b5563;");

        welboxBar.getChildren().addAll(logoLabel, welcomeLabel);

        
        VBox iconbox = new VBox();
        iconbox.setPadding(new Insets(20, 15, 20, 15));
        iconbox.setSpacing(10);
        iconbox.setStyle("-fx-background-color: #f5f9ff;");
        iconbox.setAlignment(Pos.TOP_CENTER);

       
         VBox navButtons2 = new VBox(20);
        navButtons2.setAlignment(Pos.CENTER);
        String[][] navItems2 = {
            {"👤", ""}, {" 📄 ", ""}, {" 📜 ", ""},
            {" 🏠 ", ""}, {" ⇄ ", ""}, {" 📚 ", ""}
        };

        for (String[] item : navItems2) {
            Label icon = new Label(item[0]);
            icon.setStyle("-fx-font-size: 40px;");
            icon.setCursor(Cursor.HAND);
            if (item[0].equals("👤")) {
                icon.setStyle("-fx-font-size: 40px; -fx-text-fill: #3b82f6; -fx-effect: dropshadow(gaussian, rgba(59,130,246,0.5), 10, 0, 0, 0);");
                icon.setOnMouseClicked(event->{
                    
                });
            } else { 
                icon.setStyle("-fx-font-size: 40px; -fx-text-fill: #4b5563;");
                icon.setOnMouseEntered(e -> icon.setStyle("-fx-font-size: 40px; -fx-text-fill: #3b82f6; -fx-effect: dropshadow(gaussian, rgba(59,130,246,0.5), 10, 0, 0, 0);"));
                icon.setOnMouseExited(e -> icon.setStyle("-fx-font-size: 40px; -fx-text-fill: #4b5563;"));
                icon.setOnMouseClicked(event->{
                   
                });
            }
            navButtons2.getChildren().add(icon);
        }
        iconbox.getChildren().add(navButtons2);

        
        VBox probox = new VBox();
        probox.setPadding(new Insets(20, 15, 20, 15));
        probox.setSpacing(10);
        probox.setStyle("-fx-background-color: #f5f9ff; -fx-pref-width: 280px;");
        probox.setAlignment(Pos.TOP_CENTER);

       VBox navButtons = new VBox(8);
String[][] navItems = {
    {"👤", "Profile"},
    {"⚙️", "Account Setting"},
    {"🛡️", "Security"},
    {"🔔", "Notifications"},
    {"🏬", "Storage"}
};

for (String[] item : navItems) {
    Label icon = new Label(item[0]);
    icon.setStyle("-fx-font-size: 40px;");
    Label text = new Label(item[1]);

    HBox navBox = new HBox(15, icon, text);
    navBox.setAlignment(Pos.CENTER_LEFT);
    navBox.setCursor(Cursor.HAND);

    if (item[1].equals("Account Setting")) {
        
        text.setStyle("-fx-font-size: 15px; -fx-font-weight: 600; -fx-text-fill: #3b82f6;");
        navBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #e0e7ff;");
    } else {
        
                text.setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
       navBox.setOnMouseEntered(e -> navBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
                navBox.setOnMouseExited(e -> navBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
        if (item[1].equals("Profile")) {
            navBox.setOnMouseClicked(e -> showProfileScreen.run());
        } else if (item[1].equals("Security")) {
            navBox.setOnMouseClicked(e -> showSecurityScreen.run());
        } else if (item[1].equals("Notifications")) {
            navBox.setOnMouseClicked(e -> showNotification.run());
        } else {
            navBox.setOnMouseClicked(event-> showStorage.run());
        }
    }

    navButtons.getChildren().add(navBox);
}
    

        Region proboxSpacer = new Region();
        VBox.setVgrow(proboxSpacer, Priority.ALWAYS);
        probox.getChildren().addAll(navButtons, proboxSpacer);

        HBox leftSidebarContainer = new HBox(10, iconbox, probox);

        
        VBox mainContent = new VBox();
        mainContent.setPadding(new Insets(20, 40, 40, 40));
        mainContent.setSpacing(30);
        mainContent.setStyle("-fx-background-color: transparent;");

        Label contentTitle = new Label("Account Settings");
        contentTitle.setFont(Font.font("Inter", FontWeight.BOLD, 32));
        contentTitle.setStyle("-fx-text-fill: #1e3a8a; -fx-padding: 10px 0;");

        VBox emailCard = new VBox(20);
        emailCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px;");
        Label emailTitle = new Label("Change Email");
        emailTitle.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 20));
        emailTitle.setStyle("-fx-text-fill: #1e3a8a;");
        GridPane emailGrid = new GridPane();
        emailGrid.setHgap(20);
        emailGrid.setVgap(15);
        emailGrid.add(new Label("New Email Address"), 0, 0);
        emailGrid.add(new Label("Confirm Email"), 1, 0);
        emailGrid.getChildren().forEach(node -> node.setStyle("-fx-font-size: 14px; -fx-font-weight: 500; -fx-text-fill: #1e3a8a;"));
        TextField newEmailField = new TextField();
        newEmailField.setPrefWidth(300);
        newEmailField.setPromptText("Enter new email");
        newEmailField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        emailGrid.add(newEmailField, 0, 1);
        TextField confirmEmailField = new TextField();
        confirmEmailField.setPromptText("Confirm new email");
        confirmEmailField.setPrefWidth(300);
        confirmEmailField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        emailGrid.add(confirmEmailField, 1, 1);
        emailCard.getChildren().addAll(emailTitle, emailGrid);

        VBox passwordCard = new VBox(20);
        passwordCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px;");
        Label passwordTitle = new Label("Change Password");
        passwordTitle.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 20));
        passwordTitle.setStyle("-fx-text-fill: #1e3a8a;");
        GridPane passwordGrid = new GridPane();
        passwordGrid.setHgap(20);
        passwordGrid.setVgap(15);
        passwordGrid.add(new Label("Current Password"), 0, 0);
        passwordGrid.add(new Label("New Password"), 0, 2);
        passwordGrid.add(new Label("Confirm New Password"), 1, 2);
        passwordGrid.getChildren().forEach(node -> node.setStyle("-fx-font-size: 14px; -fx-font-weight: 500; -fx-text-fill: #1e3a8a;"));
        PasswordField currentPassField = new PasswordField();
        currentPassField.setPromptText("Enter current password");
        currentPassField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        GridPane.setColumnSpan(currentPassField, 2);
        passwordGrid.add(currentPassField, 0, 1);
        PasswordField newPassField = new PasswordField();
        newPassField.setPromptText("Enter new password");
        newPassField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        passwordGrid.add(newPassField, 0, 3);
        PasswordField confirmPassField = new PasswordField();
        confirmPassField.setPromptText("Confirm new password");
        confirmPassField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        passwordGrid.add(confirmPassField, 1, 3);
        passwordCard.getChildren().addAll(passwordTitle, passwordGrid);

        VBox mobileCard = new VBox(20);
        mobileCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px;");
        Label mobileTitle = new Label("Change Mobile Number");
        mobileTitle.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 20));
        mobileTitle.setStyle("-fx-text-fill: #1e3a8a;");
        TextField mobileField = new TextField();
        mobileField.setPromptText("Enter new mobile number");
        mobileField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        mobileCard.getChildren().addAll(mobileTitle, mobileField);

        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER_RIGHT);
        Button saveButton = new Button("Save All Changes");
        saveButton.setFont(Font.font("Inter", FontWeight.BOLD, 15));
        saveButton.setStyle("-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 10px; -fx-padding: 10px 25px;");
        saveButton.setCursor(Cursor.HAND);
        buttonBox.getChildren().add(saveButton);
        ;

        VBox deleteCard = new VBox(20);
        deleteCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px; -fx-border-color: #fca5a5; -fx-border-width: 1px; -fx-border-radius: 12px;");
        Label deleteTitle = new Label("Delete Account");
        deleteTitle.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        deleteTitle.setStyle("-fx-text-fill: #b91c1c;");
        Label deleteWarning = new Label("Once you delete your account, there is no going back. Please be certain.");
        deleteWarning.setStyle("-fx-text-fill: #4b5563;");
        Button deleteButton = new Button("Delete My Account");
        deleteButton.setFont(Font.font("Inter", FontWeight.BOLD, 15));
        deleteButton.setStyle("-fx-background-color: #dc2626; -fx-text-fill: white; -fx-background-radius: 10px; -fx-padding: 10px 25px;");
        deleteButton.setCursor(Cursor.HAND);
        HBox deleteButtonBox = new HBox(deleteButton);
        deleteButtonBox.setAlignment(Pos.CENTER_RIGHT);
        
        deleteCard.getChildren().addAll(deleteTitle, deleteWarning, deleteButtonBox);

        mainContent.getChildren().addAll(contentTitle, emailCard, passwordCard, mobileCard, buttonBox, deleteCard);

        ScrollPane scrollPane = new ScrollPane(mainContent);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent; -fx-background-insets: 0;");
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        mainbox.setLeft(leftSidebarContainer);
        mainbox.setCenter(scrollPane);
        mainbox.setTop(welboxBar);

        return mainbox;
    }
    

        

   
    
}

