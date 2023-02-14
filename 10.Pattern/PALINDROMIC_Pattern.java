import java.util.*;
public class PALINDROMIC_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >=1; k--) {
                System.out.print(k);
            }

            if(i>=2)//Second Part
            {
                for (int j = 2; j <=i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
