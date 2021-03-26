/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacesandbox1_readable;

import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class Ebook implements Readable {

    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int pages() {
        return this.pages.size();
    }

    //Implementing the read method from Readable interface
    @Override
    public String read() {
        String page = this.pages.get(this.pageNumber);
        //call nextPage method
        nextPage();

        return page;
    }

    private void nextPage() {
        this.pageNumber += 1;

        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }

}
