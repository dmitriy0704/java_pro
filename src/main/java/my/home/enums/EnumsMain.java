package my.home.enums;

import java.util.Arrays;

public class EnumsMain {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.ROCK;
        System.out.println(ms);

        switch (ms) {
            case JAZZ -> System.out.println("JAZZ");
            case CLASSIC -> System.out.println("CLASSIC");
            case ROCK -> System.out.println("ROCK");
            case BLUES -> System.out.println("BLUES");
            default -> System.out.println("Unknown");
        }
        System.out.println(Arrays.toString(MusicStyle.values()));
        System.out.println(MusicStyle.BLUES.ordinal());
    }
}
