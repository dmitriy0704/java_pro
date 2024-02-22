package my.home.stream;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    private static class Person {
        private String name;
        private String position;
        private int age;

        public Person(String name, String position, int age) {
            this.name = name;
            this.position = position;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person("Bob1", "Engineer", 45),
                        new Person("Bob2", "Engineer", 37),
                        new Person("Bob3", "Manager", 31),
                        new Person("Bob4", "Manager", 34),
                        new Person("Bob5", "Engineer", 44),
                        new Person("Bob6", "CEO", 50)
                )
        );

        List<Person> engineers = new ArrayList<>();
        for (Person p : persons) {
            if (p.position.equals("Engineer")) {
                engineers.add(p);
            }
        }
    }
}
