class Solution {
    public int longestOnes(int[] nums, int k) {
        int limit = k ;
        int left = 0 ;
        int max = 0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                if(k>0){
                    k--;
                }else{
                    while(nums[left] != 0){
                        left++;
                    }
                    left++;
                }
            }
            max = Math.max(max  , i-left+1);
        }
        return max;
    }
}