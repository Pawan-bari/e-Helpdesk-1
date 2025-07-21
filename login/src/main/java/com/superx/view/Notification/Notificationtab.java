package com.superx.view.Notification;

import java.applet.Applet;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.BlurType;

public class Notificationtab{

    public void setNoti2Stage(Stage notiStage) {
        this.noti2Stage = notiStage;
    }

    public void setNoti2Scene(Scene notiScene) {
        this.noti2Scene = notiScene;
    }

    Stage noti2Stage;
    Scene noti2Scene;

    public BorderPane notificationPage(Runnable showdoc){

        BorderPane mainbox = new BorderPane();
        mainbox.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #e6f0ff, #d6e4ff); -fx-font-family: 'Inter', 'Segoe UI', sans-serif;");
        
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
        pBox.setOnMouseClicked(event ->{
              // showProfileScreen.run();
        });


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
        navBtn2.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 600; -fx-text-fill: #3b82f6;");
        navBtn2.setAlignment(Pos.CENTER_LEFT);
        navBtn2.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #e0e7ff;");
        navBtn2.setCursor(Cursor.HAND);

        
        HBox navBtn3 = new HBox(15, new Label("🏠"), new Label("Land & Property Services"));
        navBtn3.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn3.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn3.setAlignment(Pos.CENTER_LEFT);
        navBtn3.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn3.setCursor(Cursor.HAND);
        
        
        HBox navBtn4 = new HBox(15, new Label("⇄"), new Label("RTI & Grievance"));
        navBtn4.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn4.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn4.setAlignment(Pos.CENTER_LEFT);
        navBtn4.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn4.setCursor(Cursor.HAND);
        navBtn4.setOnMouseEntered(event -> navBtn4.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        navBtn4.setOnMouseExited(event -> navBtn4.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));

        
        HBox navBtn5 = new HBox(15, new Label("📚"), new Label("Legal Knowledge Base"));
        navBtn5.getChildren().get(0).setStyle("-fx-font-size: 24px;");
        navBtn5.getChildren().get(1).setStyle("-fx-font-size: 15px; -fx-font-weight: 500; -fx-text-fill: #4b5563;");
        navBtn5.setAlignment(Pos.CENTER_LEFT);
        navBtn5.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;");
        navBtn5.setCursor(Cursor.HAND);
        navBtn5.setOnMouseEntered(event -> navBtn5.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: #eef2ff;"));
        navBtn5.setOnMouseExited(event -> navBtn5.setStyle("-fx-padding: 12px 15px; -fx-background-radius: 10px; -fx-background-color: transparent;"));

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

        
        VBox mainContent = new VBox(25);
        mainContent.setPadding(new Insets(20, 40, 40, 40));
        mainContent.setStyle("-fx-background-color: transparent;");

        HBox topNav = new HBox(30);
        topNav.setAlignment(Pos.CENTER_LEFT);

        HBox navLinks = new HBox(30);
        String topNavLinkStyle = "-fx-font-size: 15px; -fx-text-fill: #4b5563; -fx-font-weight: 500;";
        String topNavLinkHoverStyle = "-fx-font-size: 15px; -fx-text-fill: #1d4ed8; -fx-font-weight: 500;";
        
        Label home = new Label("Home");
        home.setStyle(topNavLinkStyle);
        home.setOnMouseEntered(event-> home.setStyle(topNavLinkHoverStyle));
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
        logoutButton.setOnAction(event-> {
        //showLoginScreen.run();
            
        });
        HBox loginButtons = new HBox(10, notificationButton, logoutButton);
        loginButtons.setAlignment(Pos.CENTER);
        topNav.getChildren().addAll(navLinks, topNavSpacer, loginButtons);

        
        Label title = new Label("Notifications");
        title.setFont(Font.font("arial", FontWeight.BOLD, 25));
        title.setAlignment(Pos.CENTER_LEFT);
        title.setStyle(
            "-fx-font-size: 22px;" +
            "-fx-font-weight: bold;" +
            "-fx-text-fill: linear-gradient(from 0% 0% to 100% 100%, #ff0099ff, #5900ffff);");

     
        DropShadow dp = new DropShadow();
        dp.setBlurType(BlurType.GAUSSIAN);


        StackPane sp1 = new StackPane(createNotification(" FIR Draft is ready to download!!",1));
        StackPane sp2 = new StackPane(createNotification(" Missing evidence file for FIR draft! Please upload to continue.",2));
        StackPane sp3 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",3));
        StackPane sp4 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",4));
        StackPane sp5 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",5));
        StackPane sp6 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",6));
        StackPane sp7 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",7));
        StackPane sp8 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",8));
        StackPane sp9 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",8));
        StackPane sp10 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",9));
        StackPane sp11 = new StackPane(createNotification(" Lawyer Meera Joshi accepted your case request!",10)); 

        VBox vBox = new VBox(15,title,sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10,sp11);
        vBox.setPadding(new Insets(5));
        ScrollPane sPane = new ScrollPane(vBox);
        vBox.setPadding(new javafx.geometry.Insets(10));
      
        mainbox.getChildren().addAll(sPane,createNotification(topNavLinkHoverStyle, 0));
        return mainbox;
        
       
    }

     private StackPane createNotification(String message, int days) {

        Rectangle rectangle = new Rectangle();
        rectangle.setArcHeight(40);
        rectangle.setArcWidth(40);
        rectangle.setHeight(60);
        rectangle.setWidth(1055);
        rectangle.setFill(Color.valueOf("e6f0ff")); // Light blue background
        rectangle.setEffect(new DropShadow(5, Color.gray(0.3)));

        Label msg = new Label(message);
        msg.setStyle("-fx-font-size: 15px; -fx-text-fill: #050505ff; -fx-font-weight: bold;");
        Label daysLabel = new Label(days +" days ago  ");
        daysLabel.setStyle("-fx-font-weight: bold;" +
            "-fx-text-fill: linear-gradient(from 0% 0% to 100% 100%, #000000ff, #000000ff);");
            daysLabel.setFont(Font.font(12));

        StackPane stack = new StackPane(rectangle,msg,daysLabel);
        stack.setPadding(new Insets (5));
        stack.setPadding(new Insets(3));
        StackPane.setAlignment(msg, Pos.CENTER_LEFT);
        StackPane.setAlignment(daysLabel, Pos.CENTER_RIGHT);


        return stack;
    }
}

