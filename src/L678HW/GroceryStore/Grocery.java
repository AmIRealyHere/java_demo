package L678HW.GroceryStore;

public abstract class Grocery extends Product {
    public Grocery(String name, double price, int quantityItems) {
        super(name, price, quantityItems);
    }

    @Override
    public double calculateCost(int quantity) {
        return price * quantityItems;
    }
}