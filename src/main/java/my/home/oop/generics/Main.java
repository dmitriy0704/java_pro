package my.home.oop.generics;

public class Main {
    public static void main(String[] args) {
        Message<Integer> ob1 = new Message<Integer>();
        ob1.setValue(1);
        int v1 = ob1.getValue();
        System.out.println(v1);
    }
}
