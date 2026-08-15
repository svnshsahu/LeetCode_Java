class Solution {
    public int longestSubsequence(int[] nums) {
        int flag = 0 ; 
        int xor = 0 ;
        for(int num : nums){
            xor = xor ^ num ;
            if(num != 0 ){
                flag = 1 ;
            }
        }
        if(flag == 0) return 0 ;
        else if(xor == 0) return nums.length-1 ;
        else return nums.length;
    }
}