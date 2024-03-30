package Numbers;

public class ParidromeNumber {
    public static void main(String[] args) {
        int n = 1214;
        int r = 0;
        int temp = n;
        while (n > 0) {
            int rev = n % 10;
            r = (r * 10) + rev;
            n = n / 10;
        }
        System.out.println("reverse number:" + r);
        if (temp == r) {
            System.out.println("palidrome number");
        } else {
            System.out.println("not palidrome number");
        }
    }

}
