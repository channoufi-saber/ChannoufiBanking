/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.admin;

import channoufibank.Models.Client;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class ClientCellController implements Initializable {

    public Label fName_lbl;
    public Label lName_lbl;
    public Label pAddress_lbl;
    public Label ch_acc_lbl;
    public Label sv_acc_lbl;
    public Label date_lbl;
    public Button delete_btn;

    private final Client client;

    public ClientCellController(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fName_lbl.textProperty().bind(client.firstNameProperty());
        lName_lbl.textProperty().bind(client.lastNameProperty());
        pAddress_lbl.textProperty().bind(client.pAddressProperty());
        ch_acc_lbl.textProperty().bind(client.checkingAccountProperty().asString());
        sv_acc_lbl.textProperty().bind(client.savingsAccountProperty().asString());
        date_lbl.textProperty().bind(client.dateProperty().asString());
    }

}
