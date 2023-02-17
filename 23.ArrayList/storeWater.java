import java.util.ArrayList;

public class storeWater {

    public static int storeWater(ArrayList<Integer> list) { // Two Pointer Approach

        int lp = 0;
        int rp = list.size()-1;
        int curruntWater,maxWater=0;
        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            curruntWater = height * width;
            maxWater=Math.max(maxWater,curruntWater);

            //if Left height is small
            if(list.get(lp)<list.get(rp)){
                lp++;
            }

            else{  //if roght hight is small
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(storeWater(list));
    }
}
