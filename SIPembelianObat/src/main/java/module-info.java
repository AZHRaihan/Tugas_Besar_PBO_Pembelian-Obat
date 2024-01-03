module com.example.sipembelianobat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sipembelianobat to javafx.fxml;
    exports com.example.sipembelianobat;
}