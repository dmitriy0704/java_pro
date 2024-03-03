package my.home.oop.in_class;

public class Ship {
    private Engine eng;

    public class Engine {
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    public Ship(Engine eng) {
        this.eng = eng;
    }

    public final void init() {
        eng = new Engine();
        eng.launch();
    }
}