/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class MapEntry<K, V> {

    K key;
    V value;
    MapEntry<K, V> next; //this will help us place new entries in the bucket location

    public MapEntry() {

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public MapEntry<K, V> getNext() {
        return next;
    }

    public void setNext(MapEntry<K, V> next) {
        this.next = next;
    }

}
