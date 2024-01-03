package screen.test;

import cell.Cell;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import screen.controller.MainMenuController;

public class MainMenuTest extends Application {
	private Cell cell;
	
	@Override
    public void start(Stage primaryStage) throws Exception {
        final String MAIN_FXML_PATH = "/screen/view/MainMenu.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MAIN_FXML_PATH ));
        MainMenuController viewStoreController = new MainMenuController(cell);
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
