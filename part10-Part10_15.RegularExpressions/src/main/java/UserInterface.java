
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class UserInterface {
    private final Scanner scan;
    private final Checker check;

    public UserInterface(Scanner scan, Checker check) {
        this.scan = scan;
        this.check = check;
    }
    
    public void start(){
        //readDays();
        //readVowels();
        readTimeOfDay();
    }

public void readDays(){
    Checker checkString = new Checker();
    System.out.print("Enter a string:");
    String string = this.scan.nextLine();
    
  
    if(checkString.isDayOfWeek(string)){
        System.out.println("The form is correct.");
    } else{
        System.out.println("The form is incorrect.");
    }
}

public void readVowels(){
    Checker checkString = new Checker();
    
    System.out.print("Enter a string:");
    String string = this.scan.nextLine();
    
  
    if(checkString.allVowels(string)){
        System.out.println("The form is correct.");
    } else{
        System.out.println("The form is incorrect.");
    }
}

public void readTimeOfDay(){
     Checker checkString = new Checker();
    
    System.out.print("Enter a string:");
    String string = this.scan.nextLine();
    
  
    if(checkString.timeOfDay(string)){
        System.out.println("The form is correct.");
    } else{
        System.out.println("The form is incorrect.");
    }
}
    
}
