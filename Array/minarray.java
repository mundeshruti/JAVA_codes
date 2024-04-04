package Array;

public class minarray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 9, 0 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }

}
