package Numbers;

import java.util.Scanner;

public class Leapyearcheck {
    public static void main(String[] args) {
        // int year = 2023;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println("Not  a leap year");
        }
    }

}
