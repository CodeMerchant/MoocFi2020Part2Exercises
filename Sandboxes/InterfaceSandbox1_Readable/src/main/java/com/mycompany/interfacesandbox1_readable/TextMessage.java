/*
 The classes that implement the interface decide HOW the methods in the 
interface are implemented. A class implements the interface by adding the
keyword "implements" after the class name
 */
package com.mycompany.interfacesandbox1_readable;

/**
 *
 * @author musa
 */
public class TextMessage implements Readable {

    private String sender;
    private String content;
    
    public TextMessage(String sender, String content){
        this.sender = sender;
        this.content = content;
    }
    
    public String getSender(){
        return this.sender;
    }
    
    
    
    @Override
    public String read() {
        return this.content;
    }
    
}
