package Array;

import java.util.Scanner;

public class Sumarray {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4 };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("sum of all array elements: " + sum);
    }

}
