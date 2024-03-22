/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.client;

import channoufibank.Models.Model;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class ClientController implements Initializable {

    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case "Transactions" ->
                    client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
                case "Accounts" ->
                    client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                default ->
                    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }

}
