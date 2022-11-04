module fooddelivery {
    requires javafx.controls;
    requires javafx.fxml;


    opens FoodDelivery to javafx.fxml;
    exports FoodDelivery;
}