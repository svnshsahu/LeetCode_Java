class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ;i<nums.length ;i++){
            max = Math.max(max , nums[i]);
            for(int j=i ;j<nums.length;j++){
                min = Math.min(min , nums[j]);
            }
            if ( ( max - min ) <= k ) return i;
            else  min = Integer.MAX_VALUE;
        }
        return -1;
    }
}