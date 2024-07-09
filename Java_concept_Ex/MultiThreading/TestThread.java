package Java_concept_Ex.MultiThreading;

public class TestThread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start(); // starts a new thread and calls the run method
    }
}