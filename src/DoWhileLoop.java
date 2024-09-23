import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean okay = false;
        /*
        do {
            System.out.println("Enter a number as an integer: ");
            if (scanner.hasNextInt()) {
                okay = true;
            } else {
                okay = false;
                //nedenstående linje får scanneren til at "spise" det forkerte input, og er nødvendig for at komme videre
                scanner.next();
                System.out.println("You did not enter an integer.");
            }
        } while (!okay);
        int number = scanner.nextInt();
        System.out.println("Thank you!");
        */
        /*OPGAVE 2 Udkommenter al koden der faktisk gør noget, dvs fra ovenover linjen hvor Scanneren bliver lavet,
         til nedenunder linjen der udskriver Thank you!. Udkommenter hele blokken på én gang, ikke linje for linje.
         Nu skal du selv skrive kode hvor du forsøger at lave do-while-loopet om til et while-loop. Der skal ikke gøres ret meget!
         Du må gerne starte med at kopiere al den kode du har udkommenteret, og så ændre i den.
         HINT: husk at boolean variablen okay skal være initialiseret inden den kan bruges, dvs assignet en værdi.*/

        //Skriv din kode herunder: ----------------------------------------------------------------------------------------------

        //do {
        System.out.println("Enter a number as an integer: ");
        if (scanner.hasNextInt())
            {
                okay = true;
                //Hvis input er en Int er den true, hvis ikke er den false
            } /*else {
                okay = false;
                //nedenstående linje får scanneren til at "spise" det forkerte input, og er nødvendig for at komme videre
                scanner.next();
                System.out.println("You did not enter an integer.");
            }*/
        //}
        while (!okay)
            {
                if (scanner.hasNextInt())
                    {
                        okay = true;
                    }
                else
                    {
                        okay = false;
                        //nedenstående linje får scanneren til at "spise" det forkerte input, og er nødvendig for at komme videre
                        scanner.next();
                        System.out.println("You did not enter an integer.");

                        System.out.println("Enter a number as an integer: ");
                    }
            }
        System.out.println("Thank you!");

        //------------------------------------------------------------------------------------------------------------------------
    }
}