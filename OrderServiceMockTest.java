import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceMockTest {

    @Test
    void testMockTotalAmount() {
        // Create a mock Order
        Order mockOrder = mock(Order.class);

        // Stub the getTotalAmount() method
        when(mockOrder.getTotalAmount()).thenReturn(250.0f);

        // Verify stub behavior
        assertEquals(250.0f, mockOrder.getTotalAmount());
        verify(mockOrder, times(1)).getTotalAmount();
    }

    @Test
    void testMockOrderConfirmation() {
        // Create a mock Order
        Order mockOrder = mock(Order.class);

        // Stub getStatus() to return "Confirmed"
        when(mockOrder.getStatus()).thenReturn("Confirmed");

        // Verify that the mocked return value works as expected
        assertEquals("Confirmed", mockOrder.getStatus());
        verify(mockOrder, times(1)).getStatus();
    }
}
