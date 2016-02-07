package utifile.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by r0m5t3r on 1/20/16.
 */
 abstract class BaseController {

    /**
     * @param fxmlFileName without directory and extension
     * @return
     */
    protected final Parent loadParentFXMLComponent(String fxmlFileName) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../../layout/" + fxmlFileName + ".fxml"));
            return root;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    protected final Stage getStage(Node node) {
        return (Stage) node.getScene().getWindow();
    }

}
