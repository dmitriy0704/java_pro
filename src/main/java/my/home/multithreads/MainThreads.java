package my.home.multithreads;

public class MainThreads {
    public static void main(String[] args) {
        WalkThread walkThread = new WalkThread();
        walkThread.start();
    }
}
