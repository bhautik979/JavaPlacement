class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        // devide
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // we need temporary array for merging
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// iterator for temp array


        //arrange array in temp array by accending order
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }

        //copy in origional array
        k=0;
        for(int u=si;k<temp.length;u++)
        {
            arr[u]=temp[k++];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 9,6,12,48,2,45,20};
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
}
