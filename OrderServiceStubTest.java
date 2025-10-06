import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PaymentProcessorStub {
    boolean process(float amount) {
        return true; // always succeeds
    }
}

public class OrderServiceStubTest {

    @Test
    void testStubAlwaysSucceeds() {
        PaymentProcessorStub stub = new PaymentProcessorStub();
        boolean result = stub.process(200f);

        assertTrue(result, "Stub should always return true");
    }
}
