class Solution {
    public int maxProfit(int[] prices) {
       int max=0;
       int buyprice=prices[0];
       for(int i=1;i<prices.length;i++)
       {
        int currentprofit=prices[i]-buyprice;
        if(currentprofit>max)
        {
            max=currentprofit;
        }
        if(prices[i]<buyprice)
        {
            buyprice=prices[i];
        }
       } 
       return max;
    }
}