/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Person {

    private String name;
    private Education edu;

    public Person(String name, Education edu) {
        this.name = name;
        this.edu = edu;
    }

    public String getName() {
        return name;
    }

    public Education getEducation() {
        return edu;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.edu;
    }
}
