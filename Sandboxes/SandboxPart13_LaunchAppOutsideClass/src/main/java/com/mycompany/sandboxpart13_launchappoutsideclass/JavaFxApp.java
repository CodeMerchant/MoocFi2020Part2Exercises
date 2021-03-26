
package com.mycompany.sandboxpart13_launchappoutsideclass;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author musa
 */
public class JavaFxApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parameters params = getParameters();
        String organisation = params.getNamed().get("Organisation");
        String course = params.getNamed().get("Course");
        
        stage.setTitle(organisation + ": " + course);
        
        
        stage.show();
    }

}
