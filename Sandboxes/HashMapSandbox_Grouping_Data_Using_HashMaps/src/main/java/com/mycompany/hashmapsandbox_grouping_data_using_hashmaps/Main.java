
package com.mycompany.hashmapsandbox_grouping_data_using_hashmaps;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        //adding to values to Ada's record
        tracker.add("Ada", 3);
        tracker.add("Ada", 4);
        tracker.add("Ada", 3);
        tracker.add("Ada", 3);
        
        //adding values to Pekkas record
        tracker.add("Pekka", 4);
        tracker.add("Pekka", 4);
        
        //adding values to Matts record
        tracker.add("Matt", 1);
        tracker.add("Matt", 2);
        
        //printing
        tracker.print();
        
    }
    
    
}
