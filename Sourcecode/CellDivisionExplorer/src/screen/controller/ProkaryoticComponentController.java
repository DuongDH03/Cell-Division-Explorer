package screen.controller;

import java.io.IOException;
import java.util.ArrayList;

import cell.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProkaryoticComponentController {
	private Cell usedCell;
	private Cell unUsedCell;
	
	public ProkaryoticComponentController (Cell proCell, Cell euCell) {
		this.usedCell = proCell;
		this.unUsedCell = euCell;
	}

    @FXML
    private Button btnCapsule;

    @FXML
    private Button btnCyto;

    @FXML
    private Button btnFlage;

    @FXML
    private Button btnNucleoid;

    @FXML
    private Button btnPili;

    @FXML
    private Button btnPlasma;

    @FXML
    private Button btnPlasmid;

    @FXML
    private Button btnRibo;

    @FXML
    private Button btnWall;

    @FXML
    private Label lblFunction;

    @FXML
    private Label lblName;
    
    private void setButtonAction(Button button, String componentName) {
        button.setOnAction(event -> {
            ArrayList<Component> components = ((Prokaryotic) usedCell).getComponents();
            for (Component component : components) {
                if (component.getComponentName().equals(componentName)) {
                    lblFunction.setText(component.getComponentFunction());
                    lblName.setText(component.getComponentName());
                    break;
                }
            }
        });
    }

    @FXML
    void btnCapsulePressed(ActionEvent event) {
    	setButtonAction(btnCapsule, "Capsule");
    }

    @FXML
    void btnCytoPressed(ActionEvent event) {
    	setButtonAction(btnCyto, "Cytoplasm");
    }

    @FXML
    void btnFlagePressed(ActionEvent event) {
    	setButtonAction(btnFlage, "Flagellum");
    }

    @FXML
    void btnNucleoidPressed(ActionEvent event) {
    	setButtonAction(btnNucleoid, "Nucleoid");
    }

    @FXML
    void btnPiliPressed(ActionEvent event) {
    	setButtonAction(btnPili, "Pili");
    }

    @FXML
    void btnPlasmaPressed(ActionEvent event) {
    	setButtonAction(btnPlasma, "Plasma Membrane");
    }

    @FXML
    void btnPlasmidPressed(ActionEvent event) {
    	setButtonAction(btnPlasmid, "Plasmid");
    }

    @FXML
    void btnRiboPressed(ActionEvent event) {
    	setButtonAction(btnRibo, "Ribosomes");
    }

    @FXML
    void btnWallPressed(ActionEvent event) {
    	setButtonAction(btnWall, "Cell Wall");
    }
    
    @FXML
    public void btnBackPressed(ActionEvent event) {
    	try {
            final String CELL_TYPE_PATH = "/screen/view/CellTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            fxmlLoader.setController(new CellTypeController(unUsedCell, usedCell, "Component"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cell Division Explorer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

