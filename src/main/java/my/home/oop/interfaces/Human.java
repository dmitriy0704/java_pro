package my.home.oop.interfaces;

public class Human implements Swim{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim(){
        System.out.println("Human is swim");
    }
}
