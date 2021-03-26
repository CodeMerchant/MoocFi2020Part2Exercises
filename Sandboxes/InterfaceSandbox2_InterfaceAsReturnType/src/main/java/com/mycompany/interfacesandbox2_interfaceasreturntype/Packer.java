/*
The Factory can be used without exactly knowing what different kind of 
Packable classes exist. Below we create a class Packer that gives a box
of things. A packer defines a factory which is used to create the things.
 */
package com.mycompany.interfacesandbox2_interfaceasreturntype;

/**
 *
 * @author musa
 */
public class Packer {

    private Factory factory;

    public Packer() {
        this.factory = new Factory();
    }

    public Box giveABoxOfThings() {
        Box box = new Box(100);

        int i = 0;
        while (i < 10) {
            Packable newThing = factory.produceNew();
            box.add(newThing);

            i += 1;
        }
        return box;
    }
}
