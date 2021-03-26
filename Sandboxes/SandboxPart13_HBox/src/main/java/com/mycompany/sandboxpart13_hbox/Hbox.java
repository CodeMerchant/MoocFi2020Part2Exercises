/*
 * HBox enables UI Components to be laid out in a single horizontal row
 */
package com.mycompany.sandboxpart13_hbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class Hbox extends Application {

    @Override
    public void start(Stage window) throws Exception {
        HBox layout = new HBox();
        //we have to set the spacing to prevent concatanating
        layout.setSpacing(10);

        layout.getChildren().add(new Label("uno"));
        layout.getChildren().add(new Label("dos"));
        layout.getChildren().add(new Label("dres"));

        Scene view = new Scene(layout,720,480);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(Hbox.class);
    }

}
