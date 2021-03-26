/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_sortingbymultiplecriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Get Out", 2017));
        films.add(new Film("Shutter Island", 2010));
        films.add(new Film("Eyes Wide Shut", 1999));
        films.add(new Film("Donnie Darko", 2001));
        films.add(new Film("Mulholland Drive", 2001));
        films.add(new Film("Vanilla Sky", 2001));
        films.add(new Film("Hannibal", 2001));

       // films.forEach((film) -> {
        //    System.out.println(film);
        //});

        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        System.out.println("");

        Collections.sort(films, comparator);

        films.forEach((film) -> {
            System.out.println(film);
        });
    }
}
