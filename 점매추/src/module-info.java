module 점매추 {
	requires javafx.controls;
	requires javafx.fxml;
	requires lombok;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
