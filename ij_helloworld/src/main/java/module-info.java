module com.example.ij_helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ij_helloworld to javafx.fxml;
    exports com.example.ij_helloworld;
}