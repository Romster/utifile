package utifile.controller;

import com.sun.net.httpserver.HttpServer;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.InetSocketAddress;

public class MainController extends BaseController {
    @FXML
    private Parent root;

    @FXML
    private Button clientButton;
    @FXML
    private Button serverButton;
    @FXML
    private TextField serverPortField;
    @FXML
    private PasswordField serverPasswordField;


    @FXML
    private void initialize() {
        clientButton.setOnMouseClicked(event1 -> {
            Parent newRoot = loadParentFXMLComponent("client");
            Stage stage = getStage(root);
            stage.setTitle("UtiFile *client*");
            stage.setScene(new Scene(newRoot, 300, 300));
        });
        serverPortField.setText("8800");//5553535
        serverButton.setOnMouseClicked(event -> {
            try {
                Integer port = Integer.valueOf(serverPortField.getText());
                HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
                server.start();
                server.stop(0);
            } catch (Exception e) {
                e.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR, "Cannot start server", ButtonType.CANCEL);
                alert.showAndWait();
            }
            Parent newRoot = loadParentFXMLComponent("server");
            Stage stage = getStage(root);
            stage.setTitle("UtiFile *server*");
            stage.setScene(new Scene(newRoot, 300, 300));
        });
    }
}
