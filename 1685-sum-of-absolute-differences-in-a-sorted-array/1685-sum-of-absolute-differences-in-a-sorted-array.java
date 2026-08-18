class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] ans = new int[nums.length];
        prefix[0] = nums[0] ;
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i] + prefix[i-1] ;
        }

        for(int i=0;i<nums.length;i++){
            if( i == 0 || i == nums.length-1 ){
                ans[i] = Math.abs(prefix[nums.length-1] - (nums[i] * nums.length)) ;
            }else{
                ans[i] = ( (nums[i] * i ) - prefix[i-1] ) + 
                ( (prefix[nums.length-1] - prefix[i]) -(nums[i] * (nums.length-i-1 ))) ;
            }
        }
        return ans;
    }
}