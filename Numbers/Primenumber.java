package Numbers;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = s.nextInt();
        // int n = 0;
        int i = 0;
        int m = 0;
        int flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(" not  a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("not a prime number");
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) {
                System.out.println("prime number");
            }
        }
    }

}