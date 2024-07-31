package String;

import java.util.Scanner;

public class ReverseSentence {
     public static void main(String[] args) {
        String s = "My Name is Shrutika";
        String s = "My Name is Shrutika";
        String r = "";
        String rev[] = s.split(" ");
        for (int i = 0; i < rev.length; i++) {
            r = rev[i] + " " + r;
        }
        System.out.println(r);

    }
}
