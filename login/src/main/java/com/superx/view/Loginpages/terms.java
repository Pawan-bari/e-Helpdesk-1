package com.superx.view.Loginpages;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class terms {

    private Scene termsScene;
    private Stage termsStage;

    public void setTermsScene(Scene termsScene) {
        this.termsScene = termsScene;
    }

    public void setTermsStage(Stage termsStage) {
        this.termsStage = termsStage;
    }

    public VBox termsBox(Runnable back) {
        Text terms = new Text(
                """
                        Terms and Conditions for E-Legal Desk
                        Effective Date: [DD/MM/YYYY]
                        Application: E-Legal Desk (Desktop Legal Assistant)

                        1. Acceptance of Terms
                        By using E-Legal Desk, you agree to be bound by these Terms and Conditions.

                        2. Purpose of the App
                        E-Legal Desk helps users draft legal documents, track cases, access verified resources, and connect with legal professionals.

                        NOTE: This app does not file legal cases directly or act as a legal representative.

                        3. User Responsibilities
                        • Provide accurate data.
                        • Do not use the app for illegal purposes.
                        • Use the app wisely and independently.

                        4. Document Usage
                        • E-Legal Desk offers templates and redirects to official sites.
                        • Users must file and submit legally via official portals.

                        5. Privacy and Storage
                        • Data is stored only with consent, encrypted, not sold or shared.

                        6. Lawyer Connection
                        • E-Legal Desk only connects; legal advice is independent.

                        7. Legal Limitation
                        • Not responsible for outcomes, data loss, or government delays.

                        8. Termination
                        • You may stop using this service at any time.

                        9. Disclaimer
                        • This is not an official government service.

                        10. Support
                        📧 support@elegaldesk.in
                        """);
        terms.setFont(Font.font(16));
        terms.setWrappingWidth(1000);

        Button backButton = new Button("Back");
        backButton.setOnAction(evt -> back.run());

        VBox content = new VBox(50, terms, backButton);
        content.setAlignment(Pos.TOP_CENTER);
        content.setPadding(new Insets(50));

        ScrollPane scrollPane = new ScrollPane(content);
        scrollPane.setFitToWidth(true);
        VBox container = new VBox(scrollPane);
        container.setAlignment(Pos.CENTER);

        return container;
    }
}
