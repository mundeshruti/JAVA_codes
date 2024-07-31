package Pattern;

public class Reverse_empty_triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                if (k == (2 * (n - i) - 2)) {
                    System.out.print("*" + " ");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }

}
