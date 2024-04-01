package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // String s = "SHRUTIKA";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.next();
        System.out.println("Reverse string:");
        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        System.out.println(r);
    }

}
