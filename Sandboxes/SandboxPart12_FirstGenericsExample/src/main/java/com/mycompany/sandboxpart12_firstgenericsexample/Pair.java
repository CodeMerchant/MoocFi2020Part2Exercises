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
public class Pair<T,S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    
    public void setValues(T first, S second){
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    } 

    public S getSecond() {
        return second;
    }

   @Override
   public String toString(){
       return this.first.toString() + " " + this.second.toString();
   }
    
    
}
