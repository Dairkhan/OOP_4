package hotelmanagement;

public class SeasonalPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(RoomBooking booking) {

        return booking.getBasePrice() * (booking.isHighSeason() ? 1.2 : 1.0);
    }
}
