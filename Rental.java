public class Rental extends Car
{
    private static int count = 10;

    public Rental(String model, int year, String color, String bodyStyle, String fuelType, int numberOfSeats)
    {
        super(model, year, color, bodyStyle, fuelType, numberOfSeats);
        count--;
    }

    public static Double calculateRentPrice (int dateOfRentalStart)
    {
        double price = (1000 * dateOfRentalStart);
        return price;
    }
}
