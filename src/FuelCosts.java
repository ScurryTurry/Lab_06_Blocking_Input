import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallonTank = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double costPerTrip = 0.0;
        double fullTank = 0;
        String trash = "";

        do
        {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallonTank = in.nextDouble();
                in.nextLine();
                if (gallonTank <= 0)
                    System.out.println("You must enter a positive number and greater than zero.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash + "\n");
            }
        } while (gallonTank <= 0);

        do
        {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                if (milesPerGallon <= 0)
                    System.out.println("You must enter a positive number and greater than zero.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash + "\n");
            }
        } while (milesPerGallon <= 0);

        do
        {
            System.out.print("Enter the Gas Price Per Gallon: ");
            if(in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon <= 0)
                    System.out.println("You must enter a positive number and greater than zero!");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash + "\n");
            }
        } while (pricePerGallon <= 0);

        costPerTrip = (100 / milesPerGallon) * pricePerGallon;
        fullTank = milesPerGallon * gallonTank;
        System.out.printf("If you want to drive 100 miles it will cost: $%.2f\n", costPerTrip);
        System.out.printf("You can go %.2f miles with a full tank \n", fullTank);

    }
}
