import java.util.Scanner;

public class TidsBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Skriv ind i systemet hvor mange timer, minutter og sekunder der er gået
        System.out.println("Hvor mange hele timer er der gået?");
        int timer = input.nextInt();
        System.out.println("Hvor mange minutter er der gået?");
        int minutter = input.nextInt();
        System.out.println("Hvor mange sekunder er der gået?");
        int sekunder = input.nextInt();


        System.out.println("Der er gået " + timer +" timer, " +minutter+" minutter og " +sekunder+ " sekunder siden midnat");

        //Skriv koden om så programmet spørger om timer, minutter og sekunder, men kun skriver ud hvor mange sekunder der er gået siden midnat.
        final int TIMER_TIL_SEKUNDER = timer*3600;
        final int MINUTTER_TIL_SEKUNDER = minutter*60;
        final int SAMLET_SEKUNDER = TIMER_TIL_SEKUNDER+MINUTTER_TIL_SEKUNDER+sekunder;
        System.out.println("Der er gået " + SAMLET_SEKUNDER +" sekunder siden midnat");


    }
    }

