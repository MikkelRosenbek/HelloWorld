import java.util.Scanner;

public class portoBeregner {
    public static void main(String[] args) {

        System.out.println("Venligst indtast brevets vægt i antal hele gram - OBS maksimalt 2000g");
        Scanner input = new Scanner(System.in);
        int letterWeight = input.nextInt();
        int price = 0;


        if (letterWeight <= 0 || letterWeight> 2000) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        }
        else{
            if (letterWeight <= 100) {
            price = 25;
        } else if
        (letterWeight <= 250) {
            price = 50;
        } else if
        (letterWeight < 2000) {
            price = 75;
        }
        System.out.println("Det koster " + price + " kroner at sende dit brev");
        }
    }
}
