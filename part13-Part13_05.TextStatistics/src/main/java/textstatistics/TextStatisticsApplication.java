package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        
        HBox txtComponents = new HBox();
        txtComponents.setSpacing(10);
        
        txtComponents.getChildren().add(new Label("Letters: 0"));
        txtComponents.getChildren().add(new Label("Words: 0"));
        txtComponents.getChildren().add(new Label("The longest word is:"));
        
        layout.setCenter(new TextArea(""));
        layout.setBottom(txtComponents);
        
        Scene view = new Scene(layout, 720, 480);
        
        stage.setScene(view);
        stage.show();
    }


    public static void main(String[] args) {
      launch(TextStatisticsApplication.class);
    }

}
