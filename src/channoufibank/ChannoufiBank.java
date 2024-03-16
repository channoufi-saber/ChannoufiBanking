/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package channoufibank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author channoufisaber
 */
public class ChannoufiBank extends Application {
    
   private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
         FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/resources/fxml/client/Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    } 
    

    
    public static void main(String[] args) {
        launch();
    }

    
}
