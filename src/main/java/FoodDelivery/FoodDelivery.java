package FoodDelivery;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodDelivery extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FoodDelivery.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1315, 855);
        stage.setTitle("Food Delivery -hello");
        stage.setScene(scene);
        stage.show();
        // it's shahin branch.
        // bhuiyan branch...
    }

    public static void main(String[] args) {
        launch();
    }
}