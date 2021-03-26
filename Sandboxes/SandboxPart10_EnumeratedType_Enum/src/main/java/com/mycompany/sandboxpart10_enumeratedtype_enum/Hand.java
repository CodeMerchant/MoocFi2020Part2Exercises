/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_enumeratedtype_enum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author musa
 */
public class Hand {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream()
                .forEach(card -> {
                    System.out.println(card);
                });
        //better way
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) { //are there any more objects to be iterated over?

            System.out.println(iterator.next()); // if so give me the next object in line aka print out all the objects
        }
    }

    //Using iterator to remove a value from a list
    public void removeWorst(int value) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                //remove from the list, the element returned by the previous next-method call
                iterator.remove();
            }
        }
    }
}
