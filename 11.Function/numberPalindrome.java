//Apply reverse making concept
public class numberPalindrome {
    public static void main(String[] args) {
        int n = 7271;
        int rem = 0;
        int temp = n, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No");
        }
    }
}
