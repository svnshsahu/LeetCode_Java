class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        if(nums[0] == target) return 1;
        if(nums[nums.length-1] < target) return 0 ;


        int left = -1;
        int right = 0;
        int min = Integer.MAX_VALUE;

        while(right < nums.length){
            if(left == -1){
                if(nums[right] >= target){
                    left++;
                    while((nums[right] - nums[left] ) >= target){
                        left++;
                    }
                    min = Math.min(right - left + 1 , min );
                }else{
                    right++;
                }
            }else{
                if((nums[right] - nums[left] ) >= target){
                    while((nums[right] - nums[left] ) >= target){
                        left++;
                    }
                    min = Math.min(right - left + 1 , min );
                }else{
                    right++;
                }
            }
        }
        return min ;
    }
}