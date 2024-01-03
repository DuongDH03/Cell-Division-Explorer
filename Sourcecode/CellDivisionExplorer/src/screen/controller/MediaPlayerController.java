package screen.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaView;

import cell.*;

public class MediaPlayerController {
    private Cell cell;
    private String divisionType;

    public MediaPlayerController(Cell cell, String divisionType) {
        this.cell = cell;
        this.divisionType = divisionType;
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
    void btnBackPressed(ActionEvent event) {

    }

    @FXML
    void btnNextPhasePressed(ActionEvent event) {

    }

    @FXML
    void btnPausePressed(ActionEvent event) {

    }

    @FXML
    void btnPlayPressed(ActionEvent event) {

    }

    @FXML
    void btnPrevPhasePressed(ActionEvent event) {

    }

    @FXML
    void btnReplayPressed(ActionEvent event) {

    }

    @FXML
    void mouseDrag(MouseEvent event) {

    }

    @FXML
    void mousePress(MouseEvent event) {

    }

}
