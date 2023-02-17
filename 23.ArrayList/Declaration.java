import java.util.ArrayList;
import java.util.*;
public class Declaration {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();


        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        // System.out.println(list1);


        //o(n)
        //reverse of arrayList
        // for(int i=list1.size()-1;i>=0;i--)
        // {
        //     System.out.print(list1.get(i)+"  ");
        // }

        //o(n)
       // int max=Integer.MIN_VALUE;
        //max in array
        // for(int i=0;i<list1.size();i++)
        // {
        //     if(max<list1.get(i)){
        //         max=list1.get(i);
        //     }
        // }System.out.println(max);

        Collections.sort(list1);   //ascending
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);
    }
}
