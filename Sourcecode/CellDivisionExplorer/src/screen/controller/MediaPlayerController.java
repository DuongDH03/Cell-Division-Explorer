package screen.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

import cell.*;

public class MediaPlayerController {
    private Cell usedCell;
    private Cell unUsedCell;
    private String divisionTypeChoice;
    private Media media;
    private MediaPlayer mediaPlayer;
    public Integer[] timeStamp;


    public MediaPlayerController(Cell usedCell, Cell unUsedCell,  String divisionTypeChoice) {
    	if (divisionTypeChoice.equals("Ami")) {
    		this.usedCell = (Prokaryotic)usedCell;
    		this.unUsedCell = (Eukaryotic)unUsedCell;
    	}
    	else {
			this.usedCell = (Eukaryotic)usedCell;
			this.unUsedCell = (Prokaryotic)unUsedCell;
		}
        this.divisionTypeChoice = divisionTypeChoice;
    }

    @FXML
    private Button btnBack;

    @FXML
    private Button btnNextPhase;

    @FXML
    private Button btnPause;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnPrevPhase;

    @FXML
    private Button btnReplay;

    @FXML
    private Label lblDivision;

    @FXML
    private MediaView mediaView;

    @FXML
    private Slider timeBar;
    
    @FXML
    public void initialize() {
    	if (divisionTypeChoice.equals("Ami")) {
    		media = new Media(getClass().getResource(usedCell.getAsexual().getVideoDirectory()).toString());
    		mediaPlayer = new MediaPlayer(media);
    		mediaView.setMediaPlayer(mediaPlayer);
    		lblDivision.setText(usedCell.getAsexual().getDivision());
    		timeStamp = usedCell.getAsexual().getVideoTimeStamp();
    		
    	}
    	
    	else if (divisionTypeChoice.equals("Mei")) {
    		media = new Media(getClass().getResource(usedCell.getSexual().getVideoDirectory()).toString());
    		mediaPlayer = new MediaPlayer(media);
    		mediaView.setMediaPlayer(mediaPlayer);
    		lblDivision.setText(usedCell.getSexual().getDivision());
    		timeStamp = usedCell.getSexual().getVideoTimeStamp();
    	}
    	else {
    		media = new Media(getClass().getResource(usedCell.getAsexual().getVideoDirectory()).toString());
    		mediaPlayer = new MediaPlayer(media);
    		mediaView.setMediaPlayer(mediaPlayer);
    		lblDivision.setText(usedCell.getAsexual().getDivision());
    		timeStamp = usedCell.getAsexual().getVideoTimeStamp();
    	}
        
        mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
            @Override
            public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                timeBar.setValue(newValue.toSeconds());
            }
        });
        
        mediaPlayer.setOnReady(new Runnable() {
            @Override
            public void run() {
                Duration total = media.getDuration();
                timeBar.setMax(total.toSeconds());
            }
        });
        
        mediaPlayer.play();
    }

    @FXML
    void btnBackPressed(ActionEvent event) {
    	try {
    		mediaPlayer.stop();
            final String CELL_TYPE_PATH = "/screen/view/DivisionTypeMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CELL_TYPE_PATH));
            if (usedCell instanceof Eukaryotic)
            	fxmlLoader.setController(new DivisionTypeController(usedCell, unUsedCell));
            else {
            	fxmlLoader.setController(new DivisionTypeController(usedCell, unUsedCell));
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
    void btnPrevPhasePressed(ActionEvent event) {
    	for (int i = 0; i <timeStamp.length; i++) {
    		if (timeBar.getValue() > timeStamp[i] && timeBar.getValue() <= timeStamp[i+1] && timeBar.getValue() >= timeStamp[1]) {
				mediaPlayer.seek(Duration.seconds(timeStamp[i - 1]));
				break;
    		}
    		if (timeBar.getValue() >= timeStamp[timeStamp.length-1]) {
				mediaPlayer.seek(Duration.seconds(timeStamp[timeStamp.length -2] ));
				break;
    		}
    		if (timeBar.getValue() >= 0 && timeBar.getValue() <= timeStamp[1]) {
    			mediaPlayer.seek(Duration.seconds(timeStamp[0]));
				break;
    		}
    	}	
    }

    @FXML
    void btnNextPhasePressed(ActionEvent event) {		
    	for (int i = 0; i < timeStamp.length; i++) {
    			if (timeBar.getValue() < timeStamp[i]) {
    				mediaPlayer.seek(Duration.seconds(timeStamp[i]));
    				break;
    			}
    			if (timeBar.getValue() == timeStamp[i] && i < timeStamp.length) {
    				mediaPlayer.seek(Duration.seconds(timeStamp[i+1]));
    				break;
    			}
    		}
				
    	}	

    @FXML
    void btnPausePressed(ActionEvent event) {
    	mediaPlayer.pause();
    }

    @FXML
    void btnPlayPressed(ActionEvent event) {
    	mediaPlayer.play();
    }

    @FXML
    void btnReplayPressed(ActionEvent event) {
    	mediaPlayer.seek(Duration.seconds(0));
    }

    @FXML
    void mouseDrag(MouseEvent event) {
    	mediaPlayer.seek(Duration.seconds(timeBar.getValue()));
    }

    @FXML
    void mousePress(MouseEvent event) {
    	mediaPlayer.seek(Duration.seconds(timeBar.getValue()));
    }

}
