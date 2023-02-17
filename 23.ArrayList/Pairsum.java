import java.util.ArrayList;

public class Pairsum {
    public static void findStatus(ArrayList<Integer> list,int target){
        int lp=0,rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("True");
                return;
            }

            if(list.get(lp)+list.get(rp)>target){
                rp--;
            }

            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        findStatus(list,5);
    }
}
