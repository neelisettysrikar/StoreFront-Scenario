import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    void testAddAndCalculateTotal() {
        Cart cart = new Cart();
        Product p1 = new Product(1, "Laptop", "Dell XPS", 1000f, 10);
        Product p2 = new Product(2, "Mouse", "Logitech", 50f, 20);

        cart.addItem(p1);
        cart.addItem(p2);

        assertEquals(2, cart.getItemCount());
        assertEquals(1050f, cart.getTotalPrice());
    }
}
