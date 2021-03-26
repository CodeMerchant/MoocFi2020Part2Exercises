/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_comparableinterface;

/**
 *
 * @author musa
 */
public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
    
    @Override
    public String toString(){
        return this.getName() + " (" + this.getHeight() + ")";
        
    }

    /*
    Overriding the CompareTo method of the Comparable Interface to
    sort the list by height. 
    */
    @Override
    public int compareTo(Member member) {
        if (this.height == member.getHeight()) {
            return 0;
        } else if(this.height > member.getHeight()){
            return 1;
        } else {
            return -1;
        }
        
        //return this.length - member.getHeight();  //returns height from lowest to highest once sorted
        //return this.length + member.getHeight(); //returnsheight from highest to lowest once sorted
    }
    
}
