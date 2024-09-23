public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Fornavn1", "Efternavn1", 42.5);

        Person person2 = new Person("Fornavn2", "Efternavn2", 39);

        person1.printPerson();
        person2.printPerson();

        System.out.println(person1.toString());

    }
}
