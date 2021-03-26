
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
public class Hideout<T> {

    private final ArrayList<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    /**
     * Puts an object with a type in accordance with the type parameter given to
     * the class into the hideout. If an object is already in the hideout, it
     * will disappear.
     *
     * @param toHide object to hide
     */
    public void putIntoHideout(T toHide) {
        if (!hideout.isEmpty()) {
            hideout.clear(); //NB! We cannot add a new object to the list if there's already one in it.
            //This is why we have to clear the list before adding a new object.
        }

        hideout.add(toHide);
    }

    /**
     * Takes out(removes) the object with a type in accordance with the type
     * parameter given to the class from the hideout. If the hideout is empty,
     * the method returns a null reference.
     *
     * @return the object in the hideout
     */
    public T takeFromHideout() {
        T object = hideout.get(0);
        if (hideout.isEmpty()) {
            return null;
        }

        hideout.clear();

        return object;
    }

    public boolean isInHideout() {
        return !hideout.isEmpty();
    }
}
