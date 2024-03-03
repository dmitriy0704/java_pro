package my.home.oop.interfaces;

public interface AccountBaseAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    default void unBlocking(){}
}
