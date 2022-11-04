package FoodDelivery;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FoodDeliveryController implements Initializable {
    @FXML
    private VBox dealVbox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dealVbox.setStyle("-fx-background-image: url('/Users/shahinuralambhuiyan/Custom_disk/PROJECTS/JAVA/Java_projects/FoodDelivery/src/main/resources/Img/res1.jpeg');");
    }
}