package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label helloLabel;

    @FXML
    private TextField UserNameTextField;

    public void changeText(ActionEvent event){
        helloLabel.setText("Tekstas pakeistas");
    }
    public void changeUserName(ActionEvent event){
        String name = UserNameTextField.getText();
        UserNameTextField.setText("");
        helloLabel.setText(name);
    }
}
