import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    void testAddProductAndTotal() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Laptop", 1000.0));
        cart.addProduct(new Product("Mouse", 50.0));

        assertEquals(2, cart.getItemCount());
        assertEquals(1050.0, cart.getTotal());
    }
}
