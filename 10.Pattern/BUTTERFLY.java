import java.util.*;

public class BUTTERFLY {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // first star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // second star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* Two logic */

        /*
         * lower half
         * for (int i = 1; i <= n; i++) {
         * // first star
         * for (int j = 1; j <= (n-i+1); j++) {
         * System.out.print("*");
         * }
         * 
         * // space
         * for (int j = 1; j <= (n-5+i) * 2; j++) {
         * System.out.print(" ");
         * }
         * 
         * // second star
         * for (int j = 1; j <= (n-i+1); j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        for (int i = n; i >= 1; i--) {
            // first star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // second star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}