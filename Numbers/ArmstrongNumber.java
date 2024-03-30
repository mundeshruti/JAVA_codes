package Numbers;

import java.util.Scanner;

// An Armstrong number (also known as a narcissistic number) is 
// a number that is equal to the sum of its 
// own digits each raised to the power of the number of digits
public class ArmstrongNumber {
    public static void main(String[] args) {
        // int n = 153;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        int i = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            i = i + (r * r * r);
            n = n / 10;
        }
        if (temp == i) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }

}
