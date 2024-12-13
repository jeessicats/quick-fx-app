module com.jeessicats.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jeessicats.demo to javafx.fxml;
    exports com.jeessicats.demo;
}