package com.mycompany.sandboxpart12_uicomponentsandtheirlayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author musa
 */
public class JavaFxApp extends Application {

    @Override
    public void start(Stage window) throws Exception {
        //adding text usingLabel class
        Label textComponent = new Label("Text element");
        Button buttonComponent = new Button("Does nothing for now");

        FlowPane componentGroup = new FlowPane(); //creating new page( I think)

        componentGroup.getChildren().add(textComponent); //adding the label to the page
        componentGroup.getChildren().add(buttonComponent);
        
        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {

        launch(JavaFxApp.class);
    }

}
