
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author musa
 */
public class IOU {

    private HashMap<String, Double> iou = new HashMap<>();

    public IOU() {

    }

    public void setSum(String toWhom, double amount) {

        iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {

        //got this code from Cardo Uustal on GitHub. Don't understand why or how MoocFi
        //expects us to know this when they haven't even covered it prior to the exercise. Poor form from them.
        for (Map.Entry<String, Double> iou1 : iou.entrySet()) {
            if (iou1.getKey().equalsIgnoreCase(toWhom)) {
                return iou1.getValue();
            }

        }

        return 0;

    }

    public static String sanitizeString(String text) {
        if (text == null) {
            return "";
        }
        text = text.toLowerCase();
        return text.trim();
    }
}
