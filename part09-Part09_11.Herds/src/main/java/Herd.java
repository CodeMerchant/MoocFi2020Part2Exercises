
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author musa
 */
public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herdList) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String print = "";

        for (Movable movable : herdList) {
            print += movable.toString() + "\n";
        }

        return print;
    }

}
