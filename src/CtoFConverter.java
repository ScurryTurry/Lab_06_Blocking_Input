import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0.0;
        double tempF = 0.0;
        String continueYN = "";
        String trash ="";
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                tempF = (tempC * 1.8) + 32;
                System.out.printf("%.2f degrees Celsius is the same as %.2f Fahrenheit", tempC, tempF);

                System.out.print("\nContinue [Y/N] ");
                continueYN = in.nextLine();

                if (continueYN.equalsIgnoreCase("N")) {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);
            }
        }while (!done);
        System.out.println("Thanks for using my temperature converter");
    }
}