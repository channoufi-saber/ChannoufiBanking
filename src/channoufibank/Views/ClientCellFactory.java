package channoufibank.Views;

import channoufibank.Models.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import resources.controller.admin.ClientCellController;

public class ClientCellFactory extends ListCell<Client> {

    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/fxml/admin/ClientCell.fxml"));
            ClientCellController controller = new ClientCellController(client);
            loader.setController(controller);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
