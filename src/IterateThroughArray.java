public class IterateThroughArray {
    public static void main(String[] args) {
        


        //Skriv et for-loop der itererer gennem et array, opløfter hvert tal i anden potens og skriver det ud til konsollen.
        double[] arr = {4.5, 25.3, 12.1, 34.0, 15.5};
        System.out.println("Værdier opløftet i anden potens/power: ");
        for (int i = 0; i < arr.length; i++) {
            double kvadratrod = Math.pow(arr[i], 2);
            System.out.println("Værdi på index: " + i + " = " + kvadratrod);
        }

/*
        double minVærdi = arr[0];
        double maxVærdi = arr[4];

        for (int i = 0; i < arr.length; i++) {
            if (arr < minVærdi) {
                minVærdi = arr[i];
            }
            if (arr > maxVærdi) {
                maxVærdi = arr[i];
            }
        }

        System.out.println("Mindste værdi er: " + minVærdi);
        System.out.println("Største værdi er: " + maxVærdi);
 */

        double minVærdi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVærdi) {
                minVærdi = arr[i];
            }
        }
        System.out.println("Den mindste værdi i arrayet er: " + minVærdi);

        double maxVærdi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVærdi) {
                maxVærdi = arr[i];
            }
        }
        System.out.println("Den største værdi i arrayet er: " + maxVærdi);

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 12.1) {
                System.out.println("Hurra! Jeg fandt 12.1. Det stod på index " + i);
                found = true;
                break; // Stoppe loopet, når værdien er fundet
            }
        }
        if (!found) {
            System.out.println("Værdien 12.1 blev ikke fundet i arrayet.");
        }
    }
}