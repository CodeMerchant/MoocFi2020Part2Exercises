/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart13_viewswiththesamemainalignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class ExampleApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //1. Creating main layout
        BorderPane layout = new BorderPane();

        //1.1. Creating menu for main layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        //1.2. Creating buttons for menu
        Button first = new Button("First");
        Button second = new Button("Second");

        //1.3. Adding buttons to menu
        menu.getChildren().addAll(first, second);

        layout.setTop(menu);

        //2. Adding subviews and adding them to the menu buttons
        //2.1 Creating subview layout
        StackPane firstLayout = createView("First view");
        StackPane secondLayout = createView("Second view");

        //2.2. Adding subviews to button. Pressing button will change the view
        first.setOnAction((event) -> layout.setCenter(firstLayout));

        second.setOnAction((event) -> layout.setCenter(secondLayout));

        //2.3. Setting initial view
        layout.setCenter(firstLayout);

        //3. Creating main scene with layout
        Scene mainScene = new Scene(layout);

        //4. Showing the main scene
        stage.setScene(mainScene);
        stage.show();

    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();

        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

}
