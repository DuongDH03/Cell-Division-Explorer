package screen.controller;

import java.io.IOException;

import cell.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DivisionTypeController {
    private Cell usedCell;
    private Cell unUsedCell;

    public DivisionTypeController(Cell usedCell, Cell unUsedCell) {
        if (usedCell instanceof Eukaryotic){
        	this.usedCell = (Eukaryotic)usedCell;	
        	this.unUsedCell = (Prokaryotic)unUsedCell;
		}
        else if (usedCell instanceof Prokaryotic) {
        	this.usedCell = (Prokaryotic)usedCell;
        	this.unUsedCell = (Eukaryotic)unUsedCell;
        }
    }
    
    @FXML
    private VBox vbox;
    
    @FXML
    private Button btnAmitosis;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnMeiosis;

    @FXML
    private Button btnMitosis;

    @FXML
    public void btnAmitosisPressed(ActionEvent event) {
    	 try {
    		 final String MEDIA_PATH = "/screen/view/MediaPlayer.fxml";
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MEDIA_PATH));
             fxmlLoader.setController(new MediaPlayerController(usedCell, unUsedCell, "Ami"));
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
    public void btnMeiosisPressed(ActionEvent event) {
    	try {
   		 final String MEDIA_PATH = "/screen/view/MediaPlayer.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MEDIA_PATH));
            fxmlLoader.setController(new MediaPlayerController(usedCell, unUsedCell, "Mei"));
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
    public void btnMitosisPressed(ActionEvent event) {
    	try {
      		 final String MEDIA_PATH = "/screen/view/MediaPlayer.fxml";
               FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MEDIA_PATH));
               fxmlLoader.setController(new MediaPlayerController(usedCell, unUsedCell, "Mit"));
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
    public void btnBackPressed(ActionEvent event) {
    	try {
            final String CELL_TYPE_PATH = "/screen/view/CellTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            if (usedCell instanceof Eukaryotic) {
                fxmlLoader.setController(new CellTypeController(usedCell,unUsedCell, "Division"));
            }
            else {
                fxmlLoader.setController(new CellTypeController(unUsedCell, usedCell, "Division"));

            }
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
    public void initialize() {
        try {
        	if (usedCell instanceof Eukaryotic) {
                btnAmitosis.setVisible(false);
                vbox.getChildren().remove(btnAmitosis);
                
                
            } else if (usedCell instanceof Prokaryotic) {
                btnMeiosis.setVisible(false);
                btnMitosis.setVisible(false);
                vbox.getChildren().remove(btnMeiosis);
                vbox.getChildren().remove(btnMitosis); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
