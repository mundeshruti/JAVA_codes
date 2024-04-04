package Array;

public class maxarray {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 7, 88, 0 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
