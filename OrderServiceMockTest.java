import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderServiceMockTest {

    @Test
    void testOrderProcessedUsingMock() {
        PaymentProcessor processor = mock(PaymentProcessor.class);
        when(processor.process(anyFloat())).thenReturn(true);

        Cart cart = new Cart();
        cart.addItem(new Product(1, "Keyboard", "Mechanical", 100f, 5));

        OrderServiceWithMock service = new OrderServiceWithMock(processor);
        boolean result = service.placeOrder(cart);

        assertTrue(result);
        verify(processor).process(100f);
    }
}

interface PaymentProcessor {
    boolean process(float amount);
}

class OrderServiceWithMock {
    private PaymentProcessor paymentProcessor;

    public OrderServiceWithMock(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean placeOrder(Cart cart) {
        return paymentProcessor.process(cart.getTotalPrice());
    }
}
