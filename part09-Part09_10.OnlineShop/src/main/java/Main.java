
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse warehouse = new Warehouse();
        
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);
        
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
        
        System.out.println("");
        
        warehouse.addProduct("Nescafe", 5, 1);
        System.out.println("stock:");
        System.out.println("Nescafe: " + warehouse.stock("Nescafe"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
        
        System.out.println("taking Nescafe coffee " + warehouse.take("Nescafe"));
        System.out.println("taking Nescafe coffee " + warehouse.take("Nescafe"));
        System.out.println("taking sugar " + warehouse.take("sugar"));
        
        System.out.println("stock:");
        System.out.println("Nescafe: " + warehouse.stock("Nescafe"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
        
        System.out.println("");
        
        warehouse.addProduct("yoghurt", 2, 20);
        warehouse.addProduct("buttermilk", 2, 20);
        
        System.out.println("products:");
        
        for (String product : warehouse.products()) {
            System.out.println(product);
        }
        
        System.out.println("");
        
        Item item = new Item("milk", 4, 2);
        
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
        
        System.out.println("");
        System.out.println("Shopping cart");
        
        System.out.println("");
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
        
        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
        
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
        
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
        
        System.out.println("");
        System.out.println("Online store");
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        
        Store store = new Store(warehouse, scan);
        store.shop("Axel");
    }
}
