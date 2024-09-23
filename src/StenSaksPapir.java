import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int BEST_OF_NUMBER = 3; //vi laver en konstant for at undgå magic numbers
        int count = 0;

        System.out.print("Velkommen til spillet. Der spilles til bedst af " + BEST_OF_NUMBER);
        System.out.println(" hvis det står uafgjort efter " + (BEST_OF_NUMBER - 1) + " runder.");

        System.out.println("Vælg dit våben!");
        String brugerensVåben = input.next();

        System.out.println("Du har valgt " + brugerensVåben);



        Random rand = new Random();
        int computerensValgSomTal = rand.nextInt(3)+1;

        String robotVåben = "";

        int brugerscore = 0;
        int computerScore = 0;

        while (brugerscore < 2 && computerScore < 2) {
            if (computerensValgSomTal == 1) {
                robotVåben = "sten";
            } else if (computerensValgSomTal == 2) {
                robotVåben = "saks";
            } else if (computerensValgSomTal == 3) {
                robotVåben = "papir";
            }
            //System.out.println("Computeren har valgt " + robotVåben);

            while (brugerensVåben.equalsIgnoreCase(robotVåben)) {
                System.out.println("I har samme våben - Vælg et nyt");
                brugerensVåben = input.next();
                computerensValgSomTal = rand.nextInt(3) + 1;

                if (computerensValgSomTal == 1) {
                    robotVåben = "sten";
                } else if (computerensValgSomTal == 2) {
                    robotVåben = "saks";
                } else if (computerensValgSomTal == 3) {
                    robotVåben = "papir";
                }
                System.out.println("Computeren har valgt " + robotVåben);
            }

            if (brugerensVåben.equalsIgnoreCase("saks") && robotVåben.equalsIgnoreCase("papir")) {
                System.out.println("Brugeren vinder");
                brugerscore++;
            } else if (brugerensVåben.equalsIgnoreCase("papir") && robotVåben.equalsIgnoreCase("sten")) {
                System.out.println("Brugeren vinder");
                brugerscore++;
            } else if (brugerensVåben.equalsIgnoreCase("sten") && robotVåben.equalsIgnoreCase("saks")) {
                System.out.println("Brugeren vinder");
                brugerscore++;
            } else {
                System.out.println("Computeren vinder - Kom igen!");
                brugerscore++;
            }
        }




        }
    }

