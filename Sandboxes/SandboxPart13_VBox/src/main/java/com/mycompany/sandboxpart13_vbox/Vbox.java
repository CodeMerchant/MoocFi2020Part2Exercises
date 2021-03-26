/*
 * Works like HBox but sets components in a vertical column
 */
package com.mycompany.sandboxpart13_vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class Vbox extends Application {

    @Override
    public void start(Stage window) throws Exception {
        VBox layout = new VBox();
        layout.setSpacing(10);

        layout.getChildren().add(new Label("uno"));
        layout.getChildren().add(new Label("dos"));
        layout.getChildren().add(new Label("dres"));

        Scene view = new Scene(layout, 720, 480);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(Vbox.class);
    }

}
