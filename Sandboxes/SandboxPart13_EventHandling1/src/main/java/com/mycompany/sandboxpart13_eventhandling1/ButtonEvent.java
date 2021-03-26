/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart13_eventhandling1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class ButtonEvent extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");

        //letting button copy text from leftTextField to the one on the right
        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        HBox componentGroup = new HBox();
        componentGroup.setSpacing(10);

        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene view = new Scene(componentGroup);

        stage.setScene(view);

        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonEvent.class);
    }

}
