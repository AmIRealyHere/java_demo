package L678HW.GroceryStore;

public class StoreDemo {
    public static void main(String[] args) {
        Product milk = Product.createProduct("TVA 8%","Milk", 21.50,2);
        Product bread = Product.createProduct("TVA 8%","Bread Borodinskii", 18.75,2);
        Product honey = Product.createProduct("TVA 20%","Honey", 106.99,1);
        Product cheese = Product.createProduct("TVA 20%","Cheese Brie", 89.50,5);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(milk);
        cart.addProduct(bread);
        cart.addProduct(honey);
        cart.addProduct(cheese);

        cart.displayCartContents();

        double totalCost = cart.calculateTotalCost();
        System.out.println("Total cost: " + totalCost + " Lei");
    }
}