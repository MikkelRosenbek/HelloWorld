import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {

        System.out.println("Enter the number of items you would like to scan:");
        Scanner input = new Scanner(System.in);

        int quantity = input.nextInt();

        double total = 0;


        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item:");
        double price = input.nextDouble();

        total = total + price;
        }

        input.close();
        System.out.println("Your total is $" + total);





    }
}
