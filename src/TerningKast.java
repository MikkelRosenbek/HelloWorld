import java.util.Random;

public class TerningKast {
    public static void main(String[] args) {

        Random rand = new Random();
        int roll1 = rand.nextInt(6)+1;
        int roll2 = rand.nextInt(6)+1;
        int rollSum = roll1+roll2;
        int sum = 0;
        int wantedSum = 7;


        /*System.out.println(roll1+roll2);
        System.out.println(roll1 + " + " + roll2 + " = " +  (roll1 + roll2));
        System.out.println(roll1 + " + " + roll2 + " = " + rollSum); */

        while (rollSum!=wantedSum) {
            roll1 = rand.nextInt(6)+1;
            roll2 = rand.nextInt(6)+1;
           rollSum = roll1+roll2;

            System.out.println(roll1 + " + " + roll2 + " = " + rollSum);
        }



    }
}
