package OOPs.Override;

public class Test {
    public static void main(String[] args) {
        // Vehicle v = new Alto();
        // Alto v = new Vehicle(); // type mismatch error
        Vehicle v = new Vehicle();
        Alto a = new Alto();
        a.start();
        v.start();

    }

}
