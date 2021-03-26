/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart12_randomdouble;

import java.util.Random;

/**
 *
 * @author musa
 */
public class WeatherMan {

    private Random random;

    public WeatherMan() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = random.nextDouble();

        if (probability <= 0.1) {
            return "Rain expected";
        } else if (probability <= 0.4) { //0.1 + 0.3
            return "Snow expected";
        } else { // rest, 1.0 - 0.4 = 0.6
            return "Sunny skies expected";
        }
    }

    public int makeAForecast() {
        return (int) (4 * random.nextGaussian() - 3);
        
        /*
        random.nextGaussian() call is a regular method call. However
        */
    }
}
