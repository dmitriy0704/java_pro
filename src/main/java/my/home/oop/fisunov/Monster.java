package my.home.oop.fisunov;

public class Monster {
    String name;
    int hp;
    int attack;


    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void info() {
        System.out.println("Name: " + name + "; hp: " + hp + "; attack: " + attack);
    }
}
