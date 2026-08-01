class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0] == 0) return false;
        int jump = nums[0] ;
        for(int i=1;i<nums.length;i++){
            jump--;
            if(jump==0 && nums[i]==0 && i!=nums.length-1) break;
            if(i==nums.length-1){
                if(jump >= 0 ) return true;
            }else{
                if(jump < nums[i]){
                    jump = nums[i];
                }
            }
        }
        return false;
    }
}