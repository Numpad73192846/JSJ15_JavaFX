package application.controller;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import application.util.DataReceiver;
import application.util.StageManager;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReadController implements DataReceiver {

    @FXML private TextArea inputContent;
    @FXML private TextField inputTitle;
    @FXML private TextField inputWriter;
    
    Integer no;		// 게시글 번호
    
    BoardService boardService = new BoardServiceImpl();
    
    @FXML
    void initialize() {
    	Platform.runLater( () -> {
    		Board board = boardService.select(this.no);
    		inputTitle.setText( board.getTitle() );
    		inputWriter.setText( board.getWriter() );
    		inputContent.setText( board.getContent() );
    	});
    }
    
    @FXML
    void list(ActionEvent event) {
    	StageManager.show("Main");
    }

    @FXML
    void update(ActionEvent event) {
    	StageManager.show("UI/Update", this.no);
    }

	@Override
	public void receiveData(Object data) {
		this.no = (Integer) data;
	}

}
