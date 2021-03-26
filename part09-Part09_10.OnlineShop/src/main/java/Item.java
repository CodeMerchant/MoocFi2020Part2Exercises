/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    /**
     * Creates an item corresponding to the product given as a parameter
     *
     * @param product name of the product
     * @param qty tells us how many of the product are in the item
     * @param unitPrice price of a single product
     */
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity += 1;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }

}
