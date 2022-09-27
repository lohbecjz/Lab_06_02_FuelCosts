/**
 * @author lohbecjz@mail.uc.edu
 */

import java.util.Scanner;

public class Lab_06_02_FuelCosts
{
    public static void main(String[] args)
    {
        // Declare variables
        double gasInTank = 0;
        double milesPerGallon = 0;
        double gasPricePerGallon = 0;
        double costOneHundredMiles = 0;
        double distanceGasInTank = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        // Prompt and input
        System.out.print("Enter the number of gallons of gas in the tank: ");
        if(in.hasNextDouble())
        {
            gasInTank = in.nextDouble();
            in.nextLine(); // Clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
            System.exit(0); // Terminate the program
        }

        System.out.print("Enter fuel efficiency in miles per gallon: ");
        if(in.hasNextDouble())
        {
            milesPerGallon = in.nextDouble();
            in.nextLine(); // Clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
            System.exit(0);
        }

        System.out.print("Enter the price of gas per gallon: ");
        if(in.hasNextDouble())
        {
            gasPricePerGallon = in.nextDouble();
            in.nextLine(); // Clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
            System.exit(0);
        }

        // Process and output
        costOneHundredMiles = 100 / milesPerGallon * gasPricePerGallon;
        distanceGasInTank = gasInTank * milesPerGallon;

        System.out.println("It will cost " + String.format("%.2f", costOneHundredMiles) + " to drive 100 miles.");
        System.out.println("You can drive " + distanceGasInTank + " miles with " + gasInTank + " gallons of gas in the tank.");
    }
}