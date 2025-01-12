package App;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import static Logic.Logic.*;

public class MainController {

    @FXML
    private Button field_0_0, field_0_1, field_0_2, field_1_0, field_1_1, field_1_2, field_2_0, field_2_1, field_2_2;

    @FXML
    private void switchToField_0_0() throws IOException {
        field_0_0.setText(writeToField(0, 0));
        checkEndGame();
    }

    @FXML
    private void switchToField_0_1() throws IOException {
        field_0_1.setText(writeToField(0, 1));
        checkEndGame();
    }

    @FXML
    private void switchToField_0_2() throws IOException {
        field_0_2.setText(writeToField(0, 2));
        checkEndGame();
    }

    @FXML
    private void switchToField_1_0() throws IOException {
        field_1_0.setText(writeToField(1, 0));
        checkEndGame();
    }

    @FXML
    private void switchToField_1_1() throws IOException {
        field_1_1.setText(writeToField(1, 1));
        checkEndGame();
    }

    @FXML
    private void switchToField_1_2() throws IOException {
        field_1_2.setText(writeToField( 1, 2));
        checkEndGame();
    }

    @FXML
    private void switchToField_2_0() throws IOException {
        field_2_0.setText(writeToField(2, 0));
        checkEndGame();
    }

    @FXML
    private void switchToField_2_1() throws IOException {
        field_2_1.setText(writeToField(2, 1));
        checkEndGame();
    }

    @FXML
    private void switchToField_2_2() throws IOException {
        field_2_2.setText(writeToField(2, 2));
        checkEndGame();
    }

    @FXML
    private void endGame() throws IOException {
        deleteField();
        App.setRoot("main");
    }

    private void checkEndGame() {
        if (checkingYourWinnings()) {
            Alert alert;
            if (!isFlag()) {
                alert = new Alert(Alert.AlertType.INFORMATION, "Нолики победили");
            } else {
                alert = new Alert(Alert.AlertType.INFORMATION, "Крестики победили");
            }
            alert.showAndWait();
        } else if (checkFullField()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Ничья");
            alert.showAndWait();
        }
    }
}
