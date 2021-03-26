
import java.util.ArrayList;


/**
 *
 * @author musa
 */
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int cap) {
        setMax(cap);
        this.items = new ArrayList<>();
    }

    public void setMax(int max) {
        this.capacity = max;
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item itemList : this.items) {
            totalWeight += itemList.getWeight();
        }

        return totalWeight;
    }

    @Override
    public void add(Item item) {

        if (!(totalWeight() + item.getWeight() > this.capacity)) {
            this.items.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
