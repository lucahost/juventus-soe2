package ch.juventus.javafx.baelding;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SearchController {

    @FXML
    private TextField searchField;
    @FXML
    private Button searchButton;

    @FXML
    private void initialize() {
        // search panel
        searchButton.setText("Search");
        searchButton.setOnAction(event -> loadData());
        searchButton.setStyle("-fx-background-color: #457ecd; -fx-text-fill: #ffffff;");
    }

    private void loadData() {
        System.out.println("Load data");
    }
}
