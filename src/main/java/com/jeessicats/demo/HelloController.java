package com.jeessicats.demo;

import com.jeessicats.demo.util.Alerts;
import com.jeessicats.demo.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

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
            labelResult.setText(String.format(Locale.getDefault(), "%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Parse error", "Invalid number format: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(textNumber1);
        Constraints.setTextFieldDouble(textNumber2);
        Constraints.setTextFieldMaxLength(textNumber1, 15);
        Constraints.setTextFieldMaxLength(textNumber2, 15);
    }
}
