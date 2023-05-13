public class Rental extends Car
{
    private static int count = 10;

    // Constructor
    public Rental(String model, int year, String color, String bodyStyle, String fuelType, int numberOfSeats)
    {
        // Calling car constructor
        super(model, year, color, bodyStyle, fuelType, numberOfSeats);
        count--;
    }

    // Getters (Accessors) & Setters (Mutators)

    // Methods
    public static Double calculateRentPrice (int dateOfRentalStart)
    {
        double price = (1000 * dateOfRentalStart);
        return price;
    }
}
