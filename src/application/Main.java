package application;
	
import com.gardhagen.joakim.bakery.cakes.Cakes;
import com.gardhagen.joakim.bakery.cakes.WigelsBakery;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static void main(String[] args) {
		WigelsBakery wb = new WigelsBakery();
		Cakes cake = wb.orderCake("Princess Cake");
		System.out.println(cake.getName()+"\n\n");
		Cakes cake2 = wb.orderCake("Shrovetide Bun");
		System.out.println(cake2.getName()+"\n\n");
		Cakes cake3 = wb.orderCake("Choclate Cake");
		System.out.println(cake3.getName());
		
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Wigell's Bakery");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
