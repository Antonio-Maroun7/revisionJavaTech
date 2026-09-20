module com.amigoscode.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.amigoscode.demo to javafx.fxml;
    exports com.amigoscode.demo;
}