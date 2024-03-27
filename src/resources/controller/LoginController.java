/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller;

import channoufibank.Models.Model;
import channoufibank.Views.AccountType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class LoginController implements Initializable {

    @FXML
    private ChoiceBox<AccountType> acc_selector;
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
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.Client, AccountType.Admin));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue()));
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.Client) {
            Model.getInstance().getViewFactory().showClientWindow();
        } else {
            Model.getInstance().getViewFactory().showAdminWindow();
        }
    }

}
