import java.util.Scanner;
import java.util.Random;

public class Task08_DieRoller {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean done = false;
        String redo = "";

        do {

            int die1 = 0;
            int die2 = 0;
            int die3 = 0;
            int sum = 0;
            int numRolls = 0;

            boolean triple = false;
            redo = "N";

            System.out.println("Roll Dice1 Dice2 Dice3 Sum");

            while (!triple) {
                die1 = rand.nextInt(1, 7);
                die2 = rand.nextInt(1, 7);
                die3 = rand.nextInt(1, 7);

                numRolls = numRolls + 1;

                if (die1 == die2 && die2 == die3) {
                    triple = true;

                }
                sum = die1 + die2 + die3;
                System.out.println(numRolls + "     " + die1 + "     " + die2 + "     " + die3 + "     " + sum);

            }
            System.out.print("Would you like to continue? (Y/N): ");
            redo = in.nextLine();
            if (redo.equals("N") || redo.equals("n")) {
                done = true;
            }
        } while (!done);
    }
}
