package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	// 화면 A, B 객체 선언
	private Scene sceneA, sceneB;
	
	@Override
	public void start(Stage stage) {
		// Scene A 생성
		// 컨테이너 생성(StackPane)
		StackPane containerA = new StackPane();
		// 컨테이너 지정하여 sceneA 생성
		sceneA = new Scene(containerA, 300, 200);
		// 버튼 생성
		Button switchButton = new Button("B 화면으로 이동");
		// 컨테이너 아래 버튼 지정
		containerA.getChildren().add(switchButton);
		// 버튼 클릭 이벤트 정의 : B 화면으로 이동
		switchButton.setOnAction( e -> stage.setScene(sceneB) );
		
		// Scene B 생성
		Button backButton = new Button("A 화면으로 이동");			// 버튼 생성
		backButton.setOnAction( e -> stage.setScene(sceneA) );	// 화면 A로 이동하는 클릭 이벤트
		StackPane containerB = new StackPane(backButton);		// 컨테이너에 버튼 지정
		sceneB = new Scene(containerB, 300, 200);				// 컨테이너 지정하여 sceneB 생성
		
		// 시작 화면 Scene 설정
		stage.setScene(sceneA);							// 화면 A로 시작
		stage.setTitle("Java FX - Scene 화면 이동");		// 원도우 타이틀 설정
		stage.show();									// 원도우 출력
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
