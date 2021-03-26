package com.mycompany.sandboxpart12_lists;

public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10]; //setting the array size to hold 10 values/elements
        this.firstFreeIndex = 0;
    }

    //Adding values to the list
    public void add(Type value) {
        if (firstFreeIndex == values.length) {
            grow();
        }

        values[firstFreeIndex] = value;
        firstFreeIndex++;
    }

    private void grow() {
        int newSize = values.length + values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }

        values = newValues;

        /*
         *This method allows the List to grow if a user tries 
         * to add a value to a full list. The size of the List is increased by
         * creating a new, larger, array to which the values from the old array 
         * are copied to. After this, the old array is abandoned and the List 
         * starts to use the new array.
         * 
         * The size of the array is determined with the formula 
         * oldSize + newSize / 2. 
         * This implementation creates a new array whose size is 1.5 times 
         * the size of the old array. In this instance, the new size will be
         * 15. basically 10 * 1.5
         */
    }

    public boolean contains(Type value) {
        /* for (int i = 0; i < firstFreeIndex; i++) {
            if (values[i].equals(value)) {
                return true;
            }
        }
        return false;
         */

        //alternatively. 
        return indexOfValue(value) >= 0;
    }

    /* Initial remove method. Too much going on so we
     * will spread out the work load using other methods
    
    public void remove(Type value) {

        boolean isFound = false;

        for (int i = 0; i < firstFreeIndex; i++) {
            if (isFound) {
                
                values[i - 1] = values[i];
                
            } else if (value == values[i] || values[i].equals(i)) {

                firstFreeIndex--;
                isFound = true;
            }
        }
    } */
    /**
     * Searches for the index value and returns it
     *
     * @param value
     * @return
     */
    public int indexOfValue(Type value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }
        return -1; //if value is not found
    }

    /**
     * Moves values from the given index one place to the left
     *
     * @param fromIndex
     */
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < firstFreeIndex - 1; i++) {
            values[i] = values[i + 1];
        }
    }

    //The remove() method with less clutter
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);

        if (indexOfValue < 0) {
            return; //not found
        }

        moveToTheLeft(indexOfValue);
        firstFreeIndex--;
    }

    //Searching from an index
    public Type value(int index) {
        if (index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, "
                    + firstFreeIndex + "]");
        }
        return values[index];
    }

    //Size of the list
    public int size() {
        return firstFreeIndex;
    }
}
