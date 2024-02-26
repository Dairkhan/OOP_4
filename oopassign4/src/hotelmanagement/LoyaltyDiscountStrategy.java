package hotelmanagement;

public class LoyaltyDiscountStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(RoomBooking booking) {

        return booking.getBasePrice() * (booking.isLoyalCustomer() ? 0.8 : 1.0);
    }
}
