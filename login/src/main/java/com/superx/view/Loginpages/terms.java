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

    Scene termsScene;
     Stage termsStage;

    public void setTermsScene(Scene termsScene) {
        this.termsScene = termsScene;
    }
    public void setTermsStage(Stage termsStage) {
        this.termsStage = termsStage;
    }
   
    public VBox termsBox (Runnable back){
        Text terms = new Text("Terms and Conditions for E-Legal Desk\n" +  
                        "Effective Date: [DD/MM/YYYY]\n" +  
                        "Application: E-Legal Desk (Desktop Legal Assistant)\n" +  
                        " \n" +  
                        "1. Acceptance of Terms\n" +  
                        "By using E-Legal Desk, you agree to be bound by these Terms and Conditions. If you do not agree, please do not use this application.\n" +  
                        " \n" +  
                        "2. Purpose of the App\n" +  
                        "E-Legal Desk is an informational and assistive tool. It helps users: - Prepare legal documents (e.g., FIR drafts, affidavits) - Auto-fill and preview legal forms - Track case details - Access verified government resources - Connect with legal professionals\n" +  
                        "Note: This app does not file legal cases directly or act as an official legal representative.\n" +  
                        " \n" +  
                        "3. User Responsibilities\n" +  
                        "•\tUsers must provide accurate and truthful information.\n" +  
                        "•\tUsers are responsible for any action taken using this app.\n" +  
                        "•\tUsers must not use the platform for illegal, harmful, or misleading purposes.\n" +  
                        " \n" +  
                        "4. Document Usage & Filing\n" +  
                        "•\tThe platform provides drafts and redirection to official government websites.\n" +  
                        "•\tE-Legal Desk does not submit any legal documents on behalf of the user.\n" +  
                        "•\tUsers must complete all filings through authorized portals.\n" +  
                        " \n" +  
                        "5. Data Privacy & Storage\n" +  
                        "•\tSome data (e.g., user profile, case drafts, documents) may be stored using Firebase with user consent.\n" +  
                        "•\tAll uploads are encrypted and accessible only by the user and authorized roles.\n" +  
                        "•\tWe do not share or sell personal data.\n" +  
                        "You may delete your data anytime through the account dashboard.\n" +  
                        " \n" +  
                        "6. Lawyer Matching & Communication\n" +  
                        "•\tLawyers listed are independent professionals, not employees of E-Legal Desk.\n" +  
                        "•\tThe app only facilitates connection; legal advice given is the responsibility of the lawyer.\n" +  
                        " \n" +  
                        "7. Limitation of Liability\n" +  
                        "E-Legal Desk, its developers, or partners shall not be liable for: - Legal outcomes from user-submitted data - Errors in document drafts - Delays or inaccuracies on third-party government sites\n" +  
                        "\n" +  
                        "8. Updates & Termination\n" +  
                        "•\tWe may update the application and these terms at any time.\n" +  
                        "•\tContinued use after updates means you accept the new terms.\n" +  
                        "•\tYou may uninstall and stop using the app at any time.\n" +  
                        " \n" +  
                        "9. Legal Disclaimer\n" +  
                        "E-Legal Desk is not affiliated with any government body or court system. It is designed for informational and assistance purposes only.\n" +  
                        " \n" +  
                        "10. Contact\n" +  
                        "For issues, suggestions, or legal concerns, contact us at:\n" +  
                        "📧 support@elegaldesk.in \r\n" +  
                        ""); 
                        terms.setFont(Font.font(16));
                        Button backButton = new Button("back");
                        backButton.setOnAction(evt ->
                        {
                            back.run();
                        });

                        VBox vb = new VBox(50,terms,backButton);
                        vb.setAlignment(Pos.CENTER);
                        vb.setPadding(new Insets(50,50,50,50));
                        ScrollPane sp = new ScrollPane(vb);
                        VBox v0b = new VBox(sp);

        return v0b;

    }
    
}
