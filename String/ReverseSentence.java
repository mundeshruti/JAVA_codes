package String;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        // String s = "My Name is shrutika";
        String[] r = s.split(" ");
        String rev = "";

        for (int i = r.length - 1; i >= 0; i--) {
            rev += r[i] + " ";
        }

        System.out.println("Reversed sentence: " + rev);
    }
}
