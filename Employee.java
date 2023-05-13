import java.util.Scanner;

public class Employee extends Human 
{
    static Scanner input = new Scanner(System.in);

    // Attributes
    private final String username = "sarah";
    private final String password = "password";
    private int shift;

    //Constructor
    public Employee(String name, String email, String address, int nationalIdentificationNumber, int phoneNumber, int shift)
    {
        super(name, email, address, nationalIdentificationNumber, phoneNumber);
        this.shift = shift;
    }

    // Getters (Accessors) & Setters (Mutators)
    public int getShift() 
    {
        return shift;
    }
    public void setShift(int shift) 
    {
        this.shift = shift;
    }

    // Methods
    public static void login()
    {
        while (true)
        {
            System.out.println("Username: ");
            String username = input.next();

            System.out.println("Password: ");
            String password = input.next();

            if (username.equals("sarah")  && password.equals("password"))
            {
                System.out.println("Logged in");
                break;
            }
            else
                System.out.println("Invalid username or password.");
        }
    }
}