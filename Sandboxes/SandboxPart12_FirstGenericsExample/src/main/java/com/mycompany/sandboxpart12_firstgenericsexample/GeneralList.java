/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart12_firstgenericsexample;

import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class GeneralList<T> implements List<T> {

    ArrayList<T> values;

    public GeneralList() {
        this.values = new ArrayList<>();
    }

    @Override
    public void add(T value) {
        values.add(value);
    }

    @Override
    public T get(int index) {
        return values.get(index);
    }

    @Override
    public T remove(int index) {
        T value = values.get(index);
        values.remove(value);

        return value;
    }

}
