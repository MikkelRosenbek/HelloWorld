public class ArrayOpgaver {
    public static void main(String[] args) {

        int[] arr = new int[8];
        arr[0] = 34;
        arr[7] = 117;



        for (int i =0; i < arr.length; i++ ) {
            System.out.println("Værdi på index " + i + " : " + arr[i]);
        }

        System.out.println();

        String[] stringArr = {"Hej", "med", "dig!"};
        for (String str : stringArr) {
            System.out.print(str + " ");
        }



        double[] doubleArr = {3.4, 2.5, 1.2, 6.7};
        System.out.println();
        System.out.println("Værdien på index 2 er: " + doubleArr[2]);
        System.out.println("Længden på arrayet er: " + doubleArr.length);




    }
}
