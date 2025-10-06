import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceStubTest {

    class PaymentStub implements PaymentProcessor {
        @Override
        public boolean process(double amount) {
            return true; // always succeeds
        }
    }

    @Test
    void testOrderSucceedsUsingStub() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Book", 20.0));
        OrderService orderService = new OrderService(new PaymentStub());

        assertTrue(orderService.placeOrder(cart));
    }
}
