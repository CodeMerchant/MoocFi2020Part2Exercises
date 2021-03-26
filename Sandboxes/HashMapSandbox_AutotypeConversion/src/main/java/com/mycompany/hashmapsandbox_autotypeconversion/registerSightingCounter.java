package com.mycompany.hashmapsandbox_autotypeconversion;

import java.util.HashMap;

/**
 * Class that adds sightings and generates a counter based on how many times a
 * sighting has occurred
 *
 * @author musa
 */
public class registerSightingCounter {

    private HashMap<String, Integer> allSightings;

    public registerSightingCounter() {
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted) {
        /*
        using getOrDefault method makes sure that a null reference is never returned as the Integer part
        of the Map will be initialised with 0.
         */
        int timesSighted = this.allSightings.getOrDefault(sighted, 0);
        timesSighted += 1;
        this.allSightings.put(sighted, timesSighted);
    }
    
    public int timesSighted(String sighted){
        return this.allSightings.getOrDefault(sighted, 0);
    }

}
