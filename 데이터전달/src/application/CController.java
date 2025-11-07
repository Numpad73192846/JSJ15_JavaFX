package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CController implements DataReceiver {

	private Object receiveData;
	
    @FXML
    private TextField input;
    
    @FXML
    void initialize() {
    	System.out.println("# initialize #");
    	System.out.println("receiveData : " + this.receiveData);
    	
    	Platform.runLater( () -> {
    		System.out.println("# runLater() #");
    		System.out.println("receiveData : " + this.receiveData);
    	});
    }

    @FXML
    void to(ActionEvent event) {
    	
    }

	@Override
	public void receiveData(Object data) {
		if( data instanceof String text) {
			input.setText( text );
		}
		this.receiveData = data;
		System.out.println("# receiveData #");
		System.out.println("receiveData : " + receiveData);
	}

}
