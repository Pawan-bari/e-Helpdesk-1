package com.superx.view.Profile;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
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

public class ProfilePage {

    public void setProfStage(Stage profStage) {
        this.profStage = profStage;
    }

    public void setProfScene(Scene profScene) {
        this.profScene = profScene;
    }

    Stage profStage,accStage,SecStage,notiStage;
    Scene profScene,accScene,Secscene,notiScene;

    public BorderPane profilebox(Runnable showAccountScreen,Runnable showSecurityScreen, Runnable showDocScene,Runnable showNotification,Runnable showStorage) {

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
                   showDocScene.run();
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

            HBox navButton = new HBox(15, icon, text);
            navButton.setAlignment(Pos.CENTER_LEFT);
            navButton.setCursor(Cursor.HAND);

            if (item[1].equals("Profile")) {
                text.setStyle("-fx-font-size: 15px; -fx-font-weight: 600; -fx-text-fill: #3b82f6;");
                navButton.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #e0e7ff;");
            } else {
                text.setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
                navButton.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
                navButton.setOnMouseEntered(e -> navButton.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
                navButton.setOnMouseExited(e -> navButton.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
                
            }

            if (item[1].equals("Account Setting")) {
                   navButton.setOnMouseClicked(event ->{
                    showAccountScreen.run();
                   });
                } else if (item[1].equals("Security")) {
                    navButton.setOnMouseClicked(event->{
                        showSecurityScreen.run();
                    });
                   
                }else if (item[1].equals("Notifications")){
                        navButton.setOnMouseClicked(event->{
                            showNotification.run();
                        });
                }else {
                    navButton.setOnMouseClicked(event->{
                        showStorage.run();
                    });
                }
            navButtons.getChildren().add(navButton);
        }

        Region proboxSpacer = new Region();
        VBox.setVgrow(proboxSpacer, Priority.ALWAYS);
        probox.getChildren().addAll( navButtons, proboxSpacer);

        
        HBox leftSidebarContainer = new HBox(10,iconbox, probox);

        
        VBox mainContent = new VBox();
        mainContent.setPadding(new Insets(20, 40, 40, 40));
        mainContent.setSpacing(30);
        mainContent.setStyle("-fx-background-color: transparent;");

        Label contentTitle = new Label("Profile Settings");
        contentTitle.setFont(Font.font("Inter", FontWeight.BOLD, 32));
        contentTitle.setStyle("-fx-text-fill: #1e3a8a; -fx-padding: 10px 0;");

        VBox profileCard = new VBox(25);
        profileCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px;");

        HBox profilePicBox = new HBox(20);
        profilePicBox.setAlignment(Pos.CENTER_LEFT);
        Label profileIcon = new Label("👤");
        profileIcon.setFont(Font.font("System", 64));

        Button changePicBtn = new Button("Change");
        changePicBtn.setCursor(Cursor.HAND);
        changePicBtn.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 14));
        changePicBtn.setStyle("-fx-background-color: #d1d5db; -fx-background-radius: 8px; -fx-text-fill: #1f2937; -fx-padding: 5px 15px;");

        Button removePicBtn = new Button("Remove");
        removePicBtn.setCursor(Cursor.HAND);
        removePicBtn.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 14));
        removePicBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #ef4444; -fx-padding: 5px 15px;");

        VBox picButtons = new VBox(8, changePicBtn, removePicBtn);
        profilePicBox.getChildren().addAll(profileIcon, picButtons);

        GridPane profileGrid = new GridPane();
        profileGrid.setHgap(20);
        profileGrid.setVgap(15);

        profileGrid.add(new Label("First Name"), 0, 0);
        profileGrid.add(new Label("Last Name"), 1, 0);
        profileGrid.getChildren().forEach(node -> node.setStyle("-fx-font-size: 14px; -fx-font-weight: 500; -fx-text-fill: #1e3a8a;"));

        TextField fNameField = new TextField();
        fNameField.setPrefWidth(300);
        fNameField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        profileGrid.add(fNameField, 0, 1);

        TextField lNameField = new TextField();
        lNameField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        profileGrid.add(lNameField, 1, 1);

        Label emailLabel = new Label("Email Address");
        emailLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: 500; -fx-text-fill: #1e3a8a;");
        TextField emailField = new TextField();
        emailField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        GridPane.setColumnSpan(emailField, 2);
        profileGrid.add(emailLabel, 0, 2);
        profileGrid.add(emailField, 0, 3);

        Label mobileLabel = new Label("Mobile Number");
        mobileLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: 500; -fx-text-fill: #1e3a8a;");
        TextField mobileField = new TextField();
        mobileField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        GridPane.setColumnSpan(mobileField, 2);
        profileGrid.add(mobileLabel, 0, 4);
        profileGrid.add(mobileField, 0, 5);

        Label aboutLabel = new Label("About");
        aboutLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: 500; -fx-text-fill: #1e3a8a;");
        TextArea aboutArea = new TextArea();
        aboutArea.setWrapText(true);
        aboutArea.setPrefRowCount(4);
        aboutArea.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 8px;");
        GridPane.setColumnSpan(aboutArea, 2);
        profileGrid.add(aboutLabel, 0, 6);
        profileGrid.add(aboutArea, 0, 7);

        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER_RIGHT);
        Button saveButton = new Button("Save Changes");
        saveButton.setFont(Font.font("Inter", FontWeight.BOLD, 15));
        saveButton.setStyle("-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 10px; -fx-padding: 10px 25px;");
        saveButton.setOnMouseEntered(e -> saveButton.setStyle("-fx-background-color: #2563eb; -fx-text-fill: white; -fx-background-radius: 10px; -fx-padding: 10px 25px;"));
        saveButton.setOnMouseExited(e -> saveButton.setStyle("-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 10px; -fx-padding: 10px 25px;"));
        saveButton.setCursor(Cursor.HAND);
        saveButton.setOnAction(e -> System.out.println("Profile Saved!"));
        buttonBox.getChildren().add(saveButton);

        profileCard.getChildren().addAll(profilePicBox, profileGrid, buttonBox);

        VBox historyCard = new VBox(20);
        historyCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px;");

        Label historyTitle = new Label("Login History");
        historyTitle.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 20));
        historyTitle.setStyle("-fx-text-fill: #1e3a8a;");

        GridPane historyGrid = new GridPane();
        historyGrid.setHgap(40);
        historyGrid.setVgap(15);
        historyGrid.add(new Label("Total No. of Document"), 0, 0);
        historyGrid.add(new Label("Joined"), 1, 0);
        historyGrid.getChildren().forEach(node -> node.setStyle("-fx-font-size: 14px; -fx-font-weight: 600; -fx-text-fill: #4b5563;"));

        String[][] historyData = {
            {"Aadhar card", "1 month ago"},
            {"Passport", "5 days ago"},
            {"Pan Card", ""}
        };

        for (int i = 0; i < historyData.length; i++) {
            historyGrid.add(new Label(historyData[i][0]), 0, i + 1);
            historyGrid.add(new Label(historyData[i][1]), 1, i + 1);
        }

        historyCard.getChildren().addAll(historyTitle, historyGrid);
        mainContent.getChildren().addAll(contentTitle, profileCard, historyCard);

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
