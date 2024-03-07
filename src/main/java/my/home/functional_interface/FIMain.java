package my.home.functional_interface;

import java.util.function.Function;

public class FIMain {
    public static void main(String[] args) {

    }

    // замыкание:
    public static Function<String, Integer> build(String strNum) {
        int count = 1;
        return t -> {
            int res = Integer.valueOf(strNum + t) + count;
            return res;
        };
    }

}
