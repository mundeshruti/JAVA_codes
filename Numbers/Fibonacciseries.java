package Numbers;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = s.nextInt();
        System.out.println("fibonacci series : ");
        for (int i = 1; i <= n; i++) { // n= number of elements in the fibonacci series to be printed

            System.out.println(fib(i));
        }
    }

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }
}