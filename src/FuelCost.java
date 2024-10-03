import java.util.Scanner;
public class FuelCost
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0; //fuel efficiency
        double pricePerGallon = 0;
        double fuelNeeded = 0;
        double milesDriven = 100;
        double fuelCost = 0;
        double distance = 0;
        String trash = "";

        boolean done = false;

        do {
            System.out.println("Enter how many gallons of gas your tank can hold: ");
            if (sc.hasNextDouble()) {
                gallonsInTank = sc.nextDouble();
                done = true;
            } else {
                trash = sc.next();
                System.out.println("\nYou said your car can hold " + trash + " gallons of gas.");
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        done = false; //reset boolean for next input
        do {
            System.out.println("Enter your cars fuel efficiency in mpg: ");
            if (sc.hasNextDouble()) {
                milesPerGallon = sc.nextDouble();
                done = true;
            } else {
                trash = sc.next();
                System.out.println("\nYou said your cars fuel efficiency was " + trash + " mpg.");
                System.out.println("You have to enter a valid mpg!");
            }
        } while (!done);

        done = false; //reset boolean for next input
        do {
            System.out.println("Enter the price of the gas per gallon: ");
            if (sc.hasNextDouble()) {
                pricePerGallon = sc.nextDouble();
                done = true;
            } else {
                trash = sc.next();
                System.out.println("\nYou said the price of gas was " + trash);
                System.out.println("You have to enter a valid price!");
            }
        } while (!done);

        fuelNeeded = milesDriven / milesPerGallon;
        fuelCost = fuelNeeded * pricePerGallon;

        System.out.println("The cost to drive 100 miles is $" + fuelCost);

        distance = gallonsInTank * milesPerGallon;
        System.out.println("Your car can go " + distance + " miles with a full tank of gas.");

    }
}
