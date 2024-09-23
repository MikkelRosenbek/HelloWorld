public class Terningspil {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        terning1.roll();
        terning2.roll();

        while (true) {
            if (terning1.getFaceValue() == 1 && terning2.getFaceValue() == 1) {
                System.out.println(terning1 + " " + terning2);
                System.out.println("Snake Eyes!!");
                System.out.println("Good Game!!");

                break;
            }
            System.out.println(terning1 + " " + terning2);
        }

    }

}
