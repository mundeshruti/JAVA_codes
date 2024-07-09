package Java_concept_Ex.MultiThreading;

public class TestRunnable {
    public static void main(String[] args) {
        Myrunnable r = new Myrunnable();
        Thread t1 = new Thread(r);
        t1.start();

    }
}
