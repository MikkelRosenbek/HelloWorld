public class Person {
        String fornavn;
        String efternavn;
        double skostørrelse;

        public Person (String fornavn, String efternavn, double skostørrelse) {
            this.fornavn = fornavn;
            this.efternavn = efternavn;
            this.skostørrelse = skostørrelse;
        }

        public void printPerson() {
            System.out.println(this.fornavn + " " + this.efternavn+ " " + this.skostørrelse);
        }

        @Override
        public String toString() {
            return this.fornavn + " " + this.efternavn+ " bruger skostørrelse " + this.skostørrelse;

        }


}
