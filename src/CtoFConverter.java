import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;

        System.out.println("Enter the temperature in Celsius: ");
        tempC = sc.nextDouble();

        tempF = tempC * 1.8 + 32;
        System.out.println("The temperature in Fahrenheit is " + tempF);

    }
}