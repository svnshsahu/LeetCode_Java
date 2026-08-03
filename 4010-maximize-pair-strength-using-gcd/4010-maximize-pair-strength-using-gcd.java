class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = 0 ;
        long temp  ; 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long x = (long)nums[i] * (long)nums[j];
                long y = gcd( nums[i] , nums[j]) ;
                temp = x / y ; 
                ans = Math.max( temp , ans );
            }
        } 
        return ans ;  
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a*a;
    }

}