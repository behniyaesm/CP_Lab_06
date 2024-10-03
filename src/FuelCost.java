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
            System.out.println("Enter gallons of gas your tank can hold: ");
            if (sc.hasNextDouble()) {
                gallonsInTank = sc.nextDouble();
                done = true;
            } else {
                trash = sc.next();
                System.out.println("\nYou said your car can hold " + trash + " gallons of gas");
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        do {

            System.out.println("Enter Miles per gallon for your car: ");
            milesPerGallon = sc.nextDouble();

            System.out.println("Enter the price of gas per gallon: ");
            pricePerGallon = sc.nextDouble();
        } while (pricePerGallon >= 0);

        fuelNeeded = milesDriven / milesPerGallon;
        fuelCost = fuelNeeded * pricePerGallon;

        System.out.println("The cost to drive 100 miles is: " + fuelCost);

        distance = gallonsInTank * milesPerGallon;
        System.out.println("Your car can go " + distance + " miles per gallon");
    }
}
