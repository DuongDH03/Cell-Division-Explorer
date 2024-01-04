package screen.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.*;

import cell.Cell;


public class MainMenuController {
	private Cell euCell;
	private Cell proCell;
	
	public MainMenuController(Cell euCell, Cell proCell) {
		this.euCell = euCell;
		this.proCell = proCell;
	}
	
    @FXML
    private Button btnComponent;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnHelp;

    @FXML
    private Button btnQuit;

    @FXML
    void btnComponentPressed(ActionEvent event) {
    	try {
            final String CELL_TYPE_PATH = "/screen/view/CellTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            fxmlLoader.setController(new CellTypeController(euCell, proCell, "Component"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cell Division Explorer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnDivisionPressed(ActionEvent event) {
    	try {
            final String CELL_TYPE_PATH = "/screen/view/CellTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            fxmlLoader.setController(new CellTypeController(euCell, proCell, "Division"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cell Division Explorer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnHelpPressed(ActionEvent event) {

    }

    @FXML
    void btnQuitPressed(ActionEvent event) {

    }
    
    @FXML
    public void initialize() {
    	final String MAIN_FXML_PATH  = "/screen/view/MainMenu.fxml";
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader();
    		fxmlLoader.setLocation(getClass().getResource(MAIN_FXML_PATH ));
    	} catch (Exception e) {
            e.printStackTrace();
        }
    }

}
