module org.example.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculatrice to javafx.fxml;
    exports org.example.calculatrice;
}