
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author musa
 */
public class Hashmap<K, V> {

    private ArrayList<MapEntry<K, V>> entriesBucket = new ArrayList<>();
    private int bucketCapacity = 5;
    int size;

    public Hashmap() {
        for (int i = 0; i < bucketCapacity; i++) {
            entriesBucket.add(null);
        }
    }

    /**
     * The size of the list
     * @return size of list
     */
    public int size(){
        return size;
    }
    /**
     * isEmpty method. Checks if list is empty 
     * @return true or false depending on lists size
     */
    public boolean isEmpty(){
        return size == 0;
    }
    private int findBucketIndex(K key) {
        return Math.abs(key.hashCode() % bucketCapacity);
    }

    public void add(K newKey, V newValue) {
        //Getting the bucket's index position where we'll store the new entry
        //NB! All of the buckets indexes are currently pointing to null
        int bucketIndex = findBucketIndex(newKey);

        MapEntry<K, V> current = entriesBucket.get(bucketIndex);
        MapEntry<K, V> newEntry = new MapEntry<>();

        newEntry.key = newKey;
        newEntry.value = newValue;

        if (current == null) { //If the current index is empty/null
            
            //we add the new entry object to the bucket index using ArrayList's set method.
            //NB! set(bucketIndex, newEntry) in plain English
            // tells us that at 'index[bucketIndex] of entriesBucket, add newEntry object'!.
            entriesBucket.set(bucketIndex, newEntry);  
           
            size++;
            
        } else {
            while (current != null) { //If current index is not empty
                //and if the entry's key at current index is equal to the passed key
                //we must overwrite the current entry's value with the newEntry's value aka (newValue)
                //This is because a HashMap only takes unique keys.
                if (current.key.equals(newKey)) {
                    current.value = newValue;
                    size++;
                    break;
                }
                
                //We then set current to null
                current = current.next; 
            }

            if (current == null) {

                current = entriesBucket.get(bucketIndex);
                newEntry.next = current;

                entriesBucket.set(bucketIndex, newEntry);
                size++;
            }
        }

        if ((1.0 * size) / bucketCapacity > 0.7) {
            grow();
        }

    }

    public V remove(K keyToRemove) {
        //Getting the bucket's index position where we'll store the new entry
        int bucketIndex = findBucketIndex(keyToRemove);

        MapEntry<K, V> current = entriesBucket.get(bucketIndex);

        if (current == null) {

            return null;
        }

        if (current.key.equals(keyToRemove)) {

            V value = current.value;

            current = current.next;

            entriesBucket.set(bucketIndex, current);
            size--;

            return value;

        } else {
            MapEntry<K, V> previous = null;

            while (current != null) {

                if (current.key.equals(keyToRemove)) {
                    previous.next = current.next;
                    size--;

                    return current.value;
                }
                previous = current;
                current = current.next;
            }

            size--;
            return null;
        }

    }

    public V get(K key) {

        //Getting the bucket's index position 
        int bucketIndex = findBucketIndex(key);
        MapEntry<K, V> current = entriesBucket.get(bucketIndex);

        while (current != null) { //as long as the index isn't null

            if (current.key.equals(key)) { //if the key at current equals the passed key

                return current.value; //return its value
            }
            current = current.next; //current will be set to null afterward
        }

        return null;

    }

    private void grow() {

        ArrayList<MapEntry<K, V>> newEntriesBucket = entriesBucket;

        entriesBucket = new ArrayList<>();

        bucketCapacity *= 2;

        for (int i = 0; i < bucketCapacity; i++) {

            entriesBucket.add(null);
        }

        for (MapEntry<K, V> current1 : newEntriesBucket) {

            while (current1 != null) {

                add(current1.key, current1.value);
                current1 = current1.next;
            }
        }

    }
}
