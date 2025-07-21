package com.superx.view.landRecords.archive;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

public class legalArchives {

    Stage legalStage;
    Scene legalScene;

    public void setLegalStage(Stage legalStage) {
        this.legalStage = legalStage;
    }

    public void setLegalScene(Scene legalScene) {
        this.legalScene = legalScene;
    }

    public BorderPane legalbox(Runnable showProfileScreen, Runnable showLoginScreen, Runnable showdoc,Runnable showland,Runnable showrti) {

        BorderPane mainbox = new BorderPane();
        mainbox.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff); -fx-font-family: 'Inter', 'Segoe UI', sans-serif;");

        // SIDEBAR
        VBox sidebar = new VBox(20);
        sidebar.setPadding(new Insets(20, 15, 20, 15));
        sidebar.setStyle("-fx-background-color: #f5f9ff; -fx-pref-width: 280px;");
        sidebar.setAlignment(Pos.TOP_CENTER);

        Label sidebarTitle = new Label("e-help Desk");
        sidebarTitle.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        sidebarTitle.setStyle("-fx-text-fill: #1e3a8a; -fx-padding: 10px 0 30px 0;");

        Label profileIcon = new Label("👤");
        profileIcon.setFont(Font.font("System", 36));
        Label profileLabel = new Label("Profile");
        profileLabel.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 15));
        profileLabel.setStyle("-fx-text-fill: #4b5563;");
        HBox pBox = new HBox(15, profileIcon, profileLabel);
        pBox.setAlignment(Pos.CENTER_LEFT);
        pBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px;");
        pBox.setOnMouseEntered(event -> pBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        pBox.setOnMouseExited(event -> pBox.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
        pBox.setOnMouseClicked(event -> showProfileScreen.run());

        VBox navButtons = new VBox(10);

        HBox navBtn1 = new HBox(15, new Label("📄"), new Label("Legal Case Management"));
        navBtn1.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn1.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn1.setAlignment(Pos.CENTER_LEFT);
        navBtn1.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn1.setCursor(Cursor.HAND);
        navBtn1.setOnMouseEntered(event -> navBtn1.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        navBtn1.setOnMouseExited(event -> navBtn1.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));

        HBox navBtn2 = new HBox(15, new Label("📜"), new Label("Document & Certificate"));
        navBtn2.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn2.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn2.setAlignment(Pos.CENTER_LEFT);
        navBtn2.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn2.setCursor(Cursor.HAND);
        navBtn2.setOnMouseEntered(event -> navBtn2.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        navBtn2.setOnMouseExited(event -> navBtn2.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
        navBtn2.setOnMouseClicked(event -> showdoc.run());

        HBox navBtn3 = new HBox(15, new Label("🏠"), new Label("Land & Property Services"));
        navBtn3.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn3.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn3.setAlignment(Pos.CENTER_LEFT);
        navBtn3.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn3.setCursor(Cursor.HAND);
        navBtn3.setOnMouseEntered(event -> navBtn3.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        navBtn3.setOnMouseExited(event -> navBtn3.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
        navBtn3.setOnMouseClicked(evt->{
            showland.run();
        });

        HBox navBtn4 = new HBox(15, new Label("⇄"), new Label("RTI & Grievance"));
        navBtn4.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn4.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn4.setAlignment(Pos.CENTER_LEFT);
        navBtn4.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn4.setCursor(Cursor.HAND);
        navBtn4.setOnMouseEntered(event -> navBtn4.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        navBtn4.setOnMouseExited(event -> navBtn4.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));
        navBtn4.setOnMouseClicked(evt->{
            showrti.run();
        });

        HBox navBtn5 = new HBox(15, new Label("📚"), new Label("Legal Knowledge Base"));
        navBtn5.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn5.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 600; -fx-text-fill: #3b82f6;");
        navBtn5.setAlignment(Pos.CENTER_LEFT);
        navBtn5.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #e0e7ff;");
        navBtn5.setCursor(Cursor.HAND);

        navButtons.getChildren().addAll(navBtn1, navBtn2, navBtn3, navBtn4, navBtn5);

        Region sidebarSpacer = new Region();
        VBox.setVgrow(sidebarSpacer, Priority.ALWAYS);

        HBox links = new HBox(15);
        links.setAlignment(Pos.CENTER);
        Label contact = new Label("Contact");
        Label terms = new Label("Terms");
        Label privacy = new Label("Privacy");
        String footerStyle = "-fx-font-size: 13px; -fx-text-fill: #6b7280;";
        contact.setStyle(footerStyle);
        terms.setStyle(footerStyle);
        privacy.setStyle(footerStyle);
        links.getChildren().addAll(contact, terms, privacy);

        sidebar.getChildren().addAll(sidebarTitle, pBox, navButtons, sidebarSpacer, links);

        // MAIN CONTENT
        VBox mainContent = new VBox(25);
        mainContent.setPadding(new Insets(20, 40, 40, 40));
        mainContent.setStyle("-fx-background-color: transparent;");

        // TOP NAVIGATION
        HBox topNav = new HBox(30);
        topNav.setAlignment(Pos.CENTER_LEFT);

        HBox navLinks = new HBox(30);
        String topNavLinkStyle = "-fx-font-size: 15px; -fx-text-fill: #4b5563; -fx-font-weight: 500;";
        String topNavLinkHoverStyle = "-fx-font-size: 15px; -fx-text-fill: #1d4ed8; -fx-font-weight: 500;";

        Label home = new Label("Home");
        home.setStyle(topNavLinkStyle);
        home.setOnMouseEntered(event -> home.setStyle(topNavLinkHoverStyle));
        home.setOnMouseExited(event -> home.setStyle(topNavLinkStyle));

        Label services = new Label("Services");
        services.setStyle(topNavLinkStyle);
        services.setOnMouseEntered(event -> services.setStyle(topNavLinkHoverStyle));
        services.setOnMouseExited(event -> services.setStyle(topNavLinkStyle));

        Label rtiLink = new Label("RTI");
        rtiLink.setStyle(topNavLinkStyle);
        rtiLink.setOnMouseEntered(event -> rtiLink.setStyle(topNavLinkHoverStyle));
        rtiLink.setOnMouseExited(event -> rtiLink.setStyle(topNavLinkStyle));

        Label help = new Label("Legal Help");
        help.setStyle(topNavLinkStyle);
        help.setOnMouseEntered(event -> help.setStyle(topNavLinkHoverStyle));
        help.setOnMouseExited(event -> help.setStyle(topNavLinkStyle));

        Label resourcesLink = new Label("Resources");
        resourcesLink.setStyle(topNavLinkStyle);
        resourcesLink.setOnMouseEntered(event -> resourcesLink.setStyle(topNavLinkHoverStyle));
        resourcesLink.setOnMouseExited(event -> resourcesLink.setStyle(topNavLinkStyle));

        navLinks.getChildren().addAll(home, services, rtiLink, help, resourcesLink);

        Region topNavSpacer = new Region();
        HBox.setHgrow(topNavSpacer, Priority.ALWAYS);

        Button notificationButton = new Button("🔔");
        notificationButton.setFont(Font.font("System", 14));
        notificationButton.setStyle("-fx-background-color: transparent; -fx-border-color: #d1d5db; -fx-border-width: 1.5px; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 20px;");
        notificationButton.setCursor(Cursor.HAND);
        notificationButton.setOnMouseEntered(event -> notificationButton.setStyle("-fx-background-color: #f6f3f3; -fx-border-color: #d1d5db; -fx-border-width: 1.5px; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 20px;"));
        notificationButton.setOnMouseExited(event -> notificationButton.setStyle("-fx-background-color: transparent; -fx-border-color: #d1d5db; -fx-border-width: 1.5px; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 20px;"));

        Button logoutButton = new Button("LogOut");
        logoutButton.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        logoutButton.setStyle("-fx-background-color: #f63b3b; -fx-background-radius: 8px; -fx-text-fill: white; -fx-padding: 8px 20px;");
        logoutButton.setCursor(Cursor.HAND);
        logoutButton.setOnMouseEntered(event -> logoutButton.setStyle("-fx-background-color: #eb2525; -fx-background-radius: 8px; -fx-text-fill: white; -fx-padding: 8px 20px;"));
        logoutButton.setOnMouseExited(event -> logoutButton.setStyle("-fx-background-color: #f63b3b; -fx-background-radius: 8px; -fx-text-fill: white; -fx-padding: 8px 20px;"));
        logoutButton.setOnAction(event -> showLoginScreen.run());

        HBox loginButtons = new HBox(10, notificationButton, logoutButton);
        loginButtons.setAlignment(Pos.CENTER);
        topNav.getChildren().addAll(navLinks, topNavSpacer, loginButtons);

        // PAGE TITLE
        Label mainTitle = new Label("Legal Knowledge Base");
        mainTitle.setFont(Font.font("Inter", FontWeight.BOLD, 32));
        mainTitle.setStyle("-fx-text-fill: #1e3a8a; -fx-padding: 10px 0;");

        VBox content = new VBox(30);
        content.setPadding(new Insets(20, 0, 0, 0));

        // SEARCH SECTION
        VBox searchSection = new VBox(15);
        Label searchTitle = new Label("Search Legal Information");
        searchTitle.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 20));
        searchTitle.setStyle("-fx-text-fill: #1e3a8a;");

        VBox searchZone = new VBox(10);
        searchZone.setAlignment(Pos.CENTER);
        searchZone.setStyle("-fx-background-color: rgba(255, 255, 255, 0.6); -fx-border-color: #a0b3d7; -fx-border-style: dashed; -fx-border-width: 2; -fx-border-radius: 10; -fx-background-radius: 10;");
        searchZone.setPadding(new Insets(30));
        searchZone.setPrefHeight(200);

        Label searchIcon = new Label("🔍");
        searchIcon.setFont(Font.font("System", 30));
        Label searchText = new Label("Search for legal acts, cases, procedures...");
        searchText.setFont(Font.font("Inter", FontWeight.NORMAL, 16));
        searchText.setStyle("-fx-text-fill: #4b5563;");

        TextField searchField = new TextField();
        searchField.setPromptText("Enter your legal query here...");
        searchField.setStyle("-fx-font-size: 14px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-border-color: #a0b3d7; -fx-padding: 12px;");
        searchField.setPrefWidth(400);

        Button searchButton = new Button("Search");
        searchButton.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 14));
        searchButton.setStyle("-fx-background-color: #3b82f6; -fx-background-radius: 8px; -fx-text-fill: white; -fx-padding: 10px 25px;");
        searchButton.setCursor(Cursor.HAND);
        searchButton.setOnMouseEntered(event -> searchButton.setStyle("-fx-background-color: #2563eb; -fx-background-radius: 8px; -fx-text-fill: white; -fx-padding: 10px 25px;"));
        searchButton.setOnMouseExited(event -> searchButton.setStyle("-fx-background-color: #3b82f6; -fx-background-radius: 8px; -fx-text-fill: white; -fx-padding: 10px 25px;"));

        HBox searchControls = new HBox(10, searchField, searchButton);
        searchControls.setAlignment(Pos.CENTER);

        searchZone.getChildren().addAll(searchIcon, searchText, searchControls);
        searchSection.getChildren().addAll(searchTitle, searchZone);

        // CATEGORIES SECTION
        VBox categoriesSection = new VBox(15);
        Label categoriesTitle = new Label("Legal Categories");
        categoriesTitle.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 20));
        categoriesTitle.setStyle("-fx-text-fill: #1e3a8a;");

        GridPane categoriesGrid = new GridPane();
        categoriesGrid.setVgap(20);
        categoriesGrid.setHgap(20);
        categoriesGrid.setPadding(new Insets(10, 0, 0, 0));

        // CONSTITUTIONAL LAW CARD
        VBox constitutionalCard = new VBox(15);
        constitutionalCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;");
        constitutionalCard.setPadding(new Insets(25));
        constitutionalCard.setPrefHeight(280);
        constitutionalCard.setPrefWidth(350);
        constitutionalCard.setCursor(Cursor.HAND);

        Label constIcon = new Label("⚖️");
        constIcon.setFont(Font.font("System", 36));
        Label constTitle = new Label("Constitutional Law");
        constTitle.setFont(Font.font("Inter", FontWeight.BOLD, 18));
        constTitle.setStyle("-fx-text-fill: #1e3a8a;");
        HBox constTitleBox = new HBox(15, constIcon, constTitle);
        constTitleBox.setAlignment(Pos.CENTER_LEFT);

        Label constDesc = new Label("Learn about fundamental rights, directive principles, and constitutional amendments. Understanding the supreme law of the land.");
        constDesc.setFont(Font.font("Inter", 13));
        constDesc.setStyle("-fx-text-fill: #4b5563;");
        constDesc.setWrapText(true);

        VBox constTopics = new VBox(5);
        Label topic1 = new Label("• Fundamental Rights (Articles 12-35)");
        Label topic2 = new Label("• Directive Principles of State Policy");
        Label topic3 = new Label("• Constitutional Amendments");
        Label topic4 = new Label("• Judicial Review & Powers");
        topic1.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        topic2.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        topic3.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        topic4.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        constTopics.getChildren().addAll(topic1, topic2, topic3, topic4);

        constitutionalCard.getChildren().addAll(constTitleBox, constDesc, constTopics);
        constitutionalCard.setOnMouseEntered(e -> constitutionalCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.95); -fx-border-color: #3b82f6; -fx-border-style: solid; -fx-border-width: 2; -fx-border-radius: 15; -fx-background-radius: 15; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2), 15, 0, 0, 5);"));
        constitutionalCard.setOnMouseExited(e -> constitutionalCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;"));

        // CIVIL LAW CARD
        VBox civilCard = new VBox(15);
        civilCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;");
        civilCard.setPadding(new Insets(25));
        civilCard.setPrefHeight(280);
        civilCard.setPrefWidth(350);
        civilCard.setCursor(Cursor.HAND);

        Label civilIcon = new Label("🏛️");
        civilIcon.setFont(Font.font("System", 36));
        Label civilTitle = new Label("Civil Law");
        civilTitle.setFont(Font.font("Inter", FontWeight.BOLD, 18));
        civilTitle.setStyle("-fx-text-fill: #1e3a8a;");
        HBox civilTitleBox = new HBox(15, civilIcon, civilTitle);
        civilTitleBox.setAlignment(Pos.CENTER_LEFT);

        Label civilDesc = new Label("Understand civil procedures, property rights, contracts, and family law. Essential for everyday legal matters.");
        civilDesc.setFont(Font.font("Inter", 13));
        civilDesc.setStyle("-fx-text-fill: #4b5563;");
        civilDesc.setWrapText(true);

        VBox civilTopics = new VBox(5);
        Label civiltopic1 = new Label("• Contract Act & Agreements");
        Label civiltopic2 = new Label("• Property Rights & Transfer");
        Label civiltopic3 = new Label("• Family Law & Marriage");
        Label civiltopic4 = new Label("• Civil Procedure Code (CPC)");
        civiltopic1.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        civiltopic2.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        civiltopic3.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        civiltopic4.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        civilTopics.getChildren().addAll(civiltopic1, civiltopic2, civiltopic3, civiltopic4);

        civilCard.getChildren().addAll(civilTitleBox, civilDesc, civilTopics);
        civilCard.setOnMouseEntered(e -> civilCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.95); -fx-border-color: #3b82f6; -fx-border-style: solid; -fx-border-width: 2; -fx-border-radius: 15; -fx-background-radius: 15; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2), 15, 0, 0, 5);"));
        civilCard.setOnMouseExited(e -> civilCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;"));

        // CRIMINAL LAW CARD
        VBox criminalCard = new VBox(15);
        criminalCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;");
        criminalCard.setPadding(new Insets(25));
        criminalCard.setPrefHeight(280);
        criminalCard.setPrefWidth(350);
        criminalCard.setCursor(Cursor.HAND);

        Label criminalIcon = new Label("🔒");
        criminalIcon.setFont(Font.font("System", 36));
        Label criminalTitle = new Label("Criminal Law");
        criminalTitle.setFont(Font.font("Inter", FontWeight.BOLD, 18));
        criminalTitle.setStyle("-fx-text-fill: #1e3a8a;");
        HBox criminalTitleBox = new HBox(15, criminalIcon, criminalTitle);
        criminalTitleBox.setAlignment(Pos.CENTER_LEFT);

        Label criminalDesc = new Label("Learn about criminal procedures, rights of accused, bail provisions, and criminal justice system in India.");
        criminalDesc.setFont(Font.font("Inter", 13));
        criminalDesc.setStyle("-fx-text-fill: #4b5563;");
        criminalDesc.setWrapText(true);

        VBox criminalTopics = new VBox(5);
        Label criminaltopic1 = new Label("• Indian Penal Code (IPC)");
        Label criminaltopic2 = new Label("• Criminal Procedure Code (CrPC)");
        Label criminaltopic3 = new Label("• Evidence Act & Procedures");
        Label criminaltopic4 = new Label("• Bail & Arrest Procedures");
        criminaltopic1.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        criminaltopic2.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        criminaltopic3.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        criminaltopic4.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        criminalTopics.getChildren().addAll(criminaltopic1, criminaltopic2, criminaltopic3, criminaltopic4);

        criminalCard.getChildren().addAll(criminalTitleBox, criminalDesc, criminalTopics);
        criminalCard.setOnMouseEntered(e -> criminalCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.95); -fx-border-color: #3b82f6; -fx-border-style: solid; -fx-border-width: 2; -fx-border-radius: 15; -fx-background-radius: 15; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2), 15, 0, 0, 5);"));
        criminalCard.setOnMouseExited(e -> criminalCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;"));

        // CORPORATE LAW CARD
        VBox corporateCard = new VBox(15);
        corporateCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;");
        corporateCard.setPadding(new Insets(25));
        corporateCard.setPrefHeight(280);
        corporateCard.setPrefWidth(350);
        corporateCard.setCursor(Cursor.HAND);

        Label corporateIcon = new Label("🏢");
        corporateIcon.setFont(Font.font("System", 36));
        Label corporateTitle = new Label("Corporate Law");
        corporateTitle.setFont(Font.font("Inter", FontWeight.BOLD, 18));
        corporateTitle.setStyle("-fx-text-fill: #1e3a8a;");
        HBox corporateTitleBox = new HBox(15, corporateIcon, corporateTitle);
        corporateTitleBox.setAlignment(Pos.CENTER_LEFT);

        Label corporateDesc = new Label("Understanding company formation, corporate governance, mergers, acquisitions and business regulations.");
        corporateDesc.setFont(Font.font("Inter", 13));
        corporateDesc.setStyle("-fx-text-fill: #4b5563;");
        corporateDesc.setWrapText(true);

        VBox corporateTopics = new VBox(5);
        Label corporatetopic1 = new Label("• Companies Act 2013");
        Label corporatetopic2 = new Label("• Corporate Governance");
        Label corporatetopic3 = new Label("• Mergers & Acquisitions");
        Label corporatetopic4 = new Label("• Securities Laws (SEBI)");
        corporatetopic1.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        corporatetopic2.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        corporatetopic3.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        corporatetopic4.setStyle("-fx-font-size: 12px; -fx-text-fill: #374151;");
        corporateTopics.getChildren().addAll(corporatetopic1, corporatetopic2, corporatetopic3, corporatetopic4);

        corporateCard.getChildren().addAll(corporateTitleBox, corporateDesc, corporateTopics);
        corporateCard.setOnMouseEntered(e -> corporateCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.95); -fx-border-color: #3b82f6; -fx-border-style: solid; -fx-border-width: 2; -fx-border-radius: 15; -fx-background-radius: 15; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2), 15, 0, 0, 5);"));
        corporateCard.setOnMouseExited(e -> corporateCard.setStyle("-fx-background-color: rgba(255, 255, 255, 0.8); -fx-border-color: #a0b3d7; -fx-border-style: solid; -fx-border-width: 1.5; -fx-border-radius: 15; -fx-background-radius: 15;"));

        // Add cards to grid (2x2 layout)
        categoriesGrid.add(constitutionalCard, 0, 0);
        categoriesGrid.add(civilCard, 1, 0);
        categoriesGrid.add(criminalCard, 0, 1);
        categoriesGrid.add(corporateCard, 1, 1);

        categoriesSection.getChildren().addAll(categoriesTitle, categoriesGrid);

        // FAQ SECTION
        VBox faqSection = new VBox(15);
        faqSection.setStyle("-fx-background-color: rgba(255, 255, 255, 0.7); -fx-background-radius: 12px; -fx-padding: 25px;");

        Label faqTitle = new Label("❓ Frequently Asked Legal Questions");
        faqTitle.setFont(Font.font("Inter", FontWeight.BOLD, 20));
        faqTitle.setStyle("-fx-text-fill: #1e3a8a;");

        VBox faqList = new VBox(10);

        VBox faq1 = new VBox(5);
        Label q1 = new Label("Q: How do I file a First Information Report (FIR)?");
        q1.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        q1.setStyle("-fx-text-fill: #374151;");
        Label a1 = new Label("A: Visit the nearest police station with all relevant details. The police officer is legally bound to register your FIR under Section 154 of CrPC.");
        a1.setFont(Font.font("Inter", 13));
        a1.setStyle("-fx-text-fill: #4b5563;");
        a1.setWrapText(true);
        faq1.getChildren().addAll(q1, a1);

        VBox faq2 = new VBox(5);
        Label q2 = new Label("Q: What is the process for registering a property?");
        q2.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        q2.setStyle("-fx-text-fill: #374151;");
        Label a2 = new Label("A: Property registration requires stamp duty payment, document verification, and registration at the Sub-Registrar office within 4 months of execution.");
        a2.setFont(Font.font("Inter", 13));
        a2.setStyle("-fx-text-fill: #4b5563;");
        a2.setWrapText(true);
        faq2.getChildren().addAll(q2, a2);

        VBox faq3 = new VBox(5);
        Label q3 = new Label("Q: How can I get anticipatory bail?");
        q3.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        q3.setStyle("-fx-text-fill: #374151;");
        Label a3 = new Label("A: File an application under Section 438 CrPC in Sessions Court or High Court through a lawyer, stating reasonable grounds for fear of arrest.");
        a3.setFont(Font.font("Inter", 13));
        a3.setStyle("-fx-text-fill: #4b5563;");
        a3.setWrapText(true);
        faq3.getChildren().addAll(q3, a3);

        faqList.getChildren().addAll(faq1, faq2, faq3);
        faqSection.getChildren().addAll(faqTitle, faqList);

        // QUICK ASSISTANCE SECTION
        VBox assistanceSection = new VBox(15);
        assistanceSection.setStyle("-fx-background-color: rgba(59, 130, 246, 0.1); -fx-background-radius: 12px; -fx-padding: 25px; -fx-border-color: #3b82f6; -fx-border-width: 1px; -fx-border-radius: 12px;");

        Label assistanceTitle = new Label("🆘 Need Legal Assistance?");
        assistanceTitle.setFont(Font.font("Inter", FontWeight.BOLD, 18));
        assistanceTitle.setStyle("-fx-text-fill: #1e3a8a;");

        Label assistanceDesc = new Label("Get connected with legal aid services, pro bono lawyers, and legal consultation services in your area.");
        assistanceDesc.setFont(Font.font("Inter", 14));
        assistanceDesc.setStyle("-fx-text-fill: #4b5563;");
        assistanceDesc.setWrapText(true);

        HBox assistanceButtons = new HBox(15);
        Button findLawyerBtn = new Button("Find Lawyer");
        findLawyerBtn.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        findLawyerBtn.setStyle("-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 8px; -fx-padding: 10px 20px;");
        findLawyerBtn.setCursor(Cursor.HAND);
        findLawyerBtn.setOnMouseEntered(e -> findLawyerBtn.setStyle("-fx-background-color: #2563eb; -fx-text-fill: white; -fx-background-radius: 8px; -fx-padding: 10px 20px;"));
        findLawyerBtn.setOnMouseExited(e -> findLawyerBtn.setStyle("-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 8px; -fx-padding: 10px 20px;"));

        Button legalAidBtn = new Button("Legal Aid Services");
        legalAidBtn.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        legalAidBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #3b82f6; -fx-border-color: #3b82f6; -fx-border-width: 2px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-padding: 10px 20px;");
        legalAidBtn.setCursor(Cursor.HAND);
        legalAidBtn.setOnMouseEntered(e -> legalAidBtn.setStyle("-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-border-color: #3b82f6; -fx-border-width: 2px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-padding: 10px 20px;"));
        legalAidBtn.setOnMouseExited(e -> legalAidBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #3b82f6; -fx-border-color: #3b82f6; -fx-border-width: 2px; -fx-background-radius: 8px; -fx-border-radius: 8px; -fx-padding: 10px 20px;"));

        assistanceButtons.getChildren().addAll(findLawyerBtn, legalAidBtn);
        assistanceSection.getChildren().addAll(assistanceTitle, assistanceDesc, assistanceButtons);

        content.getChildren().addAll(searchSection, categoriesSection, faqSection, assistanceSection);
        mainContent.getChildren().addAll(topNav, mainTitle, content);

        ScrollPane scrollPane = new ScrollPane(mainContent);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff); -fx-font-family: 'Inter', 'Segoe UI', sans-serif;");
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        mainbox.setLeft(sidebar);
        mainbox.setCenter(scrollPane);

        return mainbox;
    }
}
