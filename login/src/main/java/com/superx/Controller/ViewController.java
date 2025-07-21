package com.superx.Controller;

import com.superx.view.Document.documents;
import com.superx.view.Loginpages.forgot;
import com.superx.view.Loginpages.login;
import com.superx.view.Loginpages.signup;
import com.superx.view.Loginpages.terms;
import com.superx.view.Profile.AccountSetting;
import com.superx.view.Profile.Notification;
import com.superx.view.Profile.ProfilePage;
import com.superx.view.Profile.SecurityPage;
import com.superx.view.Profile.Storage;
import com.superx.view.landRecords.landRecords;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ViewController {

     private LoginController loginController;
    private SignupController signupController;
    private ForgotpassController forgotPasswordController;
    
    private Stage mainStage;
 private static String currentUserId;
    
    private Scene loginScene, signupScene, forgotScene, termsScene, docScene, profileScene, accScene, securityScene, notiScene , stoScene,landRecordsScene;

    public ViewController(Stage stage) {
        this.mainStage = stage;

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
        forgotScene = new Scene(forgotPage.forgotBox(this::showLoginScreen,this), 1920, 1080);
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






    public void showDocScene() {
        documents docPage = new documents();
        docScene = new Scene(docPage.docScenBox(this::showProfileScreen, this::showLoginScreen,this::showLandRecordsScreen), 1920, 1080);  
        docPage.setDocStage(mainStage);
        docPage.setDocScene(docScene);
        mainStage.setScene(docScene);
    }





    public void showProfileScreen() {
        ProfilePage profile = new ProfilePage();
        profileScene = new Scene(profile.profilebox(this::showAccountScreen, this::showSecurityScreen, this::showDocScene, this::showNotification,this::showStorage), 1920, 1080);
        profile.setProfStage(mainStage);
        profile.setProfScene(profileScene);
        mainStage.setScene(profileScene);
    }

    public void showAccountScreen() {
        AccountSetting accPage = new AccountSetting();
        accScene = new Scene(accPage.accountSettingsBox(this::showProfileScreen, this::showSecurityScreen, this::showDocScene,this::showNotification,this::showStorage), 1920, 1080);
        accPage.setAccStage(mainStage);
        accPage.setAccScene(accScene);
        mainStage.setScene(accScene);
    }

    public void showSecurityScreen() {
        SecurityPage secPage = new SecurityPage();
        securityScene = new Scene(secPage.securityPageBox(this::showProfileScreen, this::showAccountScreen,this::showDocScene,this::showNotification,this::showStorage, null), 1920, 1080);
        secPage.setSecStage(mainStage);
        secPage.setSecscene(securityScene);
        mainStage.setScene(securityScene);
    }
    public void showNotification(){
        Notification notpage = new Notification();
        notiScene = new Scene(notpage.notificationPageBox(this::showProfileScreen, this::showAccountScreen,this::showSecurityScreen, this::showDocScene,this::showStorage),1920,1080);
        notpage.setNotiStage(mainStage);
        notpage.setNotiScene(notiScene);
        mainStage.setScene(notiScene);

    }
     public void showStorage(){
        Storage stopage = new Storage();
        stoScene = new Scene(stopage.createStoragePage(this::showProfileScreen, this::showAccountScreen,this::showSecurityScreen, this::showNotification),1920,1080);
        stopage.setStoStage(mainStage);
        stopage.setStoScene(stoScene);
        mainStage.setScene(stoScene);

    }

    public void showLandRecordsScreen() {
    landRecords landRecordsPage = new landRecords();
    landRecordsScene = new Scene(landRecordsPage.landRecordsBox(this::showProfileScreen, this::showLoginScreen,this::showDocScene), 1920, 1080);
    landRecordsPage.setLandStage(mainStage);
    landRecordsPage.setLandScene(landRecordsScene);
    mainStage.setScene(landRecordsScene);
}

}
