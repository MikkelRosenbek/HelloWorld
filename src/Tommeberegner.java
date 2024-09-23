import java.util.Scanner;

public class Tommeberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast mål i tommer");
        double tommer = input.nextDouble();
        final double TOMMER_TIL_CM = 2.54;
        double centimeter = TOMMER_TIL_CM * tommer;
        System.out.println(tommer + " tommer svarer til " + centimeter + " centimeter");
    }
}

