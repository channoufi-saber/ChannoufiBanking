/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.client;

import java.net.URL;
import java.util.ResourceBundle;

import channoufibank.Models.Model;
import channoufibank.Models.Transaction;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class TransactionCellController implements Initializable {

    public Label trans_date_lbl;
    public Label sender_lbl;
    public Label receiver_lbl;
    public Button message_btn;
    public Label amount_lbl;

    private final Transaction transaction;
    @FXML
    private FontAwesomeIcon in_icon;
    @FXML
    private FontAwesomeIcon out_icon;

    public TransactionCellController(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sender_lbl.textProperty().bind(transaction.senderProperty());
        receiver_lbl.textProperty().bind(transaction.receiverProperty());
        amount_lbl.textProperty().bind(transaction.amountProperty().asString());
        trans_date_lbl.textProperty().bind(transaction.dateProperty().asString());
        transactionIcons();
    }

    private void transactionIcons() {
        if (transaction.senderProperty().get().equals(Model.getInstance().getClient().pAddressProperty().get())) {
            in_icon.setFill(Color.rgb(240, 240, 240));
            out_icon.setFill(Color.RED);
        } else {
            in_icon.setFill(Color.GREEN);
            out_icon.setFill(Color.rgb(240, 240, 240));
        }
    }
}
