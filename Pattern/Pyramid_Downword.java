package Pattern;

/**
 * Pyramid_Downword
 */
public class Pyramid_Downword {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (n - i - 1) * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}