package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        //1. Creating the dictionary that the application uses
        dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {

        //2. Creating the views ('subviews')
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);

        //3. Creating the higher level layout
        BorderPane layout = new BorderPane();

        //3.1. Creating the menu for the general layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(10, 10, 10, 10));
        menu.setSpacing(10);

        //3.2. Creating the menu buttons
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        //3.3. Adding th ebuttons to the menu
        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);

        //4. Connecting subviews with the buttons. Clicking the menu buttons changes the subview
        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));

        //5. First showing the input view
        layout.setCenter(inputView.getView());

        //6. Creating the main view and adding the high level layout to it
        Scene view = new Scene(layout, 1920, 1280);

        //7. Showing the application
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
