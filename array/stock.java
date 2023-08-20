package array;

public class stock{
    public static int profit(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int profit = 0,maxprofit=0;
        for (int i=1 ;i<price.length-1;i++){
            if (buyprice<price[i]){
                profit = price[i]-buyprice;
                maxprofit = Math.max(profit, maxprofit);
            }

            else{
                buyprice = price[i];
            }
            
    }
     return maxprofit;
}

public static void main(String aa[]){
        int a[]={7,1,5,6,4};
        System.out.print(profit(a));
    }
}