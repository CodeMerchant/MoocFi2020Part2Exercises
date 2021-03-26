/*
 * We sometimes want to sort items based on a number of things. 
 * This class allows us to list films in order of their names and year of release
 * We make use of Java's Comparator class to aid us in sorting
 */
package com.mycompany.sandboxpart10_sortingbymultiplecriteria;

/**
 *
 * @author musa
 */
public class Film {
    private String name;
    private int releaseYear;

    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.releaseYear + ")";
    }
}
