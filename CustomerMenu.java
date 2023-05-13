import java.util.Scanner;

public class CustomerMenu 
{
    static Scanner input = new Scanner(System.in);

    public static void display() 
    {
        System.out.println("Rent or Buy?");
        String answer = input.next();
        EmployeeMenu rentalMenu = new EmployeeMenu();
        if (answer.toLowerCase().equals("rent")) 
        {
            // display rentable cars
            System.out.println("Here is the Rental Menu: ");
            //EmployeeMenu.displayRentalMenu();
            for (int i = 0; i < EmployeeMenu.carsCount; i++) {
                Rental.displayRentalMenu(EmployeeMenu.model[i], EmployeeMenu.year[i], EmployeeMenu.color[i], EmployeeMenu.bodyStyle[i], EmployeeMenu.fuelType[i], EmployeeMenu.numberOfSeats[i] , EmployeeMenu.carsCount,i );
            }
            // input
            System.out.println("Which Car would you like to Rent?");
            int selectionR = input.nextInt();
            System.out.println("Your Selection is "+ selectionR);
            System.out.println("How many Days would you like to rent this car for?");
            int rentaldays = input.nextInt();
            Double rentPrice = Rental.calculateRentPrice(rentaldays);
            System.out.println("Rent fees will be " + rentPrice);
        }
        else if (answer.toLowerCase().equals("buy")) 
        {
            // display Sale cars
            System.out.println("Here is the Sale Menu: ");
            for (int i = 0; i < EmployeeMenu.carsCount; i++) {
                Sold.displaySaleMenu(EmployeeMenu.model[i], EmployeeMenu.year[i], EmployeeMenu.color[i], EmployeeMenu.bodyStyle[i], EmployeeMenu.fuelType[i], EmployeeMenu.numberOfSeats[i] , EmployeeMenu.carsCount,i );
            }
            // input
            System.out.println("Which Car would you like to Buy?");
            int selectionB = input.nextInt();
            System.out.println("Your Selection is "+ selectionB);
            System.out.println("What's your payment range? Enter a number from 500000 to 1000000");
            Double paymentRange = input.nextDouble();

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

        Customer customer = new Customer(name, email, address, nationalIdentificationNumber, phoneNumber);
        
        // Display Data
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Your Data");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("National Identification Number: " + customer.getNationalIdentificationNumber());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Kindly select your Area to display the nearest pickup location");
        System.out.println("New Cairo/ Helioplis/ Nasr city");
        String Area = input.next();

                if (Area.equals("New Cairo"))
                    System.out.println("Pick your car up from --Car agency New Cairo-- Near Dunkin doughnuts, New Cairo.");
                else if (Area.equals("Helioplis"))
                    System.out.println("Pick your car up from --Car agency Helioplis-- Near Dunkin doughnuts, Helioplis.");
                else if (Area.equals("Nasr city"))
                    System.out.println("Pick your car up from --Car agency Nasr city-- Near Dunkin doughnuts, Nasr city.");
        System.out.println("Thank you :)");
    }
}
