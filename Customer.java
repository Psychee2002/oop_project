public class Customer extends Human 
{
    // Attributes
    private double abilityToBuyRange;

    // No-Argument Constructor
    public Customer(String name, String email, String address, int nationalIdentificationNumber, int phoneNumber)
    {
        super(name, email, address, nationalIdentificationNumber, phoneNumber);
    }
    public Customer(String name, String email, String address, int nationalIdentificationNumber, int phoneNumber, double abilityToBuyRange){
        super(name, email, address, nationalIdentificationNumber, phoneNumber);
        this.abilityToBuyRange = abilityToBuyRange;
    }

    // Getters & Setters
    public double getAbilityToBuyRange() 
    {
        return abilityToBuyRange;
    }
    public void setAbilityToBuyRange(double abilityToBuyRange) 
    {
        this.abilityToBuyRange = abilityToBuyRange;
    }
}
