package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Please give a title: ");
        //String title = scan.nextLine();
        //stage.setTitle(title);
        
        stage.setTitle(getParameters().getNamed().get("title"));
        stage.show();
    }
    
}
