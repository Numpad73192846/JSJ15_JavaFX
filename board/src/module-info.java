module board {
	requires javafx.controls;
	requires javafx.fxml;
	requires lombok;
	requires java.sql;
	requires javafx.base;
	
	// controller에서 fxml모듈을 사용하도록 열어준다.
	opens application.controller to javafx.fxml;
	// DTO에서 base모듈을 사용하도록 열어준다.
	opens application.DTO to javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
