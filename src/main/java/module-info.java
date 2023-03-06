module com.example.tpo_lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpo_lab3 to javafx.fxml;
    exports com.example.tpo_lab3;
}