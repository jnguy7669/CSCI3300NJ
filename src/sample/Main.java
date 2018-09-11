package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Anxiety Management");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

//        primaryStage.setScene();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
