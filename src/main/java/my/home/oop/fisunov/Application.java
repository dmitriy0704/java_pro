package my.home.oop.fisunov;

public class Application {
    public static void main(String[] args) {
        Hero hero = new Hero("Bob", 10, 1);
        hero.info();

        Monster monster = new Monster("Goblin", 6, 2);
        monster.info(); 

    }
}
