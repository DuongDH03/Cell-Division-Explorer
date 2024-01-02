package screen.controller;

import javafx.scene.control.Button;
import javafx.event.*;

import cell.Cell;
import javafx.fxml.FXML;

public class CellTypeController {
	private Cell cell;
	private String menuChoice; 
	
    @FXML
    private Button btnEu;

    @FXML
    private Button btnPro;

    @FXML
    void btnEuPressed(ActionEvent event) {
    	
    }

    @FXML
    void btnProPressed(ActionEvent event) {

    }
    
    public CellTypeController(Cell cell, String menuChoice) {
    	this.cell = cell;
		this.menuChoice = menuChoice;
	}

}
