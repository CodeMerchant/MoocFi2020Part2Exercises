package com.mycompany.sandboxpart13_basicjfx;

import javafx.application.Application;

import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage window) {
       window.setTitle("Hello World");
       window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }

}