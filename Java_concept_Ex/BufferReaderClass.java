// Java Program to Illustrate BufferedReader Class
package Java_concept_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Main class
public class BufferReaderClass {

    // Main driver method
    public static void main(String args[])
            throws IOException {

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        // Taking integer input
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String");

        String b = br.readLine();

        // Printing input entities above
        System.out.printf("You have entered:- " + a
                + " and name as " + b);
    }
}
