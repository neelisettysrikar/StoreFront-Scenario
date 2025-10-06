import java.time.LocalDate;

public class Promotion {

    private int promoID;
    private String description;
    private double discountPercentage;
    private LocalDate startDate;
    private LocalDate endDate;

    public Promotion(int promoID, String description, double discountPercentage, LocalDate startDate, LocalDate endDate) {
        this.promoID = promoID;
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void applyPromotion() {
        // TODO - implement Promotion.applyPromotion
        throw new UnsupportedOperationException();
    }
}
