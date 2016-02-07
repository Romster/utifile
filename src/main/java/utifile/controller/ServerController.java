package utifile.controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by r0m5t3r on 1/19/16.
 */
public class ServerController extends BaseController {
    @FXML
    private Parent root;

    @FXML
    private Button actionListButton;

    @FXML
    private void initialize() {
        actionListButton.setOnMouseClicked(event -> {
            Stage stage = new Stage();
            Parent root = loadParentFXMLComponent("actionlist");
            stage.setTitle("After file uploaded actions");
            stage.setScene(new Scene(root, 300, 450));
            stage.show();
        });
    }


}
