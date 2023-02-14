public class prefix {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int start, end,sum,max=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            prefix[i] = i == 0 ? arr[i] : prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < prefix.length; i++) {   //o(n^2)
            for (int j = i; j <prefix.length; j++) {

                start = i;
                end = j;
                sum = i == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }

        System.out.println(max);
    }
}
