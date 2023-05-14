import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeMenu
{
    static Scanner input = new Scanner(System.in);
    static int carsCount;
    
            // Arrays
            static String[] model = new String[carsCount];
            static String[] color = new String[carsCount];
            static String[] fuelType = new String[carsCount];
            static String[] bodyStyle = new String[carsCount];

            static int[] numberOfSeats = new int[carsCount];
            static int[] year = new int[carsCount];

    public static void display()
    {
        Employee.login();
        
        System.out.println("1. Add Car");
        // to-do : add try & catch
        int choice =0;
        do 
        {
            try{
            choice = input.nextInt();
            }
            catch( InputMismatchException exception)
            {
            System.out.println("Expected an int");
            input.next();
            }
        } while (choice != 1);

        // Add Car
            System.out.println("How many cars are you adding?");
            carsCount = input.nextInt();
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
                    try {
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
                    Rental.displayRentalMenu(model[i], year[i], color[i], bodyStyle[i], fuelType[i], numberOfSeats[i] , carsCount);
                    }
                    catch( InputMismatchException exception)
                    {
                    System.out.println("invalid input Type");
                    input.next();
                    }
                }
            }

            else if (choice1 == 2) 
            {
                for (int i = 1 ; i <= carsCount; i++) 
                {
                    try {
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
                    Sold.displaySaleMenu(model[i], year[i], color[i], bodyStyle[i], fuelType[i], numberOfSeats[i] , carsCount,i);
                    }
                    
                    catch( InputMismatchException exception)
                    {
                    System.out.println("invalid input Type");
                    input.next();
                    }

                }
        }
            
        }
    }


