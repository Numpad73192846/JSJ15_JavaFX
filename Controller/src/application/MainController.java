package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    void click(ActionEvent event) {
    	String title = label.getText();
    	System.out.println("화면 이름 : " + title);
    	System.out.println("버튼 클릭!");
    }

}
