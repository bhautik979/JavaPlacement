public class TrapingRainWater {
    public static int trapWater(int arr[]) {
        if (arr.length == 0 || arr.length == 1 || arr.length == 2) { // for this condition trapWate is 0   :TimeComplexity o(n)
            return 0;
        }
        // check array is not ascending or desending if yes then return 0

        int maxLeft[] = new int[arr.length]; // find left maximum
        int maxRight[] = new int[arr.length]; // find right maximum

        // fing right maximum for all column
        maxLeft[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], arr[i]);

        }

        // find left maximum for all column

        maxRight[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(arr[i], maxRight[i + 1]);

        }

        int watelLength, trapWater = 0;
        // calculate trapWater
        for (int i = 0; i < arr.length; i++) {
            watelLength = Math.min(maxLeft[i], maxRight[i]);
            trapWater = (watelLength - arr[i]) * 1 + trapWater; // hear width is 1 ok
        }
        return trapWater;

        /*
         * print(maxLeft);
         * print(maxRight);
         */
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("TrapWater is:" + trapWater(arr));
    }
}
