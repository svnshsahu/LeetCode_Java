class Solution {
    public int maxProduct(int[] nums) {
        int idx1 = -1 ;
        int idx2 = -1 ;
        int max1 = 0 ;
        int max2 = 0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max1){
                max2 = max1 ;
                idx2 = idx1 ;
                max1 = nums[i];
                idx1 = i ;
            }
            else if(nums[i] > max2 && idx1 != i){
                max2 = nums[i];
                idx2 = i ;
            }
        }
        return (max1-1)*(max2-1);
    }
}