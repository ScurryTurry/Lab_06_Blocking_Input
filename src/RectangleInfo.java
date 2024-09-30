import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";

        do {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                if(length <= 0.0)
                    System.out.println("You must enter a positive number!");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a number and not " + trash);
            }
        }while (length <=0.0);

        do {
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if(width <= 0.0)
                    System.out.println("You must enter a positive number!");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a number and not " + trash);
            }
        }while (width <=0.0);
        area = length * width;
        perimeter = 2*(length + width);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.printf("The area of the rectangle is %.2f", area);
        System.out.printf("\nThe perimeter of the rectangle is %.2f", perimeter);
        System.out.printf("\nThe diagonal of the rectangle is %.2f", diagonal);

    }
}
