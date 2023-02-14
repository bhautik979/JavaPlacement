public class sortedSearch {
    public static int search(int arr[],int tag, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        if(arr[mid]==tag){return mid;}

        // case1:
        if (si <= mid) {
            // case a:
              if(arr[si]<=tag && tag<arr[mid]){
                return search(arr, tag, si, mid-1);
              }
              else{
                return search(arr, tag, mid+1, ei);
              }
        }

        // case2
        else {
            if(arr[mid]<tag && tag<arr[ei]){
                return search(arr, tag, mid+1, ei);
            }
            else{
                return search(arr, tag, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2};
        System.out.println(search(arr,5,0,arr.length-1));
    }
}
