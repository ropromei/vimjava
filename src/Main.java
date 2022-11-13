import helpers.Person;

public class Main {
    public static void main(String args[]) {
        Person person = new Person("Reio", "Opromei");
        Person personToGreet = null;

        if (args.length > 1) {
            personToGreet = new Person(args[0], args[1]);
            System.out.println("Tere, " + personToGreet.getName() + "!");
        } else if (args.length == 1) {
            personToGreet = new Person(args[0]);
            System.out.println("Tere, " + personToGreet.getName() + "!");
        } else {
            System.out.println("Tere!");
        }

        System.out.println("");
        System.out.println("Tervitades");
        System.out.println(person.getName());
    }
}
