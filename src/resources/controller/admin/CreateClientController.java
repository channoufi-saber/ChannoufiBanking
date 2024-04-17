/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.admin;

import java.net.URL;
import java.time.LocalDate;
import java.util.Random;
import java.util.ResourceBundle;

import channoufibank.Models.Model;
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

    private String payeeAddress;
    private boolean createCheckingAccountFlag = false;
    private boolean createSavingsAccountFlag = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        create_client_btn.setOnAction(event -> createClient());
        pAddress_box.selectedProperty().addListener((observableValue, oldVal, newVal) -> {
            if (newVal) {
                payeeAddress = createPayeeAddress();
                onCreatePayeeAddress();
            }
        });
        ch_acc_box.selectedProperty().addListener((observableValue, oldVal, newVal) -> {
            if (newVal) {
                createCheckingAccountFlag = true;
            }
        });
        sv_acc_box.selectedProperty().addListener((observableValue, oldVal, newVal) -> {
            if (newVal) {
                createSavingsAccountFlag = true;
            }
        });
    }

    private void createClient() {
        if (createCheckingAccountFlag) {
            createAccount("Checking");
        }
        if (createSavingsAccountFlag) {
            createAccount("Savings");
        }
        String fName = fName_fld.getText();
        String lName = lName_fld.getText();
        String password = password_fld.getText();
        Model.getInstance().getDatabaseDriver().createClient(fName, lName, payeeAddress, password, LocalDate.now());
        error_lbl.setStyle("-fx-text-fill:blue; -fx-font-size:1.3em; -fx-font-weight:bold");
        error_lbl.setText("Client Created Successfully");
        emptyFields();
    }

    private void createAccount(String accountType) {
        double balance = Double.parseDouble(ch_amount_fld.getText());
        String firstSection = "3201";
        String lastSection = Integer.toString((new Random()).nextInt(9999) + 1000);
        String accountNumber = firstSection + " " + lastSection;
        if (accountType.equals("Checking")) {
            Model.getInstance().getDatabaseDriver().createCheckingAccount(payeeAddress, accountNumber, 10, balance);
        } else {
            Model.getInstance().getDatabaseDriver().createSavingsAccount(payeeAddress, accountNumber, 2000, balance);
        }
    }

    private void onCreatePayeeAddress() {
        if (fName_fld.getText() != null & lName_fld.getText() != null) {
            pAddress_lbl.setText(payeeAddress);
        }
    }

    private String createPayeeAddress() {
        int id = Model.getInstance().getDatabaseDriver().getLastClientsId() + 1;
        char fChar = Character.toLowerCase(fName_fld.getText().charAt(0));
        return "@" + fChar + lName_fld.getText() + id;
    }

    private void emptyFields() {
        fName_fld.setText("");
        lName_fld.setText("");
        password_fld.setText("");
        pAddress_box.setSelected(false);
        pAddress_lbl.setText("");
        ch_acc_box.setSelected(false);
        ch_amount_fld.setText("");
        sv_acc_box.setSelected(false);
        sv_amount_fld.setText("");
    }
}
