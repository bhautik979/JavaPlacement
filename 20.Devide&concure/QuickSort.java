class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        //pivot index
        int pInx=partiotion(arr,si,ei);

        quickSort(arr, si, pInx-1);    //left
        quickSort(arr, pInx+1, ei);    //right
    }

    public static int partiotion(int arr[],int si,int ei){
            // pivot
        int pivot = arr[ei];
 
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (si - 1);
 
        for (int j = si; j <= ei - 1; j++) {
 
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, ei);
        return (i + 1);
    }
           
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 12, 48, 2, 45, 20 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
