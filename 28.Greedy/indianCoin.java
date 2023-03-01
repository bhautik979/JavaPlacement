public class indianCoin {
    public static void main(String[] args) {
        int coin[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int value = 591;
        int i,counter=0;
        while(value!=0){
            i=coin.length-1;
            while(value<coin[i]){
                i--;
            }
            value=value-coin[i];
            counter++;
        }
        System.out.println(counter);
    }
}
