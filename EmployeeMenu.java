import java.util.Scanner;

public class EmployeeMenu
{
    static Scanner input = new Scanner(System.in);

    public static void display()
    {
        Employee.login();
        
        System.out.println("1. Add Car");
        System.out.println("2. Display Customers?");

        // to-do : add try & catch
        int choice;
        do 
        {
            choice = input.nextInt();
        } while (choice != 1 && choice != 2);

        // Add Car
        if (choice == 1) 
        {
            System.out.println("How many cars are you adding?");
            int carsCount = input.nextInt();

            // Arrays
            String[] model = new String[carsCount];
            String[] color = new String[carsCount];
            String[] fuelType = new String[carsCount];
            String[] bodyStyle = new String[carsCount];

            int[] numberOfSeats = new int[carsCount];
            int[] year = new int[carsCount];

            System.out.println("Which menu are you adding to?");
            int choice1;
            do 
            {
                System.out.println("1. Rental");
                System.out.println("2. Sale");
                choice1 = input.nextInt();
            } while (choice1 != 1 && choice1 != 2);

            if (choice1 == 1) 
            {
                for (int i = 0; i < carsCount; i++) 
                {
                    System.out.println("Enter Model: ");
                    model[i] = input.next();

                    System.out.println("Enter Color: ");
                    color[i] = input.next();

                    System.out.println("Enter Fuel Type: ");
                    fuelType[i] = input.next();

                    System.out.println("Enter Body Style: ");
                    bodyStyle[i] = input.next();

                    System.out.println("Enter Number of seats: ");
                    numberOfSeats[i] = input.nextInt();

                    System.out.println("Enter Year: ");
                    year[i] = input.nextInt();

                    Rental car = new Rental(model[i], year[i], color[i], bodyStyle[i], fuelType[i], numberOfSeats[i]);
                }
            }

            else if (choice1 == 2) 
            {
                for (int i = 0; i < carsCount; i++) 
                {
                    System.out.println("Enter Model: ");
                    model[i] = input.next();

                    System.out.println("Enter Color: ");
                    color[i] = input.next();

                    System.out.println("Enter Fuel Type: ");
                    fuelType[i] = input.next();

                    System.out.println("Enter Body Style: ");
                    bodyStyle[i] = input.next();

                    System.out.println("Enter Number of seats: ");
                    numberOfSeats[i] = input.nextInt();

                    System.out.println("Enter Year: ");
                    year[i] = input.nextInt();

                    Sold car = new Sold(model[i], year[i], color[i], bodyStyle[i], fuelType[i], numberOfSeats[i]);
                }
            }
        }

        // Display Customers
        else if (choice == 2)
        {
            
        }
    }
}
