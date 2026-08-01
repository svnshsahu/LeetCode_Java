class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int idx1=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < pivot){
                ans[idx1] = nums[i];
                idx1++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot){
                ans[idx1] = nums[i];
                idx1++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > pivot){
                ans[idx1] = nums[i];
                idx1++;
            }
        }
        return ans;
    }
}