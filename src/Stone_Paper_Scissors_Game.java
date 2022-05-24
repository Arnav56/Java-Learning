import java.util.Scanner;
import java.util.Random;

public class Stone_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNo = new Random();
        int userOption = 0;

        // Options of the game:
        System.out.println("\t\tMethod to play Stone Papers Scissors: \n"
                + "Choose as per the following:\n"
                + "\t\t\tStone - 1\n"
                + "\t\t\tPaper - 2\n"
                + "\t\t\tScissors - 3\n");

        while (true) {
            int cNo = randomNo.nextInt(1, 4);
            String computerChoice = chosenOption(cNo);
            String userChoice = "";
            System.out.println("The Computer has chosen its option. Now its your turn.");

            System.out.print("Enter your choice: ");
            userOption = input.nextInt();

            if (userOption != 1 && userOption != 2 && userOption != 3) {
                System.out.println("You have entered WRONG option!. Try again.\n");
                continue;
            } else {
                userChoice = chosenOption(userOption);
            }

            // game algo:
            /*
             * winning algo:
             * s & p: p
             * s & sc: s
             * sc & p: sc
             */

            if (userChoice.equals(computerChoice)) {
                System.out.printf("\nYou chose %s & Computer chose %s. Hence, the Match is tie!", userChoice,
                        computerChoice);
            } else if ((userChoice.equals("stone") && computerChoice.equals("paper"))
                    || (userChoice.equals("paper") && computerChoice.equals("scissors"))
                    || (userChoice.equals("scissors") && computerChoice.equals("stone"))) {
                System.out.printf("\nYou chose %s & Computer chose %s. Hence Computer won! Better Luck next time.",
                        userChoice, computerChoice);
            } else {
                System.out.printf("\nYou chose %s & Computer chose %s. YAY you won! Congratulations!",
                        userChoice, computerChoice);
            }

            System.out.print("\nIf you want to continue playing this game, then enter 'y': ");
            char continueGame = input.next().toLowerCase().charAt(0);
            if (continueGame == 'y') {
                continue;
            } else {
                break;
            }
        }

        input.close();
    }

    static String chosenOption(int op) {
        String chosenOption = "";
        switch (op) {
            case 1:
                chosenOption = "stone";
                break;
            case 2:
                chosenOption = "paper";
                break;
            case 3:
                chosenOption = "scissors";
                break;
        }

        return chosenOption;
    }
}
