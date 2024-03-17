/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller;

import channoufibank.Models.Model;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class LoginController implements Initializable {

    @FXML
    private ChoiceBox<?> acc_selector;
    @FXML
    private Label payee_address_lbl;
    @FXML
    private TextField payee_address_fld;
    @FXML
    private TextField password_fld;
    @FXML
    private Button login_btn;
    @FXML
    private Label error_lbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        login_btn.setOnAction(event ->Model.getInstance().getViewFactory().showClientWindow());
    }    
    
}
