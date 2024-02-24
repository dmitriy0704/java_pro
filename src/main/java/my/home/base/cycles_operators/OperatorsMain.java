package my.home.base.cycles_operators;

import static java.lang.System.*;

public class OperatorsMain {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 1;
        c = a - b;

        switch (c) {
            case 2 -> out.println("2");
            case 3 -> out.println("3");
            case 4 -> out.println("4");
            default -> out.println("1");
        }
    }
}
