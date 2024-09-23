public class integerDivisionTypeCast {
    public static void main(String[] args) {

    int hourStart = 16;
    int minuteStart = 16;
    int secondStart = 30;

        System.out.println("Seconds: " + secondStart);
        System.out.println("Minutes: " + minuteStart);
        System.out.println("Hours: " + hourStart);

    int secondsInADay = 24*60*60;
    int startMidnight = (16*60*60)+(16*60)+30;
    int secondsLeft = secondsInADay-startMidnight;

        System.out.println("Der er "+ secondsInADay + " sekunder på en dag");
        System.out.println("Siden midnat er der gået " + startMidnight + " sekunder" );
        System.out.println("Der er " + secondsLeft + " sekunder tilbage før næste midnat");

    int hourEnd = 16;
    int minuteEnd = 40;
    int secondEnd = 30;
    int endMidnight = (16*60*60)+(40*60)+30;
    int secondsUsed = endMidnight-startMidnight;
    int minutesUsed = secondsUsed/60;
    int hoursUsed = minutesUsed/60;

        System.out.println(secondsUsed);
        System.out.println("Jeg har brugt " + secondsUsed + " sekunder på at løse opgaven");
        System.out.println(minutesUsed);
        System.out.println("Jeg har brugt " + minutesUsed + " minutter på at løse opgaven");
        System.out.println(hoursUsed);
        System.out.println("Jeg har brugt " + hoursUsed + " timer på at løse opgaven");



        System.out.print("Procentdel af en time, som jeg har brugt på at løse opgaven: ");
        System.out.println(minutesUsed * 100 / 60);

        double minutesUsedDouble = 24.0;
        System.out.print("Brøkdel af timen, der er gået: ");
        System.out.println(minutesUsedDouble / 60);
        System.out.print("Brøkdel af timen, der er gået: ");
        System.out.println((double)minutesUsed/60 );

    final int minutter_Per_Time = 60;
        System.out.println(minutter_Per_Time);
    }
    }