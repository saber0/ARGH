package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        primaryStage.setTitle("Sorter of Sorts");
        primaryStage.setScene(new Scene(root, 777, 777));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
