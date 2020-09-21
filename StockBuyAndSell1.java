class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        
        if(prices.length == 0){
            return 0;
        }
        
        int lowestPriceToday = prices[0];
        
        for(int day = 0; day < prices.length; day++){
            
						int profit = 0;
						
            if(prices[day] > lowestPriceToday){
                profit = prices[day] - lowestPriceToday;
            }
            else if (prices[day] < lowestPriceToday){
                lowestPriceToday = prices[day];
            }
            
            if(profit > maxProfit){
                maxProfit = profit;
            }
        
        }
        
        return maxProfit;   
    }
}