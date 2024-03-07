package my.home.stream.fisunov;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {

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

//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
//        System.out.println(list);
        // filter():
//        List<Integer> out = list.stream()
//                .filter((n) -> n % 2 == 0)
//                .toList();
//        System.out.println(out);

        // map():
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
////        list.stream().map(n -> n * 5).forEach(System.out::println);
//
//        list.stream().map(z -> {
//            StringBuilder builder = new StringBuilder();
//            for (int i = 0; i < z; i++) {
//                builder.append("A");
//            }
//            return builder.toString();
//        }).forEach(System.out::println);

//        List<Integer> list = new ArrayList<>(Arrays.asList(5, 12, 3, 4, 2, 7, 11, 8, 9));
//        System.out.println(list.stream().filter(n -> n < 6).count());
//        list.stream().sorted().limit(3).forEach(System.out::println);
//        System.out.println(list.stream().allMatch(n -> n > 0));
//        Optional<Integer> opt = list.stream().filter(n -> n < 3).findFirst();
//        opt.ifPresent(System.out::println);
//        System.out.println(opt.get());


        ////////////
//        List<Person> persons = new ArrayList<>(
//                Arrays.asList(
//                        new Person("Bob1", "Engineer", 45),
//                        new Person("Bob2", "Engineer", 37),
//                        new Person("Bob3", "Manager", 31),
//                        new Person("Bob4", "Manager", 34),
//                        new Person("Bob5", "Engineer", 44),
//                        new Person("Bob6", "CEO", 50)
//                )
//        );
//
//        List<Person> engineers = new ArrayList<>();
//        for (Person p : persons) {
//            if (p.position.equals("Engineer")) {
//                engineers.add(p);
//            }
//        }
//        Collections.sort(engineers, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o2.age - o1.age;
//            }
//        });
//        List<String> engineersName = new ArrayList<>();
//        for (Person p : engineers) {
//            engineersName.add(p.name);
//        }
//        System.out.println(engineersName);
//
//        List<String> engNames = persons
//                .stream()
//                .filter(p -> p.position.equals("Engineer"))
//                .sorted((o1, o2) -> o1.age - o2.age)
//                .map(p -> p.name)
//                .toList();
//
//        System.out.println(engNames);

    }
}
