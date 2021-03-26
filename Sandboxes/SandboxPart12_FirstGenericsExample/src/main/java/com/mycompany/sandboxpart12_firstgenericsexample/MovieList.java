/*
 * There are two ways for a class to implement a generic interface
 * One is to decide the type of param in the definition of the class,
 * and the other is to define the implementing class with a type param
 * as well. This class(MovieList) defines the type param when it implements List.
 * The MovieList is meant only for handling movies

 * See GeneralList class for an alterantive way to implement generic List interface
 */
package com.mycompany.sandboxpart12_firstgenericsexample;

/**
 *
 * @author musa
 */
public class MovieList implements List<Movie> {

    @Override
    public void add(Movie value) {
        
    }

    @Override
    public Movie get(int index) {
       
    }

    @Override
    public Movie remove(int index) {
        
    }
    
}
