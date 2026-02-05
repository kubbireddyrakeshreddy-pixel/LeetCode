class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=Integer.MIN_VALUE, minvalue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minvalue){
                minvalue=prices[i];

            }
            else{

              int profit= prices[i]-minvalue;
               maxprofit=Math.max(profit,maxprofit);
            }
               
        }
        if (maxprofit<0){
                return 0;
               }
        return maxprofit;
     
        
    }
}