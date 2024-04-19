package L678HW.GroceryStore;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantityItems;

    public Product(String name, double price, int quantityItems) {
        this.name = name;
        this.price = price;
        this.quantityItems = quantityItems;
    }

    public abstract double calculateCost(int quantityItems);

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantityItems() {
        return quantityItems;
    }
    public static Product createProduct(String type, String name, double price, int quantityItems){
        return switch (type.toUpperCase()) {
            case "TVA 20%", "TVA 8%" -> new Grocery(name, price, quantityItems) {
                @Override
                public double calculateCost(int quantityItems) {
                    return 0;
                }
            };
            default -> throw new IllegalArgumentException("Invalid TVA: " + type);
        };
    }
}

