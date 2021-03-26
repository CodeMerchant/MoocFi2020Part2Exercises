/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author musa
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        //No idea how to do this. Got the solution online. Would've never have got this on my own
        if (isOn) {
            Random randomNum = new Random();
            int range = 30 - (-30) + 1;

            return randomNum.nextInt(range) + (-30);
        } else {
            throw new IllegalStateException();
        }
    }

}
