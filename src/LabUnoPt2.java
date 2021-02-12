import java.util.Random;
import java.util.Scanner;

    public class LabUnoPt2 {
        public static void main(String[] args) {

            int guess, answer, attempts;
            final int maxAttempts = 5;
            String play = "x";

            Scanner num = new Scanner(System.in);
            Random shuffle = new Random();
            answer = shuffle.nextInt(100) + 1;

            while (play.equals("x")) {
                System.out.println("Please guess an integer (number) that is greater than or equal to 0 but less than 100");

                guess = num.nextInt();
                attempts = 0;

                while (guess != 0) {

                    attempts++;

                    if (guess == answer) {
                        System.out.println("You won!");
                        break;

                    } else if (guess < answer) {
                        System.out.println("The number is higher");
                    } else if (guess > answer) {
                        System.out.println("The number is lower");
                    }
                    if (attempts == maxAttempts) {
                        System.out.println("You lose");
                        break;
                    }
                    System.out.println("Guess again: ");

                    guess = num.nextInt();
                }

                System.out.println("Another attempt at the game? (x to retry)");
                play = num.next();
            }
        }
    }