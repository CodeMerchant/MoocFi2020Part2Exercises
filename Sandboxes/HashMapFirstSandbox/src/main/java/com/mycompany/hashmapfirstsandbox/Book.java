/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashmapfirstsandbox;

/**
 *
 * @author musa
 */
public class Book {

    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public void setContent(String content) {
        this.content = content;
    }
    //new
    public int hashCode(){
       //making sure we avoid a NullPointerException by returning the year of 
       //publication as the hash value
        if(this.name == null){
            return this.published;
        } 
        
        return this.published + this.name.hashCode();
    }
    //new
    @Override
    public boolean equals(Object comparedObj) {
        if (this == comparedObj) {
            return true;
        }

        //if object passed as argument isn't of type Book (i.e an instance of Book), return false.
        if (!(comparedObj instanceof Book)) {
            return false;
        }
        //setting the comparedObj to Book object
        Book comparedBook = (Book) comparedObj;

        //checking for equality
        if (this.name.equals(comparedBook.name)
                && this.published == comparedBook.published
                && this.content.equals(comparedBook.content)) {
            return true;
        }
        //otherwise
        return false;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "(" + this.published + ")\n" + "content: " + this.content;

    }
}
