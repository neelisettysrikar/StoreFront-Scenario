import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class PaymentProcessor {
    boolean process(float amount) {
        return true;
    }
}

public class OrderServiceMockTest {

    @Test
    void testPaymentProcessWithMock() {
        PaymentProcessor processor = mock(PaymentProcessor.class);
        when(processor.process(anyFloat())).thenReturn(true);

        Order order = new Order(1, 100f);
        boolean result = processor.process(order.getTotalAmount());

        assertTrue(result);
        verify(processor).process(100f);
    }
}
