public class ForLoops {
    public static void main(String[] args) {

        System.out.println("OPGAVE 1");
        for(int i = 1; i<=4; i++) { //den her linje er for-loopets signatur
            int sum = 2 * i;
            System.out.println(" 2 gange " + i + " = " + sum);
        }

        System.out.println();
        System.out.println("OPGAVE 2");

        for(int i = 2; i<=12; i+=2) {
            //int sum2 = i;
            System.out.print(i /*sum2 i stedet for i*/ + " " );
        }


        System.out.println();

        for(int i = 4; i<=80; i+=15) {
            //int sum3 = i;
            System.out.print(i /*sum3 i stedet for i*/ + " " );
        }

        System.out.println();

        for(int i = 30; i>=-20; i-=10) {
            //int sum4 = i;
            System.out.print(i /*sum4 i stedet for i*/ + " " );
        }

        System.out.println();

        for(int i = -7; i<=14; i+=4) {
            //int sum5 = i;
            System.out.print(i /*sum5 i stedet for i*/ + " " );
        }

        System.out.println();

        for(int i = 97; i>=82; i-=3) {
            //int sum6 = i;
            System.out.print(i /*sum6 i stedet for i*/ + " " );
        }

    }
}
