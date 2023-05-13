public class Sold extends Car
{
    // Attributes
    private static int count = 10;

    // Constructor
    public Sold(String model, int year, String color, String bodyStyle, String fuelType, int numberOfSeats)
    {
        super(model, year, color, bodyStyle, fuelType, numberOfSeats);
        count--;
    }
    
}
