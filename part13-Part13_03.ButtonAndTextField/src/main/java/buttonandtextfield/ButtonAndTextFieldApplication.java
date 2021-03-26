package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Button submitButton = new Button("Submit");
        TextField textField = new TextField();

        FlowPane page = new FlowPane();

        page.getChildren().add(submitButton);
        page.getChildren().add(textField);

        Scene view = new Scene(page);

        window.setScene(view);

        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
