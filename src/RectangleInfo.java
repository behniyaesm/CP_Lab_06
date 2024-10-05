import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagnol = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.println("Enter width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                trash = in.next(); // use next() instead of nextLine()
                System.out.println("Invalid input, " + trash + " is not a valid number");
                System.out.println("Please try again");
            }
        } while(!done);

        done = false;

        do{
            System.out.println("Enter height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                trash = in.next(); // use next() instead of nextLine()
                System.out.println("Invalid input, " + trash + " is not a valid number");
                System.out.println("Please try again");
            }
        } while(!done);

        area = (width * height);
        perimeter = (2 * (width + height));
        diagnol = Math.sqrt(Math.pow(width,2) + (Math.pow(height, 2)));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagnol);

    }
}
