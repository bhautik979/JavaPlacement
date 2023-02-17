import java.util.ArrayList;

public class RotetedPairsum {
    public static void findStatus(ArrayList<Integer> list,int target){

        //Step 1:Find pivot number
        int i=0,j=1;
        while(list.get(i)<list.get(j) && j<list.size()){
              i++;j++;
        }
        int pivot=j;
        

        //step2 :regular 
        int lp=pivot,rp=pivot-1;  //lp at lower value and rp at higher value
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("True");
                return;
            }

            if(list.get(lp)+list.get(rp)>target){
                rp=(list.size()+rp-1)%list.size();
            }

            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            }

        }

        System.out.println("False");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        findStatus(list,16);
    }
}
