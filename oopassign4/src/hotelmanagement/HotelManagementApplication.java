package hotelmanagement;

import java.util.Scanner;

public class HotelManagementApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter room type (Standard, Deluxe, Suite): ");
            String roomType = scanner.nextLine();


            System.out.println("Enter the number of nights: ");
            int numberOfNights = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Is it high season? (yes/no): ");
            boolean highSeason = scanner.nextLine().trim().equalsIgnoreCase("yes");


            System.out.println("Is the customer a loyal customer? (yes/no): ");
            boolean loyalCustomer = scanner.nextLine().trim().equalsIgnoreCase("yes");

            System.out.println("Enter the base price for a night: ");
            double basePrice = scanner.nextDouble();

            RoomBooking booking = new RoomBooking(roomType, numberOfNights, highSeason, loyalCustomer, basePrice);

            BookingContext context = new BookingContext(new SeasonalPricingStrategy());
            System.out.println("Seasonal Price: " + context.calculatePrice(booking));

            context.setStrategy(new RoomTypePricingStrategy());
            System.out.println("Room Type Price: " + context.calculatePrice(booking));

            context.setStrategy(new LoyaltyDiscountStrategy());
            System.out.println("Loyalty Price: " + context.calculatePrice(booking));
        } finally {
            scanner.close();
        }
    }
}
