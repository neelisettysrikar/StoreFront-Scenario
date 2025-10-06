import java.util.*;

public class Product {

    private int productID;
    private String name;
    private String description;
    private float price;
    private int stock;

    public Product(int productID, String name, String description, float price, int stock) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getProductID() {
        return productID;
    }

    public float getPrice() {
        return price;
    }

    public void updateStock(int amount) {
        this.stock += amount;
    }

    public String getDetails() {
        return name + " - " + description + " - $" + price;
    }
}
