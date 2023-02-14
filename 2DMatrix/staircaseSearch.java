public class staircaseSearch {
    public static void staircaseSearch(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;
        while (row < arr[0].length && col >= 0) {

            if (arr[row][col] == key) {
                System.out.println("Element at index(" + row + "," + col + ")");
                return;
            }

            else if(key>arr[row][col]){
                row++;
            }

            else{
                col--;
            }
        }

        System.out.println("Element not found");
        return;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        staircaseSearch(arr, 33);
    }
}
