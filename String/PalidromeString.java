package String;

import java.util.Scanner;

public class PalidromeString {
    public static void main(String[] args) {
        // String s = "ANA";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();

        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        if (r.equals(s)) {
            System.out.println("String is Palidrome");
        } else {
            System.out.println("not palidrome");
        }
    }
}
