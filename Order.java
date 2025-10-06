import java.time.LocalDateTime;

public class Order {

    private int orderID;
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
