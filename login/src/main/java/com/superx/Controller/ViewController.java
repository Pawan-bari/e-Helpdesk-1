package com.superx.Controller;

import com.superx.view.Document.documents;
import com.superx.view.Loginpages.forgot;
import com.superx.view.Loginpages.login;
import com.superx.view.Loginpages.signup;
import com.superx.view.Loginpages.terms;
import com.superx.view.Notification.Notificationtab;
import com.superx.view.Profile.AccountSetting;
import com.superx.view.Profile.Notification;
import com.superx.view.Profile.ProfilePage;
import com.superx.view.Profile.SecurityPage;
import com.superx.view.Profile.Storage;
import com.superx.view.landRecords.landRecords;
import com.superx.view.landRecords.archive.legalArchives;
import com.superx.view.legalTech.governOfficail;
import com.superx.view.legalTech.legalCaseManagement;
import com.superx.view.legalTech.guidedFormBox;
import com.superx.view.rti.RtiPage;

import javafx.application.HostServices;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewController {

    private LoginController loginController;
    private SignupController signupController;
    private ForgotpassController forgotPasswordController;
    private HostServices hostServices;
    
    private Stage mainStage;
    private static String currentUserId;
    
    private Scene loginScene, signupScene, forgotScene, termsScene, docScene, profileScene,
     accScene, securityScene, notiScene, 
     stoScene, landRecordsScene, rtiScene,
     notiScenetab, legalScene, legalcaseScene,
     governOffScene, guidedFormScene;

    public ViewController(Stage stage, HostServices hostServices) {
        this.mainStage = stage;
        this.hostServices = hostServices;
         
        this.loginController = new LoginController(this);
        this.signupController = new SignupController(this);
        this.forgotPasswordController = new ForgotpassController(this);
        showLoginScreen(); 
    }

    public static String getCurrentUserId() {
        return currentUserId;
    }

    public static void setCurrentUserId(String uid) {
        currentUserId = uid;
    }

    public void showLoginScreen() {
        setCurrentUserId(null);
        login loginPage = new login();
        loginScene = new Scene(loginPage.getLoginBox(this), 1920, 1080);
        mainStage.setScene(loginScene);
    }

    public void showSignupScreen() {
        signup signupPage = new signup();
        signupScene = new Scene(signupPage.signupBox(this), 1920, 1080);
        mainStage.setScene(signupScene);
    }

    public void showForgotScreen() {
        forgot forgotPage = new forgot();
        forgotScene = new Scene(forgotPage.forgotBox(this::showLoginScreen, this), 1920, 1080);
        forgotPage.setForgotStage(mainStage);
        forgotPage.setForgotScene(forgotScene);
        mainStage.setScene(forgotScene);
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public SignupController getSignupController() {
        return signupController;
    }

    public ForgotpassController getForgotPasswordController() {
        return forgotPasswordController;
    }

    public void showTermsScene() {
        terms termsPage = new terms();
        termsScene = new Scene(termsPage.termsBox(this::showSignupScreen), 1200, 800);
        termsPage.setTermsStage(mainStage);
        termsPage.setTermsScene(termsScene);
        mainStage.setScene(termsScene);
    }

    public void shownotification2() {
        Notificationtab notipage = new Notificationtab();
        notiScenetab = new Scene(notipage.notificationPage(this::showDocScene), 1920, 1080);  
        notipage.setNoti2Stage(mainStage);
        notipage.setNoti2Scene(notiScenetab);
        mainStage.setScene(notiScenetab);
    }

    public void showDocScene() {
        documents docPage = new documents();
        docScene = new Scene(docPage.docScenBox(this::showProfileScreen, this::showLoginScreen, this::showLegal, this::showLandRecordsScreen, this::showRTI, this::shownotification2, this::showarchive), 1920, 1080);  
        docPage.setDocStage(mainStage);
        docPage.setDocScene(docScene);
        mainStage.setScene(docScene);
    }

    public void showProfileScreen() {
        ProfilePage profile = new ProfilePage();
        profileScene = new Scene(profile.profilebox(this::showAccountScreen, this::showSecurityScreen, this::showDocScene, this::showNotification, this::showStorage), 1920, 1080);
        profile.setProfStage(mainStage);
        profile.setProfScene(profileScene);
        mainStage.setScene(profileScene);
    }

    public void showAccountScreen() {
        AccountSetting accPage = new AccountSetting();
        accScene = new Scene(accPage.accountSettingsBox(this::showProfileScreen, this::showSecurityScreen, this::showDocScene, this::showNotification, this::showStorage), 1920, 1080);
        accPage.setAccStage(mainStage);
        accPage.setAccScene(accScene);
        mainStage.setScene(accScene);
    }

    public void showSecurityScreen() {
        SecurityPage secPage = new SecurityPage();
        securityScene = new Scene(secPage.securityPageBox(this::showProfileScreen, this::showAccountScreen, this::showDocScene, this::showNotification, this::showStorage, null), 1920, 1080);
        secPage.setSecStage(mainStage);
        secPage.setSecscene(securityScene);
        mainStage.setScene(securityScene);
    }

    public void showNotification() {
        Notification notpage = new Notification();
        notiScene = new Scene(notpage.notificationPageBox(this::showProfileScreen, this::showAccountScreen, this::showSecurityScreen, this::showDocScene, this::showStorage), 1920, 1080);
        notpage.setNotiStage(mainStage);
        notpage.setNotiScene(notiScene);
        mainStage.setScene(notiScene);
    }

    public void showStorage() {
        Storage stopage = new Storage();
        stoScene = new Scene(stopage.createStoragePage(this::showProfileScreen, this::showAccountScreen, this::showSecurityScreen, this::showNotification), 1920, 1080);
        stopage.setStoStage(mainStage);
        stopage.setStoScene(stoScene);
        mainStage.setScene(stoScene);
    }

    public void showLandRecordsScreen() {
        landRecords landRecordsPage = new landRecords();
        landRecordsScene = new Scene(landRecordsPage.landRecordsBox(this::showProfileScreen, this::showLoginScreen, this::showDocScene, this::showRTI, this::showarchive), 1920, 1080);
        landRecordsPage.setLandStage(mainStage);
        landRecordsPage.setLandScene(landRecordsScene);
        mainStage.setScene(landRecordsScene);
    }
    
    public void showRTI() {
        RtiPage Page = new RtiPage();
        rtiScene = new Scene(Page.rtiPageBox(this::showProfileScreen, this::showLoginScreen, this::showDocScene, this::showLandRecordsScreen, this::showarchive, this::shownotification2), 1920, 1080);
        Page.setRtiStage(mainStage);
        Page.setRtiScene(rtiScene);
        mainStage.setScene(rtiScene);
    }
   
    public void showarchive() {
        legalArchives Page = new legalArchives();
        legalScene = new Scene(Page.legalbox(this::showProfileScreen, this::showLoginScreen, this::showDocScene, this::showLandRecordsScreen, this::showRTI), 1920, 1080);
        Page.setLegalStage(mainStage);
        Page.setLegalScene(legalScene);
        mainStage.setScene(legalScene);
    }

    // Fixed method name from 'shoeLegal' to 'showLegal'
    public void showLegal() {
        legalCaseManagement Page = new legalCaseManagement();
        Page.setHostServices(hostServices); // Pass HostServices
        legalcaseScene = new Scene(Page.legalmanabox(this::showDocScene, this::showgovOff, this::showGuidedForm), 1920, 1080);
        Page.setLegalCaseStage(mainStage);
        Page.setLegalCaseScene(legalcaseScene);
        mainStage.setScene(legalcaseScene);
    }

    public void showgovOff() {
        governOfficail Page = new governOfficail();
        Page.setHostServices(hostServices);
        governOffScene = new Scene(Page.govOff(this::showDocScene, this::showLegal), 1920, 1080);
        Page.setGuidedFormStage(mainStage);
        Page.setGuidedFormScene(governOffScene);
        mainStage.setScene(governOffScene);
    }

    // New method for guided forms
    public void showGuidedForm() {
        guidedFormBox Page = new guidedFormBox();
        Page.setHostServices(hostServices);
        guidedFormScene = new Scene(Page.rtiPageBox(this::showProfileScreen, this::showLoginScreen, this::showDocScene), 1920, 1080);
        Page.setGuidedFormStage(mainStage);
        Page.setGuidedFormScene(guidedFormScene);
        mainStage.setScene(guidedFormScene);
    }
}
