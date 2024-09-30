import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int value = generator.nextInt(10)+1;
        int guess = 0;
        String trash = "";
        boolean done = false;


        do {
            System.out.print("Guess a number [1-10]: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    if (guess == value) {
                        System.out.println("You guessed correct!");
                        done = true;
                    } else if (guess > value) {
                        System.out.println("Close! You are too high!");
                    } else {
                        System.out.println("Close! You are low!");
                    }
                }
                else {
                    System.out.println("Guess out of bounds! Choose a number between [1-10]");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a number between [1-10] and not " + trash);
            }
        }while(!done);

    }
}
