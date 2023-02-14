import java.util.*;
class inBuilt{
    public static void main(String []args)
    {
       int [] arr={2,5,1,3,4,8,6};
       //Arrays.sort(arr);
       //Arrays.sort(arr,0,4);
       Collections.sort(arr,Collections.reverseOrder());
       for(int i:arr)
       {
        System.out.print(i+" ");
       }

    }
}