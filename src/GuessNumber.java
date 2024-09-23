import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int numberToGuess = rand.nextInt(10)+1;
    int usersGuess = -1;
    int antalGæt = 0;
        System.out.println("Gæt et tal mellem 1 og 10");

while (usersGuess != numberToGuess) {
        usersGuess = input.nextInt();
        if (usersGuess > numberToGuess) {
            System.out.println("Dit gæt er for højt");
        } else if (usersGuess < numberToGuess) {
            System.out.println("Dit gæt er for lavt");
        }
    antalGæt++;
    System.out.println("Du har brugt " + antalGæt + " forsøg på at gætte tallet");
    }
        System.out.println("Tillykke, du gættede rigtigt");
}
}
/*public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = 3;
        int usersGuess = -1;

        System.out.println("Gæt  et tal mellem 1 og 10");

        while (numberToGuess!=usersGuess) {

            usersGuess = input.nextInt();

            if (usersGuess==numberToGuess) {
                System.out.println("Dit svar er korrekt - Godt gået!");
            }
            else {
                System.out.println("Dit svar er forkert - Prøv igen!");
            }

        }


    }
}*/
/*
public class GuessNumber {
psvm
Scanner input = new Scanner(System.in);
Random rand = new Random();
int numberToGuess = rand.nextInt(10)+1;
int usersGuess = -1;
int antalGæt = 0;
sout "Gæt et tal mellem 1 og 10");

while (usersGuess != numberToGuess) {
usersGuess = input.nextInt();
if (usersGuess > numberToGuess) {
sout"Dit gæt er for højt");
} else if (usersGuess < numberToGuess) {
sout "Dit gæt er for lavt");
}
antalGæt++ eller antalGæt = antalGæt + 1
}
sout "Tillykke, du gættede rigtigt"



 */