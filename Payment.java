public class Payment {

    private int paymentID;
    private String method;
    private float amount;
    private String status;

    public Payment(int paymentID, String method, float amount, String status) {
        this.paymentID = paymentID;
        this.method = method;
        this.amount = amount;
        this.status = status;
    }

    public void processPayment() {
        // TODO - implement Payment.processPayment
        throw new UnsupportedOperationException();
    }
}
