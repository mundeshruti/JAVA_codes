package String;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // String s = " s h r u t i k a";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = sc.nextLine();
        String r = s.replaceAll("\\s", "");
        System.out.println("String after removing whitespace: " + r);
    }

}
