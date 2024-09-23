public class Tid {
    public static void main(String[] args) {
        int time = 9;
        int minut = 54;
        int sekund = 15;

        String space = " ";
        String sekunder = "Sekunder:";
        String minutter = "Minutter:";
        String timer = "Timer:";
        String kolon = ":";
        int sekunderMidnat = 36240;
        int sekunderDag = 86400;
        int sekunderTilbage = sekunderDag-36240;
        int timeSlut = 10;
        int minutSlut = 17;
        int sekundSlut = 0;
        int tidBrugtSlut = timeSlut*3600 + minutSlut*60 + sekundSlut;
        int samletTidBrugt = tidBrugtSlut-sekunderMidnat;


        System.out.println(timer+time + space + minutter+minut +space+ sekunder+sekund);
        System.out.println("Siden midnat er der gået" + space + sekunderMidnat + space + sekunder);
        System.out.println("Der er" + space + sekunderTilbage + space + "sekunder tilbage før midnat");
        System.out.println("Jeg var færdig klokken" + space + timeSlut+kolon+minutSlut+kolon+sekundSlut);
        System.out.println("Jeg har brugt" + space + samletTidBrugt + space + "sekunder på denne opgave :-p");

        int minutes = samletTidBrugt;

        System.out.println("Brøkdel af timen, der er gået: ");
        System.out.println(minutes/60);

        System.out.println("Procentdel af timen, der er gået: ");
        System.out.println(minutes *100/60);

    }
}
