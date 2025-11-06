package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;

public class Main extends Application {
	
	/**
	 * start()
	 * : 화면 시작 메소드
	 */
	@Override
	public void start(Stage stage) {
		// 단일 stage 객체로부터 화면이 시작된다.
		// Scene 을 지정하기 위한 Group 객체 <- 컨테이너
		Group root = new Group();
		// Scene 생성
		Scene scene = new Scene(root);
		
		// 원도우 크기 지정 - pixel 단위
		stage.setWidth(600);
		stage.setHeight(400);
		
		// 윈도우 출력 위치 지정
		// stage.setX(500);
		// stage.setY(200);
		stage.centerOnScreen();
		
		// 크기 조절 활겅화 설정
		stage.setResizable(false);
		
		// 전체 화면 모드
		// stage.setFullScreen(true);
		// 전체화면 종료 힌트 텍스트
		 stage.setFullScreenExitHint("전체화면 종료 (Q)");
		// Q 입력시 전체화면 종료
		 stage.setFullScreenExitKeyCombination( KeyCombination.valueOf("Q"));
		
		// 윈도우 제목 설정
		stage.setTitle("프로그램 이름");
		// 프로그램 아이콘 지정
		Image icon = new Image("icon.png"); // src 폴더 아래 icon.png 저장
		stage .getIcons().add(icon);
		
		// Scene 을 Stage 에 지정
		stage.setScene(scene);
		// Stage 출력
		stage.show();
		
		
	}	
	public static void main(String[] args) {
		launch(args);
	}
}
