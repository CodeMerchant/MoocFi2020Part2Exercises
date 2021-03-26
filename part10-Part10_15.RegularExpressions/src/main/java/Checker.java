
public class Checker {

    public boolean isDayOfWeek(String string) {
        
        return string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string){
        return string.toLowerCase().matches("[a,e,i,o,u]*");
    }
    
    public boolean timeOfDay(String string){
        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]"); //smh :-(
    }
}
