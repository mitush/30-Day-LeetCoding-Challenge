class Solution {
    public int maxProfit(int[] prices) {
        int ans =0;
        int i=0;
        int min =0;
        while(i<prices.length){
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            min = prices[i++];
            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            if(i<prices.length){
                ans = ans + prices[i++]-min;
            }
        }
        return ans;
    }
}
