
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author musa
 */
public class Store {

    private Warehouse warehouse;
    private Scanner scan;

    public Store(Warehouse warehouse, Scanner scan) {
        this.warehouse = warehouse;
        this.scan = scan;
    }

    //method that handles the customers visit to the store
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("Our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("What to put in the cart (Press enter to go the register): ");
            String product = scan.nextLine();
            if (product.isEmpty()) {
                break;
            }

            //Adding product to the cart.
            //NB!! We have to reduce the stock from the warehouse every time a product is added to the cart.
            //as long as we can take product from the warehouse
            if (warehouse.take(product)) {
                //add the product to the cart
                cart.add(product, warehouse.price(product));

            } else {
                System.out.println("no products in warehouse");
            }

        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }

}
