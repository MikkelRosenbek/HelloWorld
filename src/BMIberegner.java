import java.util.Scanner;

public class BMIberegner {
    public static void main(String[] args) {
        Scanner iVægt = new Scanner(System.in);
        Scanner iHøjde = new Scanner(System.in);
        System.out.println("For at beregne dit bmi, skal du opgive følgende informationer:");
        System.out.println("Vægt i kg:");
        double vægt = iVægt.nextDouble();
        System.out.println("Højde i meter");
        double højde = iHøjde.nextDouble();
        double bmi = vægt / (højde*højde);

        /* Her er en formel fundet på google, hvor man runder ned til 2 decimaler i BMI'en
        DecimalFormat bmiFormat = new DecimalFormat("#.##");

        System.out.println("Din bmi er på " + bmiFormat.format((bmi)));
        */

    if (bmi < 18.5)
        System.out.println("Din bmi svarer til, at du er undervægtig");
    else if (bmi < 25) {
            System.out.println("Din bmi svarer til, at du har en normalvægt");
    }
    else if (bmi <30) {
        System.out.println("Din bmi svarer til, at du er overvægtig");
    }
    else {
        System.out.println("Din bmi svarer til, at du er svært overvægtig");
    }




    }
}
