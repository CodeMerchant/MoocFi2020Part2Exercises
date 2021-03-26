/*
 * The GridPane class allows us to lay UI components in a grid.
 * Below we will create a 3x3 row in which each cell contains a button
 * 
 */
package com.mycompany.sandboxpart13_gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class GPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane layout = new GridPane();

        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                layout.add(new Button("" + x + ", " + y), x, y);
            }
        }

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(GPane.class);
    }

}
