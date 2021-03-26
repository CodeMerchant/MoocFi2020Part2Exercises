/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart12_firstgenericsexample;

/**
 *
 * @author musa
 */
public interface List<T> {

    void add(T value);

    T get(int index);

    T remove(int index);
}
