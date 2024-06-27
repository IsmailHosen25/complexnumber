module com.example.complexnumber {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.complexnumber to javafx.fxml;
    exports com.example.complexnumber;
}