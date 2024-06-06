/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package channoufibank;

import channoufibank.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

/**
 *
 * @author channoufisaber
 */
public class ChannoufiBank extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Model.getInstance().getViewFactory().showLoginWindow();
    }

    public static void main(String[] args) {
        launch();
    }

}
