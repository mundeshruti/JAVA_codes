package Pattern;

public class Diamond_Pyramid {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
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
    //       *
    //    *  * *
    //  * *  * * *
    //    *  * *
    //       *
