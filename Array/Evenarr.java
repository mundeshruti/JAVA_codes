package Array;

import java.util.Scanner;

public class Evenarr {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 78, 9, 0 };
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("even elements:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
