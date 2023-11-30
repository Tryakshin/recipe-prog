package com.recipe.kosenok;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstController {

    @FXML
    private Button harcho;

    @FXML
    private Button solyanka;

    @FXML
    private Button soup;

    @FXML
    private Button uha;
    @FXML
    private Button backToMainWindow;

    @FXML
    void initialize() {
        backToMainWindow.setOnAction(event -> {
            Stage currentStage = (Stage) backToMainWindow.getScene().getWindow();

            currentStage.close();

            /*FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/recipe/kosenok/hello-view.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();*/
        });

    }

}

