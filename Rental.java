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

    public static void displayRentalMenu(String [] model, int [] year, String [] color, String [] bodyStyle, String [] fuelType, int [] numberOfSeats, int carsCoun, int i){
        
            System.out.println("Car" + i + model[i]); 
            System.out.println("Model: " + model[i]);    
            System.out.println("Color: " + color[i]);    
            System.out.println("Fuel Type: " + fuelType[i]);    
            System.out.println("Body Style: " + bodyStyle[i]);    
            System.out.println("Number of seats: " +numberOfSeats[i]);    
            System.out.println("Year: " + year[i]);
        
}

    public static void displayRentalMenu(String string, int i, String string2, String string3, String string4, int j,
            int carsCount) {
    }

    public static void displayRentalMenu(String string, int i, String string2, String string3, String string4, int j,
            int carsCount, int i2) {
    }
}
