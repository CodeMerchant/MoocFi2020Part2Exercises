
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author musa
 */
public class Pipe<T> {

    private final List<T> pipeList;

    public Pipe() {
        this.pipeList = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipeList.add(value);
    }

    public T takeFromPipe() {
        T valueToRemove = pipeList.get(0);

        pipeList.remove(valueToRemove);

        return valueToRemove;
    }

    public boolean isInPipe() {
        return !pipeList.isEmpty();
    }
}
