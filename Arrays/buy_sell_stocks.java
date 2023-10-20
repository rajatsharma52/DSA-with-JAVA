package Arrays;

public class buy_sell_stocks {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit= 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //This case gives us our profit.
                int profit= prices[i] - buyPrice; //It is the today profit. profit= sellprice - buy price.
                maxProfit= Math.max(maxProfit, profit);

            }
            else{
                buyPrice= prices[i]; //This case is for when the day is not a profit day so we buy the item.
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};
        System.out.println("Our maximum profit is:" + buyAndSellStocks(prices));
    }
    
}
