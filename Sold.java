public class Sold extends Car
{
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
    public static void defaultSMenu (){
        System.out.println("1");
        System.out.println("Model: BMW");    
        System.out.println("Color: Black");    
        System.out.println("Fuel Type: Electric");    
        System.out.println("Body Style: sedan");    
        System.out.println("Number of seats: 4");    
        System.out.println("Year: 2022");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("2");
        System.out.println("Model: KIA");    
        System.out.println("Color: Blue");    
        System.out.println("Fuel Type: Electric");    
        System.out.println("Body Style: sedan");    
        System.out.println("Number of seats: 4");    
        System.out.println("Year: 2020");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

    }
    public static int soldCalc (int selection){
        if ( selection ==1)
        {
            System.out.println("You selected Car 1. Fees will be 100000000");
            System.out.println("Model: BMW");    
        System.out.println("Color: Black");    
        System.out.println("Fuel Type: Electric");    
        System.out.println("Body Style: sedan");    
        System.out.println("Number of seats: 4");    
        System.out.println("Year: 2022");
            return 1;
        }
        else if ( selection ==2)
        {
            System.out.println("You selected Car 2. Fees will be 1000000");
            System.out.println("Model: KIA");    
        System.out.println("Color: Blue");    
        System.out.println("Fuel Type: Electric");    
        System.out.println("Body Style: sedan");    
        System.out.println("Number of seats: 4");    
        System.out.println("Year: 2020");
            return 1;
        }
        System.out.println("Please Select a car from 1 or 2. ");
        return 1;
}
}
