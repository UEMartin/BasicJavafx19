package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	private AnchorPane myPane;
	
	@Override
	public void start(Stage primaryStage) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/VBasicJFX.fxml"));

		loader.setController(new SetBlur());
		

		myPane = (AnchorPane) loader.load();
		
		primaryStage.setTitle("Where´s da squirtle?");
		primaryStage.setScene(new Scene(myPane));
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
