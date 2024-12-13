package com.jeessicats.demo;

import com.jeessicats.demo.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class HelloController {

    @FXML
    private TextField textNumber1;

    @FXML
    private TextField textNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button buttonSum;

    @FXML
    public void onButtonSumClicked() {
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(textNumber1.getText());
            double number2 = Double.parseDouble(textNumber2.getText());
            double sum = number1 + number2;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}