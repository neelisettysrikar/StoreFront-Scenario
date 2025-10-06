public class Shipping {

    private int shippingID;
    private String method;
    private double cost;
    private String status;

    public Shipping(int shippingID, String method, double cost, String status) {
        this.shippingID = shippingID;
        this.method = method;
        this.cost = cost;
        this.status = status;
    }

    public void processShipping() {
        // TODO - implement Shipping.processShipping
        throw new UnsupportedOperationException();
    }
}
