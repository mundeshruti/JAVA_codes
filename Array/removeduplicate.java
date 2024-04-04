package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeduplicate {
    public static void main(String[] args) {
        // Sample array with duplicate elements
        Integer[] array = { 1, 2, 3, 4, 2, 3, 5 };

        // Convert array to a list
        List<Integer> list = Arrays.asList(array);

        // Create a Set from the list to remove duplicates
        Set<Integer> set = new HashSet<>(list);

        // Convert the Set back to an array
        Integer[] uniqueArray = set.toArray(new Integer[0]);

        // Print the unique elements
        System.out.println("Unique elements:");
        for (Integer element : uniqueArray) {
            System.out.println(element);
        }
    }
}
