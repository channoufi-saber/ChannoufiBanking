/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package resources.controller.admin;

import java.net.URL;
import java.util.ResourceBundle;

import channoufibank.Models.Model;
import channoufibank.Views.ClientCellFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author channoufisaber
 */
public class ClientsController implements Initializable {

    public ListView clients_listview;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initClientsList();
        clients_listview.setItems(Model.getInstance().getClients());
        clients_listview.setCellFactory(e -> new ClientCellFactory());
    }

    private void initClientsList() {
        if (Model.getInstance().getClients().isEmpty()) {
            Model.getInstance().setClients();
        }
    }

}
