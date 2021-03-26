

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author musa
 */
public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockAmount;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stockAmount = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stockAmount.put(product, stock);

    }

    public int price(String product) {

        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {

        return stockAmount.getOrDefault(product, 0);
    }

    public boolean take(String product) {

        if ((this.stock(product) > 0)) {
            stockAmount.put(product, stockAmount.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> productsKeySet = prices.keySet();
        
        
        return productsKeySet;
    }

}
