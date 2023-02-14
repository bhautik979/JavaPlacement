class bit {
    public static int getIth(int number, int i) {
        int bitMask = (1 << i);
        if ((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIth(int number, int i) {
        int bitMask = (1 << i);
        return number | bitMask;
    }

    public static int clearIth(int number, int i) {
        int bitMask = ~(1 << i);
        return number & bitMask;
    }

    public static int clearLastI(int number, int i) {
        int bitMask = (~0) << i;
        return number & bitMask;
    }

    public static int clearBetween(int number, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return number & bitMask;
    }

    public static boolean isPower2(int number) {
        int ans = number & (number - 1);
        if (ans == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int countSetBit(int number) {
        int count = 0;
        while (number != 0) {
            if ((number & 1) != 0) { // check condition
                count++;
            }

            number = number >> 1;
        }

        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) { // Cheak each bit one by one

            if ((n & 1) != 0) {  //Cheak LSB
               ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));

    }
}