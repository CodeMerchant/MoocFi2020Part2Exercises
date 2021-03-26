
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author musa
 */
public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double maxValue() {
        /*
                 double maxValue = this.changes.get(0);
        for (Double change : changes) {
            if (change < maxValue) {
                maxValue = change;
            }
        }

        if (changes.isEmpty()) {
            return 0;
        }
        return maxValue;
         */

        //discovered quicker way to find smallest
        if (changes.isEmpty()) {
            return 0;
        }

        return Collections.max(changes);
    }

    public double minValue() {

        return Collections.min(changes);
    }

    public double average() {

        double sum = 0.0;

        for (Double change : changes) {
            sum += change;
        }

        return sum / changes.size();
    }

    @Override
    public String toString() {
        return changes.toString();
    }

}
