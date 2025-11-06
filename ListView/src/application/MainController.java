package application;

import java.util.Arrays;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private TextField input;

    @FXML
    private ListView<String> listView;
    
    @FXML
    private Label item;
    
    // 현재 선택한 아이템
    String selectecItem;
    
    // 초기 데이터
    List<String> initList = Arrays.asList(
    		"아메리카노", "카페라떼", "카페모카", "카라멜 마끼아또", "캐모마일", "히비스커스"
    );
    
    @FXML
    public void initialize() {
    	// 데이터 초기화
    	listView.getItems().addAll(initList);
    	
    	// 리스트뷰 항목 선택 이벤트
    	listView.getSelectionModel().selectedItemProperty().addListener( new ChangeListener<String>() {

    		// 선택한 항목이 변경되었을 때 실행되는 메소드
			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// 선택한 항목을 지정
				selectecItem = listView.getSelectionModel().getSelectedItem();
				// 라벨에 지정
				item.setText( selectecItem );
			}
			
		} );
    	
    	// 리스트뷰의 더블 클릭 이벤트
    	listView.setOnMouseClicked( new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// 더블 클릭
				if( event.getClickCount() == 2) {
					System.out.println("더블 클릭");
					selectecItem = listView.getSelectionModel().getSelectedItem();
					System.out.println("선택된 아이템 : " + selectecItem);
					
					// TODO: 상세 화면으로 이동...
				}
			}
		});
    	
    }
    
    @FXML
    void add(ActionEvent event) {
    		System.out.println("추가!");
    		String text = input.getText();
    		if( text != null && !text.isEmpty() ) {
    			// 리스트뷰에 추가
    			listView.getItems().add(text);
    			// 입력 후 텍스트 필드 비우기
    			input.clear();
    		}
    }

    @FXML
    void delete(ActionEvent event) {
    	if( selectecItem == null || selectecItem.isEmpty() ) {
    		System.err.println("선택한 항목이 없습니다.");
    		return;
    	}
    	System.out.println("삭제!");
    	
    	listView.getItems().remove( selectecItem );
    	selectecItem = null;
    	item.setText("");
    	
    	// 선택 해제
    	listView.getSelectionModel().clearSelection();
    }

    @FXML
    void input(ActionEvent event) {

    }

}
