//reverse Order
public class Buble {
    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertion(int[] arr) {
        int length = arr.length;
        int i = 0;
        int min = i;
        for (i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(arr);
    }
}
