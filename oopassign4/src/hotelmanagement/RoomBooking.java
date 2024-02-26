package hotelmanagement;

public class RoomBooking {
    private String roomType;
    private int numberOfNights;
    private boolean highSeason;
    private boolean loyalCustomer;
    private double basePrice;

    public RoomBooking(String roomType, int numberOfNights, boolean highSeason, boolean loyalCustomer, double basePrice) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.highSeason = highSeason;
        this.loyalCustomer = loyalCustomer;
        this.basePrice = basePrice;
    }



    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isHighSeason() {
        return highSeason;
    }

    public boolean isLoyalCustomer() {
        return loyalCustomer;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
