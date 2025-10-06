import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int cartID;
    private float totalPrice;

    public void addItem() {
        // TODO - implement Cart.addItem
        throw new UnsupportedOperationException();
    }

    public void removeItem() {
        // TODO - implement Cart.removeItem
        throw new UnsupportedOperationException();
    }

    public void calculateTotal() {
        // TODO - implement Cart.calculateTotal
        throw new UnsupportedOperationException();
    private List<Product> items = new ArrayList<>();

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

    public int getItemCount() {
        return items.size();
    }
}
