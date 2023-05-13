import java.util.Scanner;

public class CustomerMenu 
{
    static Scanner input = new Scanner(System.in);

    public static void display() 
    {
        System.out.println("Rent or Buy?");
        String answer = input.next();

        if (answer.toLowerCase().equals("rent")) 
        {
            // display rentable cars
            System.out.println("Here is the Rental Menu: ");

            // input
            System.out.println("Which Car do you like to Rent?");
            int selection = input.nextInt();
        }

        // Creates a customer profile.
        System.out.println("Name");
        String name = input.next();

        System.out.println("Email");
        String email = input.next();

        System.out.println("Address");
        String address = input.next();

        System.out.println("National Identification Number");
        int nationalIdentificationNumber = input.nextInt();

        System.out.println("Phone Number");
        int phoneNumber = input.nextInt();

        System.out.println("Payment Range");
        Double abilityToBuyRange = input.nextDouble();

        Customer customer = new Customer(name, email, address, nationalIdentificationNumber, phoneNumber);

        // Display Data
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Your Data");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("National Identification Number: " + customer.getNationalIdentificationNumber());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Payment Range: " + customer.getAbilityToBuyRange());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
