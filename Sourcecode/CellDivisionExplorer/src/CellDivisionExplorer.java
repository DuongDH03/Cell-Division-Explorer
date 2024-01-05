import cell.*;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import screen.controller.MainMenuController;

public class CellDivisionExplorer extends Application {
	Cell euCell;
	Cell proCell;
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		ArrayList<Component> proComponents = new ArrayList<Component>();
		ArrayList<Component> euComponents = new ArrayList<Component>();

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
		
		
		proComponents.add(capsule);
		proComponents.add(cytoplasm);
		proComponents.add(flage);
		proComponents.add(nucleoid);
		proComponents.add(pili);
		proComponents.add(plasma);
		proComponents.add(plasmid);
		proComponents.add(ribosomes);
		proComponents.add(cellWall);
		
		proCell = new Prokaryotic("Prokaryotic", proComponents);

        euComponents.add(new Component("Rough Endoplasmic Reticulum", "Involved in the synthesis of proteins"));
        euComponents.add(new Component("Smooth Endoplasmic Reticulum", "Involved in lipid synthesis and detoxification of harmful substances"));
        euComponents.add(new Component("Peroxisome", "Involved in the breakdown of fatty acids and the detoxification of harmful substances"));
        euComponents.add(new Component("Microfilament", "Part of the cell's cytoskeleton and are involved in cell movement and shape changes"));
        euComponents.add(new Component("Mitochondria", "Produces energy in the form of ATP through the process of cellular respiration"));
        euComponents.add(new Component("Vacuole", "Involved in storage of water, nutrients, and waste products"));
        euComponents.add(new Component("Golgi Apparatus", "Modifies, sorts, and packages proteins and lipids for transport"));
        euComponents.add(new Component("Nuclear Envelope", "Separates the contents of the nucleus from the cytoplasm\nand regulates the passage of molecules in and out of the nucleus"));
        euComponents.add(new Component("Chromatin", "Material that makes up chromosomes, consisting of DNA and proteins"));
        euComponents.add(new Component("Nucleoplasm", "Substance within the nucleus, where essential processes such as DNA replication and transcription occur"));
        euComponents.add(new Component("Nucleolus", "Involved in the production of ribosomes"));
        euComponents.add(new Component("Plasma Membrane", "Semi-permeable barrier that controls the movement of substances in and out of the cell"));
        euComponents.add(new Component("Ribosome", "Site of protein synthesis"));
        euComponents.add(new Component("Intermediate Filaments", "Provide mechanical support for the cell and help maintain its shape"));
        euComponents.add(new Component("Cytoplasm", "Jelly-like substance where all the cellular organelles are suspended\nand where most of the cell's metabolic reactions occur"));
        euComponents.add(new Component("Microtubule", "Part of the cell's cytoskeleton and are involved in maintaining cell shape, cell division, and intracellular transport"));
        euComponents.add(new Component("Lysosome", "Contains enzymes that break down waste materials and cellular debris"));

		euCell = new Eukaryotic("Eukaryotic", euComponents);
		
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
