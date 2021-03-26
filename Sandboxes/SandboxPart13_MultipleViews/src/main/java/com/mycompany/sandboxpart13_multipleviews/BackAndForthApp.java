/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart13_multipleviews;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class BackAndForthApp extends Application {

    @Override
    public void start(Stage windows) throws Exception {
        Button back = new Button("Back...");
        Button forth = new Button("Forth...");

        Scene first = new Scene(back);
        Scene second = new Scene(forth);

        back.setOnAction((event) -> {
            windows.setScene(second);
        });

        forth.setOnAction((event) -> {
            windows.setScene(first);
        });

        windows.setScene(first);
        windows.show();
    }

}
