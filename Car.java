public class Car 
{
    private String model;
    private int year;
    private String color;
    private String bodyStyle;
    private String fuelType;
    private int numberOfSeats;

    // Constructor
    public Car(String model, int year, String color, String bodyStyle, String fuelType, int numberOfSeats)
    {
        this.model = model;
        this.year = year;
        this.color = color;
        this.bodyStyle = bodyStyle;
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
    }

    // Getters & Setters
    public String getModel() 
    {
        return model;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getBodyStyle() 
    {
        return bodyStyle;
    }
    public void setBodyStyle(String bodyStyle) 
    {
        this.bodyStyle = bodyStyle;
    }

    public int getNumberOfSeats() 
    {
        return numberOfSeats;
    }
    
    public void setNumberOfSeats(int numberOfSeats) 
    {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() 
    {
        return fuelType;
    }
    public void setFuelType(String fuelType) 
    {
        this.fuelType = fuelType;
    }
}