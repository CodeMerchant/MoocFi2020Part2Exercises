/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashmapAlternative;

import java.util.ArrayList;

/**
 *
 * @author musa
 * @param <K>
 * @param <V>
 */
public class Hashmap<K, V> {

    private ArrayList<Entry<K, V>> entriesBucket = new ArrayList<>(); //ArrayList containing buckets that will hold map entries
    private int bucketCapacity = 4; //Initial capacity of hashmap

    public Hashmap() {
        
       entriesBucket =  new ArrayList<>(bucketCapacity);

    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() & bucketCapacity);
    }

    public void put(K newKey, V newValue) {

        if (newKey == null) {
            return;
        }

        int bucketIndex = getBucketIndex(newKey);

        Entry<K, V> newEntry = new Entry<>(newKey, newValue, null);

        //If entriesBucket location doesn't contain any entry, we store the entry there
        if (entriesBucket.get(bucketIndex) == null) {
            entriesBucket.set(bucketIndex,newEntry);
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = entriesBucket.get(bucketIndex);

            while (current != null) { //means we have reached last entry of bucket
                if (current.key.equals(newKey)) {
                    if (previous == null) { //node should be inserted on first of bucket
                        newEntry.next = current.next;
                        entriesBucket.set(bucketIndex,newEntry);
                        return;
                    } else {
                        newEntry.next = current.next;
                        previous.next = newEntry;
                        return;
                    }
                }

                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }

    }

    public V get(K key) {

        int bucketIndex = getBucketIndex(key);

        if (entriesBucket.get(bucketIndex) == null) {
            return null;
        } else {
            Entry<K, V> temp = entriesBucket.get(bucketIndex);

            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;

                }
                temp = temp.next;
            }
            return null; //return null if key not found
        }
    }

    public boolean remove(K key) {
        int bucketIndex = getBucketIndex(key);

        if (entriesBucket.get(bucketIndex) == null) {
            return false;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = entriesBucket.get(bucketIndex);

            while (current != null) { //means we've reached last entry node of bucket
                if (current.key.equals(key)) {
                    if (previous == null) { //delete first entry node

                        Entry<K, V> hold = entriesBucket.get(bucketIndex);
                        hold = entriesBucket.get(bucketIndex).next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }

                previous = current;
                current = current.next;
            }
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < bucketCapacity; i++) {
            if (entriesBucket.get(i) != null) {
                Entry<K, V> entry = entriesBucket.get(i);

                while (entry != null) {
                    System.out.println(entry.key + " : " + entry.value);
                    entry = entry.next;
                }
            }
        }
    }

}
