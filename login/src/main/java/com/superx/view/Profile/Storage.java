package com.superx.view.Profile;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Storage {
        public void setStoStage(Stage stoStage) {
        this.stoStage = stoStage;
    }
    public void setStoScene(Scene stoScene) {
        this.stoScene = stoScene;
    }
        Stage stoStage;
        Scene stoScene;
    public BorderPane createStoragePage(Runnable showProfileScreen,Runnable showAccountScreen,Runnable showSecurityScreen, Runnable shownotification) {

        BorderPane mainbox = new BorderPane();
        mainbox.setStyle(
                "-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff); -fx-font-family: 'Inter', 'Segoe UI', sans-serif;");

        
        HBox welboxBar = new HBox(50);
        welboxBar.setPadding(new Insets(15, 40, 15, 40));
        welboxBar.setAlignment(Pos.CENTER_LEFT);
        welboxBar.setStyle(
                "-fx-background-color: #f5f9ff; -fx-border-width: 0 0 1 0; -fx-border-color: #e0e7ff;");

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
                { "👤", "" }, { " 📄 ", "" }, { " 📜 ", "" },
                { " 🏠 ", "" }, { " ⇄ ", "" }, { " 📚 ", "" }
        };

        for (String[] item : navItems2) {
            Label icon = new Label(item[0]);
            icon.setCursor(Cursor.HAND);
            if (item[0].equals("👤")) {
                icon.setStyle(
                        "-fx-font-size: 40px; -fx-text-fill: #3b82f6; -fx-effect: dropshadow(gaussian, rgba(59,130,246,0.5), 10, 0, 0, 0);");
            } else {
                icon.setStyle("-fx-font-size: 40px; -fx-text-fill: #4b5563;");
                icon.setOnMouseEntered(e -> icon.setStyle(
                        "-fx-font-size: 40px; -fx-text-fill: #3b82f6; -fx-effect: dropshadow(gaussian, rgba(59,130,246,0.5), 10, 0, 0, 0);"));
                icon.setOnMouseExited(e -> icon.setStyle("-fx-font-size: 40px; -fx-text-fill: #4b5563;"));
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
                { "🧑‍💼", "Profile" },
                { "⚙️", "Account Setting" },
                { "🛡️", "Security" },
                { "🔔", "Notifications" },
                { "🏬", "Storage" }
        };

        for (String[] item : navItems) {
            Label icon = new Label(item[0]);
            icon.setStyle("-fx-font-size: 40px;");
            Label text = new Label(item[1]);

            HBox navButton = new HBox(15, icon, text);
            navButton.setAlignment(Pos.CENTER_LEFT);
            navButton.setCursor(Cursor.HAND);

            if (item[1].equals("Storage")) {
                text.setStyle("-fx-font-size: 15px; -fx-font-weight: 600; -fx-text-fill: #3b82f6;");
                navButton.setStyle(
                        "-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #e0e7ff;");
            } else {
                text.setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
                navButton.setStyle(
                        "-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
                navButton.setOnMouseEntered(e -> navButton.setStyle(
                        "-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
                navButton.setOnMouseExited(e -> navButton.setStyle(
                        "-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
            }

             if (item[1].equals("Profile")) {
                navButton.setOnMouseClicked(event -> showProfileScreen.run());
            } else if (item[1].equals("Account Setting")) {
                navButton.setOnMouseClicked(event -> showAccountScreen.run());
            } else if (item[1].equals("Security")) {
                navButton.setOnMouseClicked(event -> showSecurityScreen.run());
            } else if (item[1].equals("Notifications")) {
                navButton.setOnMouseClicked(event-> shownotification.run());
            }
            navButtons.getChildren().add(navButton);
        }

        Region proboxSpacer = new Region();
        VBox.setVgrow(proboxSpacer, Priority.ALWAYS);
        probox.getChildren().addAll(navButtons, proboxSpacer);

        HBox leftSidebarContainer = new HBox(10, iconbox, probox);

        
        VBox mainContent = new VBox();
        mainContent.setPadding(new Insets(20, 40, 40, 40));
        mainContent.setSpacing(30);
        mainContent.setStyle("-fx-background-color: transparent;");

        Label contentTitle = new Label("Storage Settings");
        contentTitle.setFont(Font.font("Inter", FontWeight.BOLD, 32));
        contentTitle.setStyle("-fx-text-fill: #1e3a8a; -fx-padding: 10px 0;");

        
        VBox storageSettingsCard = new VBox(15);
        storageSettingsCard.setPadding(new Insets(20));
        storageSettingsCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-background-radius: 10px;");

        Label uploadTitleLabel = new Label("Upload Settings");
        uploadTitleLabel.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        uploadTitleLabel.setStyle("-fx-text-fill: #1e3a8a;");

        
        HBox itemBox1 = new HBox();
        itemBox1.setAlignment(Pos.CENTER_LEFT);
        itemBox1.setPadding(new Insets(10, 0, 10, 0));
        VBox textBox1 = new VBox(4);
        Label titleLabel1 = new Label("Allow PDF Only");
        titleLabel1.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 16));
        titleLabel1.setStyle("-fx-text-fill: #374151;");
        Label descLabel1 = new Label("Restrict all file uploads to PDF format for better security.");
        descLabel1.setFont(Font.font("Inter", FontWeight.NORMAL, 13));
        descLabel1.setStyle("-fx-text-fill: #6b7280;");
        descLabel1.setWrapText(true);
        textBox1.getChildren().addAll(titleLabel1, descLabel1);
        Region spacer1 = new Region();
        HBox.setHgrow(spacer1, Priority.ALWAYS);
        
        
        BooleanProperty selected1 = new SimpleBooleanProperty();
        HBox toggle1 = new HBox();
        Label toggleLabel1 = new Label();
        toggleLabel1.setFont(Font.font("Inter", FontWeight.BOLD, 10));
        Button toggleButton1 = new Button();
        toggle1.getChildren().addAll(toggleLabel1, toggleButton1);
        toggle1.setCursor(Cursor.HAND);
        toggleButton1.setCursor(Cursor.HAND);
        toggle1.setMinSize(50, 25);
        toggle1.setMaxSize(50, 25);
        toggle1.setPadding(new Insets(2));
        toggleButton1.setPrefSize(21, 21);
        toggleButton1.setMinSize(21, 21);
        toggleButton1.setMaxSize(21, 21);
        toggleButton1.setStyle("-fx-background-radius: 25; -fx-background-color: white;");
        selected1.addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                toggleLabel1.setText("ON");
                toggle1.setStyle("-fx-background-color: #3b82f6; -fx-background-radius: 25;");
                toggleLabel1.setStyle("-fx-text-fill: white;");
                toggle1.setAlignment(Pos.CENTER_RIGHT);
            } else {
                toggleLabel1.setText("OFF");
                toggle1.setStyle("-fx-background-color: #d1d5db; -fx-background-radius: 25;");
                toggleLabel1.setStyle("-fx-text-fill: #4b5563;");
                toggle1.setAlignment(Pos.CENTER_LEFT);
            }
        });
        toggle1.setOnMouseClicked(event -> selected1.set(!selected1.get()));
        toggleButton1.setOnMouseClicked(event -> selected1.set(!selected1.get()));
        selected1.set(false); 
        
        itemBox1.getChildren().addAll(textBox1, spacer1, toggle1);

        
        HBox itemBox2 = new HBox();
        itemBox2.setAlignment(Pos.CENTER_LEFT);
        itemBox2.setPadding(new Insets(10, 0, 10, 0));
        VBox textBox2 = new VBox(4);
        Label titleLabel2 = new Label("Enable Cloud Sync");
        titleLabel2.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 16));
        titleLabel2.setStyle("-fx-text-fill: #374151;");
        Label descLabel2 = new Label("Automatically back up your documents to a secure cloud.");
        descLabel2.setFont(Font.font("Inter", FontWeight.NORMAL, 13));
        descLabel2.setStyle("-fx-text-fill: #6b7280;");
        descLabel2.setWrapText(true);
        textBox2.getChildren().addAll(titleLabel2, descLabel2);
        Region spacer2 = new Region();
        HBox.setHgrow(spacer2, Priority.ALWAYS);

        
        BooleanProperty selected2 = new SimpleBooleanProperty();
        HBox toggle2 = new HBox();
        Label toggleLabel2 = new Label();
        toggleLabel2.setFont(Font.font("Inter", FontWeight.BOLD, 10));
        Button toggleButton2 = new Button();
        toggle2.getChildren().addAll(toggleLabel2, toggleButton2);
        toggle2.setCursor(Cursor.HAND);
        toggleButton2.setCursor(Cursor.HAND);
        toggle2.setMinSize(50, 25);
        toggle2.setMaxSize(50, 25);
        toggle2.setPadding(new Insets(2));
        toggleButton2.setPrefSize(21, 21);
        toggleButton2.setMinSize(21, 21);
        toggleButton2.setMaxSize(21, 21);
        toggleButton2.setStyle("-fx-background-radius: 25; -fx-background-color: white;");
        selected2.addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                toggleLabel2.setText("ON");
                toggle2.setStyle("-fx-background-color: #3b82f6; -fx-background-radius: 25;");
                toggleLabel2.setStyle("-fx-text-fill: white;");
                toggle2.setAlignment(Pos.CENTER_RIGHT);
            } else {
                toggleLabel2.setText("OFF");
                toggle2.setStyle("-fx-background-color: #d1d5db; -fx-background-radius: 25;");
                toggleLabel2.setStyle("-fx-text-fill: #4b5563;");
                toggle2.setAlignment(Pos.CENTER_LEFT);
            }
        });
        toggle2.setOnMouseClicked(event -> selected2.set(!selected2.get()));
        toggleButton2.setOnMouseClicked(event -> selected2.set(!selected2.get()));
        selected2.set(true); 
        
        itemBox2.getChildren().addAll(textBox2, spacer2, toggle2);
        
        storageSettingsCard.getChildren().addAll(uploadTitleLabel, itemBox1, itemBox2);
        
        
        VBox retentionSettingsCard = new VBox(15);
        retentionSettingsCard.setPadding(new Insets(20));
        retentionSettingsCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-background-radius: 10px;");

        Label retentionTitleLabel = new Label("Data Retention");
        retentionTitleLabel.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        retentionTitleLabel.setStyle("-fx-text-fill: #1e3a8a;");

        
        HBox itemBox3 = new HBox();
        itemBox3.setAlignment(Pos.CENTER_LEFT);
        itemBox3.setPadding(new Insets(10, 0, 10, 0));
        VBox textBox3 = new VBox(4);
        Label titleLabel3 = new Label("Auto-Delete After 1 Year");
        titleLabel3.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 16));
        titleLabel3.setStyle("-fx-text-fill: #374151;");
        Label descLabel3 = new Label("Automatically delete documents that are older than one year.");
        descLabel3.setFont(Font.font("Inter", FontWeight.NORMAL, 13));
        descLabel3.setStyle("-fx-text-fill: #6b7280;");
        descLabel3.setWrapText(true);
        textBox3.getChildren().addAll(titleLabel3, descLabel3);
        Region spacer3 = new Region();
        HBox.setHgrow(spacer3, Priority.ALWAYS);

        
        BooleanProperty selected3 = new SimpleBooleanProperty();
        HBox toggle3 = new HBox();
        Label toggleLabel3 = new Label();
        toggleLabel3.setFont(Font.font("Inter", FontWeight.BOLD, 10));
        Button toggleButton3 = new Button();
        toggle3.getChildren().addAll(toggleLabel3, toggleButton3);
        toggle3.setCursor(Cursor.HAND);
        toggleButton3.setCursor(Cursor.HAND);
        toggle3.setMinSize(50, 25);
        toggle3.setMaxSize(50, 25);
        toggle3.setPadding(new Insets(2));
        toggleButton3.setPrefSize(21, 21);
        toggleButton3.setMinSize(21, 21);
        toggleButton3.setMaxSize(21, 21);
        toggleButton3.setStyle("-fx-background-radius: 25; -fx-background-color: white;");
        selected3.addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                toggleLabel3.setText("ON");
                toggle3.setStyle("-fx-background-color: #3b82f6; -fx-background-radius: 25;");
                toggleLabel3.setStyle("-fx-text-fill: white;");
                toggle3.setAlignment(Pos.CENTER_RIGHT);
            } else {
                toggleLabel3.setText("OFF");
                toggle3.setStyle("-fx-background-color: #d1d5db; -fx-background-radius: 25;");
                toggleLabel3.setStyle("-fx-text-fill: #4b5563;");
                toggle3.setAlignment(Pos.CENTER_LEFT);
            }
        });
        toggle3.setOnMouseClicked(event -> selected3.set(!selected3.get()));
        toggleButton3.setOnMouseClicked(event -> selected3.set(!selected3.get()));
        selected3.set(false); 
        
        itemBox3.getChildren().addAll(textBox3, spacer3, toggle3);

        
        HBox itemBox4 = new HBox();
        itemBox4.setAlignment(Pos.CENTER_LEFT);
        itemBox4.setPadding(new Insets(10, 0, 10, 0));
        VBox textBox4 = new VBox(4);
        Label titleLabel4 = new Label("Clear Cache on Exit");
        titleLabel4.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 16));
        titleLabel4.setStyle("-fx-text-fill: #374151;");
        Label descLabel4 = new Label("Automatically clear temporary files when you close the application.");
        descLabel4.setFont(Font.font("Inter", FontWeight.NORMAL, 13));
        descLabel4.setStyle("-fx-text-fill: #6b7280;");
        descLabel4.setWrapText(true);
        textBox4.getChildren().addAll(titleLabel4, descLabel4);
        Region spacer4 = new Region();
        HBox.setHgrow(spacer4, Priority.ALWAYS);

        
        BooleanProperty selected4 = new SimpleBooleanProperty();
        HBox toggle4 = new HBox();
        Label toggleLabel4 = new Label();
        toggleLabel4.setFont(Font.font("Inter", FontWeight.BOLD, 10));
        Button toggleButton4 = new Button();
        toggle4.getChildren().addAll(toggleLabel4, toggleButton4);
        toggle4.setCursor(Cursor.HAND);
        toggleButton4.setCursor(Cursor.HAND);
        toggle4.setMinSize(50, 25);
        toggle4.setMaxSize(50, 25);
        toggle4.setPadding(new Insets(2));
        toggleButton4.setPrefSize(21, 21);
        toggleButton4.setMinSize(21, 21);
        toggleButton4.setMaxSize(21, 21);
        toggleButton4.setStyle("-fx-background-radius: 25; -fx-background-color: white;");
        selected4.addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                toggleLabel4.setText("ON");
                toggle4.setStyle("-fx-background-color: #3b82f6; -fx-background-radius: 25;");
                toggleLabel4.setStyle("-fx-text-fill: white;");
                toggle4.setAlignment(Pos.CENTER_RIGHT);
            } else {
                toggleLabel4.setText("OFF");
                toggle4.setStyle("-fx-background-color: #d1d5db; -fx-background-radius: 25;");
                toggleLabel4.setStyle("-fx-text-fill: #4b5563;");
                toggle4.setAlignment(Pos.CENTER_LEFT);
            }
        });
        toggle4.setOnMouseClicked(event -> selected4.set(!selected4.get()));
        toggleButton4.setOnMouseClicked(event -> selected4.set(!selected4.get()));
        selected4.set(true); 
        
        itemBox4.getChildren().addAll(textBox4, spacer4, toggle4);
        
        retentionSettingsCard.getChildren().addAll(retentionTitleLabel, itemBox3, itemBox4);

        
        VBox documentsCard = new VBox(15);
        documentsCard.setPadding(new Insets(20));
        documentsCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-background-radius: 10px;");

        Label documentsTitle = new Label("Your Documents");
        documentsTitle.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        documentsTitle.setStyle("-fx-text-fill: #1e3a8a;");

        GridPane documentGrid = new GridPane();
        documentGrid.setHgap(20);
        documentGrid.setVgap(15);
        documentGrid.setPadding(new Insets(10, 0, 0, 0));

        String headerStyle = "-fx-font-size: 14px; -fx-font-weight: 600; -fx-text-fill: #4b5563;";
        documentGrid.add(new Label("NAME"), 1, 0);
        documentGrid.add(new Label("UPLOAD TYPE"), 2, 0);
        documentGrid.add(new Label("DATE"), 3, 0);
        documentGrid.add(new Label("LEGAL TYPE"), 4, 0);
        documentGrid.add(new Label("ACTIONS"), 5, 0);
        documentGrid.getChildren().forEach(node -> node.setStyle(headerStyle));

        
        Object[][] docData = {
                { "📄", "Aadhar-Card.pdf", "Manual Upload", "20 Jul, 2025", "Identity", "View" },
                { "📄", "Case-File-001.pdf", "Case Sync", "18 Jul, 2025", "Case File", "View" },
                { "📄", "Passport.jpg", "Manual Upload", "15 Jun, 2025", "Identity", "View" },
                { "📄", "Property-Deed.pdf", "Manual Upload", "02 May, 2025", "Property", "View" }
        };

        for (int i = 0; i < docData.length; i++) {
            int row = i + 1;
            Label icon = new Label((String) docData[i][0]);
            icon.setFont(Font.font(20));
            documentGrid.add(icon, 0, row);

            Label name = new Label((String) docData[i][1]);
            name.setStyle("-fx-font-weight: 500;");
            documentGrid.add(name, 1, row);

            documentGrid.add(new Label((String) docData[i][2]), 2, row);
            documentGrid.add(new Label((String) docData[i][3]), 3, row);

            Label legalType = new Label((String) docData[i][4]);
            legalType.setStyle(
                    "-fx-background-color: #e0e7ff; -fx-text-fill: #3730a3; -fx-padding: 3px 8px; -fx-background-radius: 5px; -fx-font-weight: 500;");
            documentGrid.add(legalType, 4, row);

            Button viewButton = new Button("View");
            viewButton.setCursor(Cursor.HAND);
            documentGrid.add(viewButton, 5, row);
        }

        documentsCard.getChildren().addAll(documentsTitle, documentGrid);

        mainContent.getChildren().addAll(contentTitle, storageSettingsCard, retentionSettingsCard, documentsCard);

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