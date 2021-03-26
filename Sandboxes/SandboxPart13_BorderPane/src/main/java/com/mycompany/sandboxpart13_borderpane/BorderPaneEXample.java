/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart13_borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class BorderPaneEXample extends Application {

    @Override
    public void start(Stage window) throws Exception {

        BorderPane layout = new BorderPane();

        layout.setTop(new Label("Top"));
        layout.setRight(new Label("Right"));
        layout.setBottom(new Label("Bottom"));
        layout.setLeft(new Label("Left"));
        layout.setCenter(new Label("Center"));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneEXample.class);
    }

}
