import java.util.*;
public class SOLID_RHOMBUS {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
