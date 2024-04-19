package L678HW.GroceryStore;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(Product product) {
        Iterator<Product> iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            Product item = iterator.next();
            if (item.equals(product)) {
                iterator.remove();
                break;
            }
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Product product : cartItems) {
            totalCost += product.getPrice() * product.getQuantityItems();
        }
        return totalCost;
    }

    public void displayCartContents() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : cartItems) {
        System.out.println(product.getQuantityItems()+ " " + product.getName() + " - " + product.getPrice() + " Lei");
        }
    }
}