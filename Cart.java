import java.util.*;

public class Cart {

    private int cartID;
    private float totalPrice;
    private List<Product> items = new ArrayList<>();

    public Cart() {} // default constructor

    public Cart(int cartID) {
        this.cartID = cartID;
    }

    public void addItem(Product product) {
        items.add(product);
        calculateTotal();
    }

    public void removeItem(Product product) {
        items.remove(product);
        calculateTotal();
    }

    public void calculateTotal() {
        totalPrice = 0;
        for (Product p : items) {
            totalPrice += p.getPrice();
        }
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }
}
