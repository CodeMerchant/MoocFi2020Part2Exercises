/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory change;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        this.change = new ChangeHistory();

        super.addToWarehouse(initialBalance);
        this.change.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        change.add(super.getBalance());

    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);

        change.add(super.getBalance());

        return taken;

    }

    public void printAnalysis() {
        String analysis = "Product: " + super.getName() + "\n"
                + "History: " + history() + "\n"
                + "Largest amount of product: " + change.maxValue() + "\n"
                + "Smallest amount of product: " + change.minValue() + "\n"
                + "Average: " + change.average();

        System.out.println(analysis);

    }

    public String history() {

        return change.toString();
    }
}
