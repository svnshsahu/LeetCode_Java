class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length  == 1 ) return 1;
        if(nums.length == 2 ) return 2 ;
        int min = Integer.MAX_VALUE ;
        int idx1 = -1 ;
        int max = Integer.MIN_VALUE;
        int idx2 = -1 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i] ;
                idx1 = i ;
            }
            if(nums[i] > max){
                max = nums[i] ;
                idx2 = i ;
            }
        }
        if(idx1 > idx2){
            int temp = idx1;
            idx1 = idx2;
            idx2 = temp;
        }

        int left = idx2 + 1;
        int right = nums.length - idx1;
        int both = idx1 + 1 + nums.length - idx2;

        return Math.min(left, Math.min(right, both)); 
    }
}