
public class Distinct {
    public static boolean binSearch(int arr[], int key, int start, int end) {
        if (start >= end) {
            return false;
        }
        int mid = start + ((end - start) / 2);
        if (arr[mid] == key) {
            return true;
        }
        if (arr[mid] < key) {
            return binSearch(arr, key, mid + 1, end);
        }
        if (arr[mid] > key) {
            return binSearch(arr, key, start, mid - 1);
        }
        return false;
    }

    public static boolean findDistinct(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // check for every element copy is present or not
            if (binSearch(arr, i, i + 1, arr.length)) { // if copy element is found
                return true;
            }

        }

        //no copy element is found
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(findDistinct(arr));  //complexity o(nlogn);
    }
}
