/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart13_launchappoutsideclass;

import javafx.application.Application;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        Application.launch(JavaFxApp.class, "--Organisation=Oracle", "--Course=Java SE11 Certification");
    }
}
