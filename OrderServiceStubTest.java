import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

class OrderServiceStub {
    public Order getSampleOrder() {
        return new Order(1, 5000f);
    }
}

public class OrderServiceStubTest {

    @Test
    void testOrderStubReturnsPendingOrder() {
        OrderServiceStub stub = new OrderServiceStub();
        Order order = stub.getSampleOrder();

        assertEquals("Pending", order.getStatus());
        assertTrue(order.getDate().isBefore(LocalDateTime.now().plusSeconds(1)));
    }

    @Test
    void testConfirmOrderChangesStatus() {
        Order order = new Order(2, 3000f);
        order.confirmOrder();
        assertEquals("Confirmed", order.getStatus());
    }
}
