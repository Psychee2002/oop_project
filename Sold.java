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
    public static void displaySaleMenu(String [] model, int [] year, String [] color, String [] bodyStyle, String [] fuelType, int [] numberOfSeats, int carsCount, int i){
        
            System.out.println("Car" + i + model[i]); 
            System.out.println("Model: " + model[i]);    
            System.out.println("Color: " + color[i]);    
            System.out.println("Fuel Type: " + fuelType[i]);    
            System.out.println("Body Style: " + bodyStyle[i]);    
            System.out.println("Number of seats: " +numberOfSeats[i]);    
            System.out.println("Year: " + year[i]);
        
}

    public static void displaySaleMenu(String string, int i, String string2, String string3, String string4, int j,
            int carsCount, int i2) {
    }
}
