import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter the temperature in Celsius: ");
            if (sc.hasNextDouble()) {
                tempC = sc.nextDouble();
                done = true;
            } else {
                trash = sc.nextLine();
                System.out.println(trash + " is not a valid temperature");
                System.out.println("\nPlease enter a valid temperature");
            }
        } while (!done);

        tempF = tempC * 1.8 + 32;
        System.out.println("The temperature in Fahrenheit is " + tempF);

    }
}