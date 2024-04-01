package String;

public class SwapString {

    public static void main(String[] args) {
        String s1 = "shrutika";
        String s2 = "Munde";
        String temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("After swapping:" + s1 + " " + s2);
    }
}
