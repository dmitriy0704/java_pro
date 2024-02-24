package my.home.base.cycles_operators;

public class CyclesMain {
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //do while
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
