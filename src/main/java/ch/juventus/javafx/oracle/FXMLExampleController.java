package ch.juventus.javafx.oracle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML private Text actiontarget;
    @FXML private TextField user;
    @FXML private PasswordField password;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed "+ user.getText() + " " + password.getText());
    }

}
