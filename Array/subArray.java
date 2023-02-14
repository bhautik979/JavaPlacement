class subArray {

    public static void nestedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                int start = i, end = j;
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        nestedArray(arr);

    }
}
