import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void testAddItemIncreasesTotalPrice() {
        Cart cart = new Cart(1);
        Product p1 = new Product(101, "Phone", "Android Phone", 15000f, 5);
        cart.addItem(p1);
        assertEquals(15000f, cart.getTotalPrice());
    }

    @Test
    void testRemoveItemDecreasesTotalPrice() {
        Cart cart = new Cart(1);
        Product p1 = new Product(101, "Phone", "Android Phone", 15000f, 5);
        Product p2 = new Product(102, "Laptop", "Gaming Laptop", 80000f, 2);
        cart.addItem(p1);
        cart.addItem(p2);
        cart.removeItem(p1);
        assertEquals(80000f, cart.getTotalPrice());
    }

    @Test
    void testEmptyCartHasZeroTotal() {
        Cart cart = new Cart(1);
        assertEquals(0f, cart.getTotalPrice());
    }
}
