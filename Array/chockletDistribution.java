//Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.

import java.util.*;
public class chockletDistribution {
 
    public static int chockletDistribution(int arr[],int m){
        Arrays.sort(arr);
        int start=0,end=m-1;
        int minDiff=Integer.MAX_VALUE;
        while(end<arr.length){
            minDiff=Math.min(minDiff,arr[end]-arr[start]);
            start++;
            end++;
        }
        return minDiff;

    }
    public static void main(String[] args) {
        int arr[]={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        System.out.println("Minimum different is:"+chockletDistribution(arr,7));
    }
}
