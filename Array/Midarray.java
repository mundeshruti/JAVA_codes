package Array;

public class Midarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 };
        int mid = arr.length / 2;
        if (arr.length % 2 != 0) {
            System.out.println(arr[mid]);
        } else {
            System.out.println(arr[mid] + " and " + arr[mid - 1]);
        }
        // even
    }

}
