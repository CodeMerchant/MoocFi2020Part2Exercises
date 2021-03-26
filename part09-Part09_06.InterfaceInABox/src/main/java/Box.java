
import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> boxList;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.boxList = new ArrayList<>();
    }

    public void add(Packable packable) {
        double weightOfAll = weight() + packable.weight();

        if (!(weightOfAll > this.maxCapacity)) {
            this.boxList.add(packable);
        }

    }

    @Override
    public double weight() {
        double totalWeight = 0.0;

        for (Packable packables : this.boxList) {
            totalWeight += packables.weight();
        }

        return totalWeight;
    }

    public String toString() {
        return "Box: " + this.boxList.size() + " items, total weight " + weight() + " kg";
    }

}
