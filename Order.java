import java.time.LocalDateTime;

public class Order {

    private int orderID;
    private datetime date;
    private str status;
    private float totalAmount;

    public void confirmOrder() {
        // TODO - implement Order.confirmOrder
        throw new UnsupportedOperationException();
    }

    public void cancelOrder() {
        // TODO - implement Order.cancelOrder
        throw new UnsupportedOperationException();
    private LocalDateTime date;
    private String status;
    private float totalAmount;

    public Order(int orderID, float totalAmount) {
        this.orderID = orderID;
        this.totalAmount = totalAmount;
        this.date = LocalDateTime.now();
        this.status = "Pending";
    }

    public void confirmOrder() {
        this.status = "Confirmed";
    }

    public void cancelOrder() {
        this.status = "Cancelled";
    }

    public String getStatus() {
        return status;
    }

    public float getTotalAmount() {
        return totalAmount;
    }
}
