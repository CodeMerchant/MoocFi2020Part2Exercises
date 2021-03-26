package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage windows) throws Exception {
        /*
        //First page
        BorderPane bPaneLayout = new BorderPane();
        
        Label label = new Label("First view");
        Button toSecond = new Button("To the second view!");
        
        bPaneLayout.setTop(label);
        bPaneLayout.setCenter(toSecond);
      
        Scene borderPaneScene = new Scene(bPaneLayout, 1920, 1280);
        //-----------------------------------------

        //Second page
        VBox vboxLayout = new VBox();
        
        Button toThird = new Button("To the third view!");
        Label vboxLabel = new Label("Second view");
        
        vboxLayout.getChildren().addAll(toThird, vboxLabel);

        Scene vboxScene = new Scene(vboxLayout, 1920, 1280);

        //-----------------------------------------
        //Third page
        GridPane gPaneLayout = new GridPane();
        
        Label gPaneLabel = new Label("Third view");
        Button toFirst = new Button("To the first view!");
        
        gPaneLayout.add(gPaneLabel, 0, 0);
        gPaneLayout.add(toFirst, 1, 1);

        Scene gPaneScene = new Scene(gPaneLayout, 1920, 1280);

        //--------------------------------------------
        //Listeners aka click events
        toSecond.setOnAction((event) -> {
            stage.setScene(vboxScene);
        });

        toThird.setOnAction((event) -> {
            stage.setScene(gPaneScene);
        });

        toFirst.setOnAction((event) -> {
            stage.setScene(borderPaneScene);
        });
        
        stage.setScene(borderPaneScene);
        stage.show();
        */
        
        //first View ---------------------------------------------------------------------------
        BorderPane firstBorderPane = new BorderPane();
        firstBorderPane.setTop(new Label("First View"));
        Button firstBtn = new Button("To second view");
        firstBorderPane.setCenter(firstBtn);
        Scene firstScene = new Scene(firstBorderPane, 300, 300);

        //---Second view-----------------------------------------------------------
        VBox secVBox = new VBox();
        Button secondBtn = new Button("To the third view");
        Label secondLabel = new Label("Second view");
        secVBox.getChildren().addAll(secondBtn, secondLabel);
        Scene secondScene = new Scene(secVBox, 300, 300);
        //ThirdView -------------------------------------------------------------------------
        GridPane gPane = new GridPane();
        Button thirdBtn = new Button("To the first view");
        Label thirdLabel = new Label("Third view");
        gPane.add(thirdLabel, 0, 0);
        gPane.add(thirdBtn, 1, 1);
        Scene thirdScene = new Scene(gPane, 300, 300);

//~~~~~~~~~~~~~~~~~~~~~~Event Liseners ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        firstBtn.setOnAction((event) -> {

            windows.setScene(secondScene);

        });
        //--------------------------------
        secondBtn.setOnAction((event) -> {
            windows.setScene(thirdScene);
        });
        //-------------------------------------
        thirdBtn.setOnAction((event) -> {
            windows.setScene(firstScene);
        });

        //first scene and show window
        windows.setScene(firstScene);
        windows.show();


        

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
