class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for (int cur:prices){
            max=Math.max(max,cur-min);
            min=Math.min(min,cur);
        }
        return max;
    }
}