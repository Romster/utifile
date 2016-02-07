package utifile.controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;

/**
 * Created by r0m5t3r on 1/18/16.
 */
public class ClientController {
    @FXML
    private Button chooseFileButton;
    @FXML
    private Button uploadFileButton;
    @FXML
    private Parent parent;
    @FXML
    private TextArea fileName;
    @FXML
    private TextField addressField;
    @FXML
    private TextField portField;
    @FXML
    private PasswordField passwordField;

    private FileChooser fileChooser;


    @FXML
    private void initialize() {
        fileChooser = new FileChooser();
        fileChooser.setTitle("Choose file to upload");
        chooseFileButton.setOnMouseClicked(event -> {
            File f = fileChooser.showOpenDialog(parent.getScene().getWindow());
            if (f != null) {
                fileName.setText(f.getAbsolutePath());
            }
        });
    }
}
