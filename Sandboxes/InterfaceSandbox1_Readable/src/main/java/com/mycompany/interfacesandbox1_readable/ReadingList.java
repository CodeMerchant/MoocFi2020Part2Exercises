package com.mycompany.interfacesandbox1_readable;

import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class ReadingList implements Readable {

    private ArrayList<Readable> readables;

    public ReadingList() {
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int toRead() {
        return this.readables.size();
    }

    @Override
    public String read() {
        String read = "";

        for (Readable readable : this.readables) {
            read += readable.read() + "\n";
        }

        //once the reading list has been read. We need to empty it
        this.readables.clear();
        return read;
    }

}
