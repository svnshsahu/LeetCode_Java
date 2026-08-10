class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int idx = discounts.length-1;
        double ans = 0 ;
        for(int i=prices.length-1; i>=0 ; i--){
            if(idx>=0){
                ans += ( (double)(prices[i] * (100 - discounts[idx]))/100 );
                idx--;
            }else{
                ans += prices[i];
            }
        }
        return ans ;
    }
}