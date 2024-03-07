package my.home.optinals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
// пример использования Optional.of(T Value)
        String name = "foo";
        Optional<String> stringExample = Optional.of(name);
// пример использования Optional.ofNullable(T Value)
        Integer age = null;
        Optional<Integer> integerExample = Optional.ofNullable(age);
// пример использования Optional.empty()
        Optional<Object> emptyExample = Optional.empty();
    }
}
