/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_enumeratedtype_enum;

/**
 *
 * @author musa
 */
public enum Color {
    //constructor parameters are defined as the constants are enumerated
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");
    
    private String code;

    private Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code; //returns the  color code defined in the enums
    }
    
    
}
