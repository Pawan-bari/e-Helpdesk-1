package com.superx.view.landRecords.subfilesLandrecords;

import javafx.application.HostServices;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class propertyReg {
    Stage propertyRegStage;
    Scene propertyRegScene;
    private HostServices hostServices;

    public void setPropertyRegStage(Stage propertyRegStage) {
        this.propertyRegStage = propertyRegStage;
    }

    public void setPropertyRegScene(Scene propertyRegScene) {
        this.propertyRegScene = propertyRegScene;
    }

    public void setHostServices(HostServices hostServices) {
        this.hostServices = hostServices;
    }

    public BorderPane propertyRegBox(Runnable showLandRecords) {
        BorderPane mainBox = new BorderPane();
        mainBox.setStyle(
                "-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff); -fx-font-family: 'Inter', 'Segoe UI', sans-serif;");

        VBox content = new VBox(20);
        content.setPadding(new Insets(20, 40, 40, 40));

        // Header with back button
        HBox header = new HBox(20);
        header.setAlignment(Pos.CENTER_LEFT);

        Button backButton = new Button("← Back to Land Records");
        backButton.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 14));
        backButton.setStyle(
                "-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 8px; -fx-padding: 10px 20px;");
        backButton.setCursor(Cursor.HAND);
        backButton.setOnMouseEntered(e -> backButton.setStyle(
                "-fx-background-color: #2563eb; -fx-text-fill: white; -fx-background-radius: 8px; -fx-padding: 10px 20px;"));
        backButton.setOnMouseExited(e -> backButton.setStyle(
                "-fx-background-color: #3b82f6; -fx-text-fill: white; -fx-background-radius: 8px; -fx-padding: 10px 20px;"));
        backButton.setOnAction(e -> showLandRecords.run());

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Label title = new Label("Property Registration Services");
        title.setFont(Font.font("Inter", FontWeight.BOLD, 32));
        title.setStyle("-fx-text-fill: #1e3a8a;");

        header.getChildren().addAll(backButton, spacer, title);

        VBox propertyCard = createPropertyRegistrationCard();
        content.getChildren().addAll(header, propertyCard);

        ScrollPane scroll = new ScrollPane(content);
        scroll.setFitToWidth(true);
        scroll.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff);");
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        mainBox.setCenter(scroll);
        return mainBox;
    }

    public VBox createPropertyRegistrationCard() {
        VBox cardBox = new VBox(15);
        cardBox.setPadding(new Insets(20));
        cardBox.setAlignment(Pos.TOP_LEFT);
        cardBox.setStyle(
                "-fx-background-color: rgba(255, 255, 255, 0.8); -fx-background-radius: 15px; -fx-border-color: #a0b3d7; -fx-border-width: 1px; -fx-border-radius: 15px;");

        // State-wise property registration portals
        TitledPane maharashtraPane = createSchemeCategory("Maharashtra",
                createLink("IGR Maharashtra Portal", "https://igrmaharashtra.gov.in/"),
                createLink("Deed Registration Guide", "https://igrmaharashtra.gov.in/pdf/HowTo/DeedRegistration.pdf"),
                createLink("Book Appointment", "https://igrmaharashtra.gov.in/SBServices/AppointmentBooking"),
                createLink("Stamp Duty Calculator", "https://igrmaharashtra.gov.in/StampDutyCalculator/"));

        TitledPane karnatakaPane = createSchemeCategory("Karnataka",
                createLink("Kaveri Online Services", "https://kaverionline.karnataka.gov.in/"),
                createLink("User Manual", "https://kaverionline.karnataka.gov.in/Manuals/KAVERI_ONLINE_SERVICES.pdf"),
                createLink("Registration Status", "https://kaverionline.karnataka.gov.in/"));

        TitledPane telanganaPane = createSchemeCategory("Telangana",
                createLink("IGRS Telangana", "https://registration.telangana.gov.in/"),
                createLink("Sample Documents", "https://registration.telangana.gov.in/jsp/sdmenu.html"),
                createLink("Online Registration", "https://registration.telangana.gov.in/"));

        TitledPane delhiPane = createSchemeCategory("Delhi",
                createLink("DORIS Delhi", "https://doris.delhi.gov.in/"),
                createLink("Registration Info", "https://doris.delhi.gov.in/Home/Index"),
                createLink("Fee Calculator", "https://doris.delhi.gov.in/"));

        TitledPane gujaratPane = createSchemeCategory("Gujarat",
                createLink("GARVI Portal", "https://garvi.gujarat.gov.in/"),
                createLink("Registration Process", "https://garvi.gujarat.gov.in/Help/HelpContent"),
                createLink("Document Search", "https://garvi.gujarat.gov.in/"));

        TitledPane upPane = createSchemeCategory("Uttar Pradesh",
                createLink("IGRS UP", "http://igrsup.gov.in/"),
                createLink("Online Deed Entry",
                        "http://igrsup.gov.in/igrsup/defaultAction?requestType=onlineDeedEntry"),
                createLink("Registration Guidelines", "http://igrsup.gov.in/"));

        TitledPane rajasthanPane = createSchemeCategory("Rajasthan",
                createLink("Epanjiyan Rajasthan", "https://epanjiyan.rajasthan.gov.in/"),
                createLink("Guidelines & Help",
                        "https://epanjiyan.rajasthan.gov.in/content/raj/epanjiyan/en/home.html"),
                createLink("Fee Structure", "https://epanjiyan.rajasthan.gov.in/"));

        TitledPane tamilnaduPane = createSchemeCategory("Tamil Nadu",
                createLink("TNREGINET", "https://tnreginet.gov.in/"),
                createLink("User Guide", "https://tnreginet.gov.in/portal/document/tn/Tnreginet_UserManual.pdf"),
                createLink("Online Services", "https://tnreginet.gov.in/"));

        TitledPane biharPane = createSchemeCategory("Bihar",
                createLink("Bihar Registration", "https://biharregd.gov.in/"),
                createLink("Apply Online", "https://biharregd.gov.in/Service.aspx"),
                createLink("Status Check", "https://biharregd.gov.in/"));

        TitledPane madhyaPradeshPane = createSchemeCategory("Madhya Pradesh",
                createLink("MPIGR Portal", "https://www.mpigr.gov.in/"),
                createLink("E-Registration", "https://www.mpigr.gov.in/portal/Registration.aspx"),
                createLink("Document Verification", "https://www.mpigr.gov.in/"));

        VBox allPanes = new VBox(15,
                maharashtraPane, karnatakaPane, telanganaPane, delhiPane, gujaratPane,
                upPane, rajasthanPane, tamilnaduPane, biharPane, madhyaPradeshPane);

        cardBox.getChildren().add(allPanes);
        return cardBox;
    }

    public TitledPane createSchemeCategory(String title, Hyperlink... links) {
        VBox box = new VBox(10);
        box.setPadding(new Insets(15));
        box.setStyle("-fx-background-color: rgba(255, 255, 255, 0.5); -fx-background-radius: 8px;");
        box.getChildren().addAll(links);

        TitledPane pane = new TitledPane(title, box);
        pane.setExpanded(false);
        pane.setStyle("-fx-font-family: 'Inter'; -fx-font-weight: bold; -fx-font-size: 16px; -fx-text-fill: #1e3a8a;");
        return pane;
    }

    public Hyperlink createLink(String text, String url) {
        Hyperlink link = new Hyperlink(text);
        link.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
        link.setStyle("-fx-text-fill: #3b82f6; -fx-underline: true;");
        link.setCursor(Cursor.HAND);
        link.setOnMouseEntered(e -> link.setStyle("-fx-text-fill: #1d4ed8; -fx-underline: true;"));
        link.setOnMouseExited(e -> link.setStyle("-fx-text-fill: #3b82f6; -fx-underline: true;"));
        link.setOnAction(e -> {
            if (hostServices != null) {
                hostServices.showDocument(url);
            } else {
                System.err.println("HostServices not set.");
            }
        });
        return link;
    }
}
