class practice {
    public static void buyAndSellStock(int price[]) {
        int maxProfit=0;
        for (int i = price.length-1; i >=0; i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(price[i]+"-"+price[j]+"::"+maxProfit+"::"+(price[i]-price[j]));
                maxProfit=Math.max(maxProfit,(price[i]-price[j]));
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        buyAndSellStock(price);
    }
}