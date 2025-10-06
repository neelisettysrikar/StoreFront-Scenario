import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceMockTest {

    @Test
    void testPaymentCalledWithCorrectAmount() {
        PaymentProcessor mockPayment = mock(PaymentProcessor.class);
        Cart cart = new Cart();
        cart.addProduct(new Product("Headphones", 200.0));

        when(mockPayment.process(200.0)).thenReturn(true);

        OrderService service = new OrderService(mockPayment);
        boolean result = service.placeOrder(cart);

        verify(mockPayment, times(1)).process(200.0);
        assertTrue(result);
    }
}
