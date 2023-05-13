public class Human 
{
    // Attributes
    private String name;
    private String email;
    private String address;

    private int nationalIdentificationNumber;
    private int phoneNumber;

    //Constructor
    public Human(String name, String email, String address, int nationalIdentificationNumber, int phoneNumber)
    {
        this.name = name;
        this.email = email;
        this.address = address;

        this.nationalIdentificationNumber = nationalIdentificationNumber;
        this.phoneNumber = phoneNumber;
    }

    // Getters (Accessors) & Setters (Mutators)
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public int getNationalIdentificationNumber() 
    {
        return nationalIdentificationNumber;
    }
    public void setNationalIdentificationNumber(int nationalIdentificationNumber) 
    {
        this.nationalIdentificationNumber = nationalIdentificationNumber;
    }

    public int getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

}