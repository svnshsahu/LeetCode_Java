class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean allOdd = true;
        boolean allEven = true;
        int min = Integer.MAX_VALUE ;
        for(int num : nums1){
            if( num % 2 == 0) allOdd = false;
            else allEven = false;
            if(num % 2 != 0){
                min = Math.min(min , num) ;
            }
        }
        if(allOdd == true || allEven == true) return true;
        for(int num : nums1){
            if(num % 2 == 0){
                if( (num - min) <= 0) return false; 
            }
        }
        return true;
    }
}