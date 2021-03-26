package com.mycompany.hashmapsandbox_grouping_data_using_hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class that adds multiple values to a single key in HashMap using a string
 * as the key and an ArrayList as the value
 *
 * @author musa
 */
public class TaskTracker {

    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        //an empty list has to be added for a ne wuser if one has not already
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        //we first have to retrieve the list containing the exercises completed by the user
        //ArrayList<Integer> completed = this.completedExercises.get(user);
        //completed.add(exercise);
        //quicker way. 
        this.completedExercises.get(user).add(exercise);
    }

    public void print() {
        for (String name : this.completedExercises.keySet()) {
            System.out.println(name + ": " + this.completedExercises.get(name));
        }
    }

}
