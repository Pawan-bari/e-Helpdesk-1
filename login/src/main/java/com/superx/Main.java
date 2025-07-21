package com.superx;





import com.superx.Controller.ViewController;
import com.superx.Controller.firebasesdk;
import com.superx.view.Profile.Storage;

import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
         firebasesdk.initialize();
        ViewController controller = new ViewController(primaryStage);
        primaryStage.setTitle("E-Help Desk");
        primaryStage.setFullScreen(true); 
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}