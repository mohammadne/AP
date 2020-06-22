package calculator.display;

import calculator.CalculatorState;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class DisplayController implements Initializable {
    @FXML
    private TextArea textArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textArea.textProperty().bindBidirectional(CalculatorState.history);
    }
}
