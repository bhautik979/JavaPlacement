public class DecimalToBin {
    public static int pow(int x, int i) {
        if (i == 0) {
            return 1;
        }
        return x * pow(x, i - 1);
    }

    public static void main(String[] args) {
        int decimal = 128;
        int bin=0, i = 0;
        while (decimal != 0) {
            int rem = decimal % 2;
            bin = rem * pow(10, i) + bin;
            decimal=decimal/2;
            i++;
        }
        System.out.println(bin);
    }
}
