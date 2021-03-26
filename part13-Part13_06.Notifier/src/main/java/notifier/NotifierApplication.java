package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        TextField txtField = new TextField();
        Label label = new Label();

        Button btnOnClick = new Button("Copy");

        btnOnClick.setOnAction((event) -> {
            label.setText(txtField.getText());
        });

        VBox components = new VBox();

        components.getChildren().addAll(txtField, btnOnClick, label);

        Scene view = new Scene(components);

        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {

        launch(NotifierApplication.class);
    }

}
