package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        
        Label labelComponent = new Label("Click button");
        Button buttonComponent = new Button("Click me");
        
        FlowPane page = new FlowPane();
        
        page.getChildren().add(labelComponent);
        page.getChildren().add(buttonComponent);
        
        Scene view = new Scene(page);
        
        window.setScene(view);
        window.show();
                
    }


    public static void main(String[] args) {
       launch(ButtonAndLabelApplication.class);
    }

}
