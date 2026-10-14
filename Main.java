import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playA;
        String playB;
        String playAgain;

        do {

            do {
                IO.print("Player A, enter R, P, or S: ");
                playA = in.nextLine();

                if (!playA.equalsIgnoreCase("R") && !playA.equalsIgnoreCase("P") && !playA.equalsIgnoreCase("S")) {

                    IO.println("Invalid move. Please enter R, P, or S.");
                }

            } while (!playA.equalsIgnoreCase("R") && !playA.equalsIgnoreCase("P") && !playA.equalsIgnoreCase("S"));


            do {
                IO.print("Player B, enter R, P, or S: ");
                playB = in.nextLine();

                if (!playB.equalsIgnoreCase("R") && !playB.equalsIgnoreCase("P") && !playB.equalsIgnoreCase("S")) {
                    IO.println("Invalid move. Please enter R, P, or S.");
                }

            } while (!playB.equalsIgnoreCase("R") && !playB.equalsIgnoreCase("P") && !playB.equalsIgnoreCase("S"));

            if (playA.equalsIgnoreCase(playB)) {
                if (playA.equalsIgnoreCase("R")) {
                    IO.println("Rock vs. Rock. It's a tie!");
                } else if (playA.equalsIgnoreCase("P")) {
                    IO.println("Paper vs Paper. It's a tie!");
                } else {
                    IO.println("Scissors vs Scissors. It's a tie!");
                }

            }
            else if (playA.equalsIgnoreCase("R") && playB.equalsIgnoreCase("S")) {

                IO.println("Rock breaks Scissors! Player A wins!");

            }
            else if (playA.equalsIgnoreCase("P") && playB.equalsIgnoreCase("R")) {
                IO.println("Paper covers Rock! Player A Wins!");

            }
            else if (playA.equalsIgnoreCase("S") && playB.equalsIgnoreCase("P")) {
                IO.println("Scissors covers Paper! Player A wins!");

            }
            else if (playB.equalsIgnoreCase("R") && playA.equalsIgnoreCase("S")) {
                IO.println("Rock breaks Scissors! Player B wins!");

            }
            else if (playB.equalsIgnoreCase("P") && playA.equalsIgnoreCase("R")) {
                IO.println("Paper covers Rock! Player B Wins!");

            }
            else {
                IO.println("Scissors covers Paper! Player B wins!");

            }

            //play again
            IO.print("Play again? [Y/N]?");
            playAgain = in.nextLine();


        } while (playAgain.equalsIgnoreCase("Y"));

        in.close();

    }

}