package screen.test;

import java.awt.image.ComponentSampleModel;
import java.util.ArrayList;

import cell.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import screen.controller.MainMenuController;

public class MainMenuTest extends Application {
	Cell euCell = new Eukaryotic("nut", null);
	Cell proCell;
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		ArrayList<Component> components = new ArrayList<Component>();

		Component capsule = new Component("Capsule", 
				"Provides protection for outer layer of the Cell");
		Component cytoplasm = new Component("Cytoplasm", 
				"Metabolic reactions");
		Component flage = new Component("Flagellum", 
				"Help Cell movement");
		Component nucleoid = new Component("Nucleoid", 
				"Aka. DNA, Location of chromosomal DNA");
		Component pili = new Component("Pili", 
				"Help Cell attachment and DNA conjugation");
		Component plasma = new Component("Plasma Membrane", 
				"Control substance in and out of Cell");
		Component plasmid = new Component("Plasmid", 
				"Pieces of DNA carry Genes that confer a selective advantage to the organism");
		Component ribosomes = new Component("Ribosomes", 
				"Assembling Amino Acids and Reading Genetic Information");
		Component cellWall = new Component("Cell Wall", 
				"Provides structural support and protection");
		
		components.add(capsule);
		components.add(cytoplasm);
		components.add(flage);
		components.add(nucleoid);
		components.add(pili);
		components.add(plasma);
		components.add(plasmid);
		components.add(ribosomes);
		components.add(cellWall);
		
		proCell = new Prokaryotic("bruh", components);
		
        final String MAIN_FXML_PATH = "/screen/view/MainMenu.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MAIN_FXML_PATH ));
        MainMenuController viewStoreController = new MainMenuController(euCell, proCell);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Cell Division Explorer");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }   

	public static void main(String[] args) {		
		
		
		launch(args);
	}

}
