import java.util.*;
public class nextGreaterRight {
    public static void findnextGreater (int[] arr,int []nextGreater) {
        Stack<Integer> s=new Stack<>();   
        nextGreater[arr.length-1]=1;
        s.push(arr.length-1);

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
               s.pop();
            }

            if(s.isEmpty()){

                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);


        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,8,6,4,7};
        int [] nextGreater=new int[arr.length];    //calculate nextGreater

       findnextGreater(arr,nextGreater);

       for(int i=0;i<nextGreater.length;i++)
       {
        System.out.println(nextGreater[i]);
       }
    }
}
