class subArray {

    public static void nestedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {     // this give starting index 
            for (int j = arr.length - 1; j >= i; j--) {   //this give ending index
                for (int k = i; k <= j; k++) {     //this is pounter from start to end

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
