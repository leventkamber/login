package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class AfterLoginController {

    @FXML
    private Button logOut;
    @FXML
    private Label login;


    public void userLogOut(ActionEvent event) throws Exception {
        Main main = new Main();
        main.changeScene("login.fxml");
    }


}
