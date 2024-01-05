package screen.controller;

import cell.Cell;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelpController {
	private Cell euCell;
	private Cell proCell;
	
	public HelpController(Cell euCell, Cell proCell) {
		this.euCell = euCell;
		this.proCell = proCell;
	}
    @FXML
    private Button btnBack;

    @FXML
    void btnBackPressed(ActionEvent event) {
        final String MAIN_FXML_PATH  = "/screen/view/MainMenu.fxml";
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader();
    		fxmlLoader.setLocation(getClass().getResource(MAIN_FXML_PATH ));
    		fxmlLoader.setController(new MainMenuController(euCell, proCell));
    		Parent root = fxmlLoader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cell Division Explorer");
            stage.show();
    	} catch (Exception e) {
            e.printStackTrace();
        }
    }

}
