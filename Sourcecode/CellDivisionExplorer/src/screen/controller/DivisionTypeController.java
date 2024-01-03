package screen.controller;

import java.io.IOException;


import cell.*;
import division.Amitosis;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DivisionTypeController {
    private Cell cell;
    private String cellMenuChoice;

    public DivisionTypeController(Cell cell, String cellMenuChoice) {
        this.cell = cell;
        this.cellMenuChoice = cellMenuChoice;
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
    void btnAmitosisPressed(ActionEvent event) {
    	 try {
    		 final String MEDIA_PATH = "/screen/view/MediaPlayer.fxml";
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MEDIA_PATH));
             fxmlLoader.setController(new MediaPlayerController(cell, "Ami"));
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
    void btnMeiosisPressed(ActionEvent event) {
    	try {
   		 final String MEDIA_PATH = "/screen/view/MediaPlayer.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MEDIA_PATH));
            fxmlLoader.setController(new MediaPlayerController(cell, "Mei"));
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
    void btnMitosisPressed(ActionEvent event) {
    	try {
      		 final String MEDIA_PATH = "/screen/view/MediaPlayer.fxml";
               FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MEDIA_PATH));
               fxmlLoader.setController(new MediaPlayerController(cell, "Mit"));
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
    void btnBackPressed(ActionEvent event) {
    	try {
            final String CELL_TYPE_PATH = "/screen/view/CellTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            fxmlLoader.setController(new CellTypeController(cell, "Division"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cell Division Explorer");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize() {
        
        try {
        	if (cellMenuChoice.equals("Eu")) {
                btnAmitosis.setVisible(false);
                vbox.getChildren().remove(btnAmitosis);
            } else if (cellMenuChoice.equals("Pro")) {
                btnMeiosis.setVisible(false);
                btnMitosis.setVisible(false);
                vbox.getChildren().remove(btnMeiosis);
                vbox.getChildren().remove(btnMitosis);
            }
            final String DIVISION_TYPE_PATH = "/screen/view/DivisionTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(DIVISION_TYPE_PATH));
            fxmlLoader.setController(new CellTypeController(cell, "Division"));
            Parent root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
