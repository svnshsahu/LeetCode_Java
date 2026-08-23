class Solution {
    public int minStartValue(int[] nums) {
        int start = 1 ;
        int value = 1 ; 
        for(int num : nums){
            value = value + num ;
            if(value < 1 ) {
                int temp2 = 1 - value ;
                start = start + temp2;
                value = 1 ;
            }
        }
        return start ;
    }
}