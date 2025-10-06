import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Stub payment processor that always succeeds
class PaymentProcessorStub {
    boolean process(float amount) {
        return true;
    }
}

class OrderService {
    private PaymentProcessorStub paymentProcessor;

    public OrderService(PaymentProcessorStub paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean placeOrder(Order order) {
        return paymentProcessor.process(order.getTotalAmount());
    }
}

public class OrderServiceStubTest {

    @Test
    void testOrderProcessedWithStub() {
        PaymentProcessorStub stub = new PaymentProcessorStub();
        OrderService service = new OrderService(stub);
        Order order = new Order(1, 500f);

        boolean result = service.placeOrder(order);
        assertTrue(result, "Stub should always return true");
    }
}
