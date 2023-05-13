import java.util.Scanner;
import java.util.InputMismatchException;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a customer or a staff?");

        int choice = 0;
        do 
        {
            try
            {
                System.out.println("1. Customer");
                System.out.println("2. Staff");
                choice = input.nextInt();
            }
            catch( InputMismatchException exception)
            {
                System.out.println("Expected an Integer");
                // Clears the buffer
                input.next();
            }
        } while (choice != 1 && choice != 2);

        if (choice == 1)
        CustomerMenu.display();
        else
        EmployeeMenu.display();
    }
}