
package com.mycompany.sandboxpart12_firstgenericsexample;


//The definition public class Locker<T> indicates that the Locker class must 
//be given a type parameter in its constructor
public class Locker <T>{
    private T element;
    
    public void setValue(T element){
        this.element = element;
    }
    
    public T getValue(){
        return element;
    }
}
