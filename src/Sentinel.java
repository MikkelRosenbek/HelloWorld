import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        final int SENTINEL = -1;
        //String Stop = SENTINEL;
        double sum = 0;
        double tal = 0;
        //double sjov = 21;


        //System.out.println("Indtast venligst dit første tal");
        //double input = scanner.nextDouble();

        while (tal != SENTINEL) {
            sum += tal;
            System.out.println("Indast venligst dit tal - Tast -1 for at stoppe");
            tal = input.nextDouble();



           // if (tal)

        }
        System.out.println("Din sum er " + sum);










    }
}
