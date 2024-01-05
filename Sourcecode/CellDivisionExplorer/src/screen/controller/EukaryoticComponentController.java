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

public class EukaryoticComponentController {
    private Cell usedCell;
    private Cell unUsedCell;

    public EukaryoticComponentController (Cell euCell, Cell proCell) {
        this.usedCell = euCell;
        this.unUsedCell = proCell;
    }

    @FXML
    private Button btnBack;

    @FXML
    private Button btnChromatin;

    @FXML
    private Button btnCyto;

    @FXML
    private Button btnGolgi;

    @FXML
    private Button btnInterFilaments;

    @FXML
    private Button btnLysosome;

    @FXML
    private Button btnMicrofilament;

    @FXML
    private Button btnMicrotubule;

    @FXML
    private Button btnMito;

    @FXML
    private Button btnNuclear;

    @FXML
    private Button btnNucleolus;

    @FXML
    private Button btnNucleoplasm;

    @FXML
    private Button btnPero;

    @FXML
    private Button btnPlasma;

    @FXML
    private Button btnRibo;

    @FXML
    private Button btnRoughEndo;

    @FXML
    private Button btnSmoothEndo;

    @FXML
    private Button btnVacuole;

    @FXML
    private Label lblFunction;

    @FXML
    private Label lblName;

    private void setButtonAction(Button button, String componentName) {
        button.setOnAction(event -> {
            ArrayList<Component> components = ((Eukaryotic) usedCell).getComponents();
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
    void btnBackPressed(ActionEvent event) {
        try {
            final String CELL_TYPE_PATH = "/screen/view/CellTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            fxmlLoader.setController(new CellTypeController(usedCell, unUsedCell, "Component"));
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
    void btnChromatinPressed(ActionEvent event) {
        setButtonAction(btnChromatin, "Chromatin");
    }

    @FXML
    void btnCytoPressed(ActionEvent event) {
        setButtonAction(btnCyto, "Cytoplasm");
    }

    @FXML
    void btnGolgiPressed(ActionEvent event) {
        setButtonAction(btnGolgi, "Golgi Apparatus");
    }

    @FXML
    void btnInterFilamentsPressed(ActionEvent event) {
        setButtonAction(btnInterFilaments, "Intermediate Filaments");
    }

    @FXML
    void btnLysosomePressed(ActionEvent event) {
        setButtonAction(btnLysosome, "Lysosome");
    }

    @FXML
    void btnMicrofilamentPressed(ActionEvent event) {
        setButtonAction(btnMicrofilament, "Microfilament");
    }

    @FXML
    void btnMicrotubulePressed(ActionEvent event) {
        setButtonAction(btnMicrotubule, "Microtubule");
    }

    @FXML
    void btnMitoPressed(ActionEvent event) {
        setButtonAction(btnMito, "Mitochondria");
    }

    @FXML
    void btnNuclearPressed(ActionEvent event) {
        setButtonAction(btnNuclear, "Nuclear Envelope");
    }

    @FXML
    void btnNucleolusPressed(ActionEvent event) {
        setButtonAction(btnNucleolus, "Nucleolus");
    }

    @FXML
    void btnNucleoplasmPressed(ActionEvent event) {
        setButtonAction(btnNucleoplasm, "Nucleoplasm");
    }

    @FXML
    void btnPeroPressed(ActionEvent event) {
        setButtonAction(btnPero, "Peroxisome");
    }

    @FXML
    void btnPlasmaPressed(ActionEvent event) {
        setButtonAction(btnPlasma, "Plasma Membrane");
    }

    @FXML
    void btnRiboPressed(ActionEvent event) {
        setButtonAction(btnRibo, "Ribosome");
    }

    @FXML
    void btnRoughEndoPressed(ActionEvent event) {
        setButtonAction(btnRoughEndo, "Rough Endoplasmic Reticulum");
    }

    @FXML
    void btnSmoothEndo(ActionEvent event) {
        setButtonAction(btnSmoothEndo, "Smooth Endoplasmic Reticulum");
    }

    @FXML
    void btnVacuolePressed(ActionEvent event) {
        setButtonAction(btnVacuole, "Vacuole");
    }

}

