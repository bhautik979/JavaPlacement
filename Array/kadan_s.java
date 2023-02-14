public class kadan_s {
    public static int kadansMax(int arr[]) {
        int curruntSum = 0, maxSum = Integer.MIN_VALUE;
        boolean flag=false;  //assume that all are negative
        /*
         * If all number are negative then we have to return smallest negative number
         * explesitly
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {   //find if any positive number present in code
                flag = true;
                break;
            }
        }

        //if no positive number in array
        if (!flag) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>maxSum)
                {
                    maxSum=arr[i];
                }
            }
            return maxSum;
        }


        //if Mix pattern given
        for (int i = 0; i < arr.length; i++) {

            curruntSum = curruntSum + arr[i]; // update currsum
            if (curruntSum < 0) {
                curruntSum = 0;
            }
            if (maxSum < curruntSum) { // update maxsum
                maxSum = curruntSum;
            }
        }
        return maxSum;

    }

    public static int kadansMin(int arr[]) {
        int curruntSum = 0, minimumSum = Integer.MAX_VALUE;
        boolean flag=false;  //assume all number are positive
        /*
         * If all number are positive then we have to return smallest positive number
         * explesitly
         */
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
            {
                flag=true;
                break;
            }
        }

        //if no negative number in array
        if(!flag)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minimumSum)
            {
                minimumSum=arr[i];
            }
            
            return minimumSum;
        }

        
        for (int i = 0; i < arr.length; i++) {

            curruntSum = curruntSum + arr[i];
            if (curruntSum > 0) { // update curruntSem
                curruntSum = 0;
            }
            if (curruntSum < minimumSum) { // update minimumSum
                minimumSum = curruntSum;
            }
        }
        return minimumSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum subarray sum is:" + kadansMax(arr));
        System.out.println("Minimum subarray sum is:" + kadansMin(arr));
    }
}
