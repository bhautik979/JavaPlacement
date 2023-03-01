import java.util.*;
public class MaxLengthPair {
    public static void main(String[] args) {   //o(n)
      int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};  //sort based on end time

        //sort pair
        Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

        ArrayList<Integer> ans=new ArrayList<>();

        //activity counter
        int maxpair=0;

        //select first activity because it end fastly
        maxpair=1;
        ans.add(0);            //start
        int lastEnd=pair[0][1];         //end

        for(int i=1;i<pair.length;i++){
            while (pair[i][0]>=lastEnd) {
                ans.add(i);
                lastEnd=pair[i][1];
                maxpair++;
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}

