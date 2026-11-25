package eus.liburutegia.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LiburuFormController {
    @FXML private TextField izenburuaField;
    @FXML private TextField egileaField;
    @FXML private TextField urteaField;
    @FXML private Label mezuaLabel;

    @FXML
    private void initialize(){
        mezuaLabel.setText("Bete formularioa eta sakatu Gorde");
    }

    @FXML
    private void gorde(){
        String izenburua = izenburuaField.getText();
        String egilea = egileaField.getText();
        String urtea = urteaField.getText();
    }


}
