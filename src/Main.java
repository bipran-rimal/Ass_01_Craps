import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        while(playAgain){
            int roll1 = rand.nextInt(6)+1;
            int roll2 = rand.nextInt(6)+1;
            int sum = roll1 + roll2;

            System.out.println("You rolled a "+ roll1 + " and a "+ roll2);

            if (sum == 2 || sum == 3 || sum == 12){
                System.out.println("Craps! You lost.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("You won!");
            }
            else {
                int point = sum;
                System.out.println("The point is now "+ point);
                boolean tryingForPoint = true;
                while(tryingForPoint){
                    roll1 = rand.nextInt(6)+ 1;
                    roll2 = rand.nextInt(6)+ 1;
                    sum = roll1+ roll2;

                    System.out.println("You rolled a "+ roll1+ " and a " + roll2 + ". Total: "+ sum);

                    if (sum == 7 | sum == 11){
                        System.out.println("You won");
                        tryingForPoint = false;
                    } else if (sum == point) {
                        System.out.println("Made point and won");
                        tryingForPoint = false;
                    } else{
                        System.out.println("Trying for point");
                    }
                }
            }
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = in.next().equalsIgnoreCase("yes");
        }
        in.close();
        System.out.println("Thanks for playing.");
    }
}