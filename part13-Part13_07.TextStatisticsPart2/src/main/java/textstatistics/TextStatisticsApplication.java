package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        HBox txtComponents = new HBox();
        TextArea txtArea = new TextArea();
        txtComponents.setSpacing(10);

        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");

        txtComponents.getChildren().addAll(letters, words, longest);

        txtArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");

            int lengthOfWords = parts.length;

            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letters.setText("Letters: " + String.valueOf(characters));
            words.setText("Words: " + String.valueOf(lengthOfWords));
            longest.setText("The longest word is: " + longestWord);

        });

        layout.setCenter(txtArea);
        layout.setBottom(txtComponents);

        Scene view = new Scene(layout, 1920, 1280);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
