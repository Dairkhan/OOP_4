package hotelmanagement;

public class BookingContext {
    private PricingStrategy strategy;

    public BookingContext(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(RoomBooking booking) {
        return strategy.calculatePrice(booking);
    }
}
