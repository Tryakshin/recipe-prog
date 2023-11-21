package com.recipe.kosenok;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button create_recipe;

    @FXML
    private Button exit;

    @FXML
    private Button pick_recipe;

    @FXML
    void initialize() {
        assert create_recipe != null : "fx:id=\"create_recipe\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pick_recipe != null : "fx:id=\"pick_recipe\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
