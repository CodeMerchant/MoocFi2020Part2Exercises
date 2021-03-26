/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart12_randomdouble;

import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class Program {

    public static void main(String[] args) {
        WeatherMan weatherman = new WeatherMan();

        //save days of week to list
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");

        System.out.println("Next weeks forecast reads as follows: ");

        days.forEach((day) -> {
            String weatherForecast = weatherman.forecast();

            int temperatureForecast = weatherman.makeAForecast();

            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast  + " degrees");
        });
    }

}
