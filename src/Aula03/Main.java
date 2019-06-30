package Aula03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Pane sceneGraph = loader.load(getClass().getResource("/View/ViewEmployee.fxml").openStream());
        Scene scene = new Scene(sceneGraph, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
}
