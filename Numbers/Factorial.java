package Numbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // int n = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + n + " is :" + fact);
    }
}
