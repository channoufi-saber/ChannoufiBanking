/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class CreateClientController implements Initializable {

    @FXML
    private TextField fName_fld;
    @FXML
    private TextField lName_fld;
    @FXML
    private TextField password_fld;
    @FXML
    private CheckBox pAddress_box;
    @FXML
    private Label pAddress_lbl;
    @FXML
    private CheckBox ch_acc_box;
    @FXML
    private TextField ch_amount_fld;
    @FXML
    private CheckBox sv_acc_box;
    @FXML
    private TextField sv_amount_fld;
    @FXML
    private Button create_client_btn;
    @FXML
    private Label error_lbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }

}
