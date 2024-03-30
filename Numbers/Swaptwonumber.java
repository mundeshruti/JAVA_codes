package Numbers;

import java.util.Scanner;

public class Swaptwonumber {
    public static void main(String[] args) {
        // int a = 2;
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number:");
        int b = s.nextInt();
        // int b = 3;
        a = a ^ b; // a+b
        b = a ^ b; // a-b
        a = a ^ b; // a-b
        System.out.println("Numbers after swaping");
        System.out.println("first number" + a);
        System.out.println("second number " + b);
    }

}
