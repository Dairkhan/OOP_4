package hotelmanagement;

public class RoomTypePricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(RoomBooking booking) {

        switch (booking.getRoomType()) {
            case "Suite":
                return booking.getBasePrice() * 1.5;
            case "Deluxe":
                return booking.getBasePrice() * 1.2;
            default:
                return booking.getBasePrice();
        }
    }
}
