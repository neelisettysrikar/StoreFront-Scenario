import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceMockTest {

    @Test
    void testMockOrderConfirmation() {
        Order mockOrder = Mockito.mock(Order.class);

        when(mockOrder.getStatus()).thenReturn("Pending").thenReturn("Confirmed");

        // simulate confirmOrder() call
        mockOrder.confirmOrder();

        assertEquals("Confirmed", mockOrder.getStatus());
        verify(mockOrder).confirmOrder();
    }

    @Test
    void testMockTotalAmount() {
        Order mockOrder = Mockito.mock(Order.class);
        when(mockOrder.getTotalAmount()).thenReturn(5000f);

        assertEquals(5000f, mockOrder.getTotalAmount());
        verify(mockOrder).getTotalAmount();
    }
}
