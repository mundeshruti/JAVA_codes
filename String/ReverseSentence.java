package String;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        // String s = "My Name is shrutika";
        String r = " ";
        String[] rev = s.split(" ");

        for (int i = 0; i < s.length(); i++) {
            r = rev[i] + r;
        }

        System.out.println("Reversed sentence: " + r);
    }
}
