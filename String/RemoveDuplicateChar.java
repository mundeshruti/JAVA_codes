package String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        // Create a set to store unique characters
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Add the character to the result if it's not in the set
            if (!set.contains(c)) {
                result.append(c);
                set.add(c);
            }
        }
        return result.toString();
    }
}
