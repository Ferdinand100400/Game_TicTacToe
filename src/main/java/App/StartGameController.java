package App;

import java.io.IOException;
import javafx.fxml.FXML;

public class StartGameController {

    @FXML
    private void startGame() throws IOException {
        App.setRoot("main");
    }
}
