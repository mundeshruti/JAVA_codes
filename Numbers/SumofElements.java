package Numbers;

import java.util.Scanner;

public class SumofElements {
    public static void main(String[] args) {
        // int n = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the number:");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = digit + sum;
            n = n / 10;
        }
        System.out.println("Sum of elements : " + sum);
    }

}
