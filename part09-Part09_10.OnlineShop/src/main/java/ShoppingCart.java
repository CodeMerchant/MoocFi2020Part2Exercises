
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author musa
 */
public class ShoppingCart {

    private Map<String, Item> itemsMap;

    public ShoppingCart() {

        this.itemsMap = new HashMap<>();

    }

    public void add(String product, int price) {

        //Part 7 - smh 
        if (itemsMap.keySet().contains(product)) {

            itemsMap.get(product).increaseQuantity();
        } else {
            //Part 5 - adding an item to the cart that matches the product given as a parameter
            itemsMap.put(product, new Item(product, 1, price));
        }

    }

    public int price() {
        //Part 5 continued
        int sum = 0;
        for (Item prices : itemsMap.values()) {
            sum += prices.price();
        }
        return sum;
    }

    public void print() {
        //Part 6 - Printing the cart
        for (String string : itemsMap.keySet()) {
            System.out.println(itemsMap.get(string).toString());
        }
    }

}
