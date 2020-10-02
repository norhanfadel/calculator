package sample;

import java.net.URL;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    Float number = 0f;
    int operation = -1;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button four;

    @FXML
    private Button five;
    @FXML
    private Button nine;
    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button zero;

    @FXML
    private Button equal;
    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button multiply;

    @FXML
    private Button clear;

    @FXML
    private Button divided;

    @FXML
    private TextField text;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            text.setText(text.getText() + "1");
        } else if (event.getSource() == two) {
            text.setText(text.getText() + "2");
        } else if (event.getSource() == three) {
            text.setText(text.getText() + "3");
        } else if (event.getSource() == four) {
            text.setText(text.getText() + "4");
        } else if (event.getSource() == five) {
            text.setText(text.getText() + "5");
        } else if (event.getSource() == six) {
            text.setText(text.getText() + "6");
        } else if (event.getSource() == seven) {
            text.setText(text.getText() + "7");
        } else if (event.getSource() == eight) {
            text.setText(text.getText() + "8");
        } else if (event.getSource() == nine) {
            text.setText(text.getText() + "9");
        } else if (event.getSource() == zero) {
            text.setText(text.getText() + "0");
        } else if (event.getSource() == plus) {
            number = Float.parseFloat(text.getText());
            operation = 1;
            text.setText("");
        } else if (event.getSource() == minus) {
            number = Float.parseFloat(text.getText());
            operation = 2;
            text.setText("");
        } else if (event.getSource() == multiply) {
            number = Float.parseFloat(text.getText());
            operation = 3;
            text.setText("");
        } else if (event.getSource() == divided) {
            number = Float.parseFloat(text.getText());
            operation = 4;
            text.setText("");
        } else if (event.getSource() == equal) {
            Float secondNumber = Float.parseFloat(text.getText());
            // Operation 1 for Add ,2 for Sub ,3 for multi ,4 for div
            switch (operation) {
                case 1:
                    Float answer = number + secondNumber;
                    text.setText(String.valueOf(answer));
                    break;
                case 2:
                    answer = number - secondNumber;
                    text.setText(String.valueOf(answer));
                    break;
                case 3:
                    answer = number * secondNumber;
                    text.setText(String.valueOf(answer));
                    break;
                case 4:
                    answer = 0f;
                    try {
                        answer = number / secondNumber;
                    } catch (Exception exception) {
                        text.setText("Invalid Operation");
                    }
                    text.setText(String.valueOf(answer));
                    break;
            }
        }
        else if (event.getSource() == clear) {
            text.setText("");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
