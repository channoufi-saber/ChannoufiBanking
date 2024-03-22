/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class AccountsController implements Initializable {

    @FXML
    private Label ch_acc_num;
    @FXML
    private Label transaction_limit;
    @FXML
    private Label ch_acc_date;
    @FXML
    private Label ch_acc_bal;
    @FXML
    private Label sv_acc_num;
    @FXML
    private Label withdrawal_limit;
    @FXML
    private Label sv_acc_date;
    @FXML
    private Label sv_acc_bal;
    @FXML
    private TextField amount_to_sv;
    @FXML
    private Button trans_to_sv_btn;
    @FXML
    private TextField amount_to_ch;
    @FXML
    private Button trans_to_cv_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
