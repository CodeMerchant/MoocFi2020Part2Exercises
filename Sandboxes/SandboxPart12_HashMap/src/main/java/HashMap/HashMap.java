/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

/**
 *
 * @author musa
 */
public class HashMap<K, V> {

    private List<Pair<K, V>>[] entriesBucket;
    private int firstFreeIndexOfBucket;

    public HashMap() {
        this.entriesBucket = new List[32];
        this.firstFreeIndexOfBucket = 0;
    }

    //Retrieving a value
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % entriesBucket.length);

        if (entriesBucket[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = entriesBucket[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

    //adding to hashmap. We'll make this less clunky by creating helper methods
    /* public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % values.length);

        if (values[hashValue] == null) {
            values[hashValue] = new List<>();
        }

        List<Pair<K, V>> valuesAtIndex = values[hashValue];

        int index = -1;
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }
        if(index < 0){
            valuesAtIndex.add(new Pair<>(key, value));
            firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
    } */
    //Better clearer implementation of the add method
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);

        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            firstFreeIndexOfBucket++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
        if (1.0 * firstFreeIndexOfBucket / entriesBucket.length > 0.75) {
            grow();
        }
    }

    //Finding the list related to the key.
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % entriesBucket.length);

        if (entriesBucket[hashValue] == null) {
            entriesBucket[hashValue] = new List<>();
        }

        return entriesBucket[hashValue];
    }

    //finding the key on the list
    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    //We need to be able to grow the size of the internal array for when the number of values
    //grow too large to fit. The grow method will make use of the helper method 'copy()'
    private void grow() {
        //Creating the new array
        List<Pair<K, V>>[] newArray = new List[entriesBucket.length * 2];

        for (int i = 0; i < entriesBucket.length; i++) {
            copy(newArray, i);
        }

        entriesBucket = newArray;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIndex) {

        for (int i = 0; i < entriesBucket[fromIndex].size(); i++) {
            Pair<K, V> value = entriesBucket[fromIndex].value(i);
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);

            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();

            }
            newArray[hashValue].add(value);
        }

    }

    //Removing key-value pair based on key
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);

        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.value(index);

        valuesAtIndex.remove(pair);

        return pair.getValue();
    }
}
