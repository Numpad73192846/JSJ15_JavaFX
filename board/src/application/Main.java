package application;
	
import application.util.StageManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		StageManager.initialize(stage);
		StageManager.show("Main");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
