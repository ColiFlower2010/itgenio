import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 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

        /*
        List<Person> people = Arrays.asList(
                new Person("John", 16, Sex.MAN),
                new Person("Peter", 23, Sex.MAN),
                new Person("Hannah", 42, Sex.WOMAN),
                new Person("Bob", 69, Sex.MAN));
        Stream<Person> stream = people.stream();

        // Average
        double averageAge = stream
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("Average age: " + averageAge);

        // Allowed To Work
        long allowedToWorkBoys = people.stream()
                .filter(x -> x.getSex() == Sex.MAN && x.getAge() > 18 && x.getAge() <= 60)
                //.filter(x -> x.getAge() > 18 && x.getAge() <= 60)
                //.filter(x -> x.getAge() <= 60)
                .count();

        long allowedToWorkGirls = people.stream()
                .filter(x -> x.getSex() == Sex.WOMAN && x.getAge() > 18 && x.getAge() <= 60)
                //.filter(x -> x.getAge() > 18 && x.getAge() <= 55)
                //.filter(x -> x.getAge() <= 55)
                .count();

        System.out.println("Of the current people... " + (allowedToWorkBoys + allowedToWorkGirls) + " are allowed to work.");

         */

        System.out.println("Hello, how are you?");

    }

}