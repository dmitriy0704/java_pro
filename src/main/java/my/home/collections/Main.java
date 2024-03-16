package my.home.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Queue<Person> personQueue = new LinkedList<>(
                Arrays.asList(
                        new Person(1, "Lada"),
                        new Person(2, "BMW"),
                        new Person(3, "Lexus")
                )
        );

        personQueue.offer(new Person(4, "Audi"));
        personQueue.stream()
                .forEach(p -> System.out.println(p.getName()));
        System.out.println(personQueue.element().getName());

    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}