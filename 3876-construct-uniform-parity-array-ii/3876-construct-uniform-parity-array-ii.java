class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean allOdd = true;
        boolean allEven = true;
        for(int num : nums1){
            if( num % 2 == 0) allOdd = false;
            else allEven = false;
        }
        if(allOdd == true || allEven == true) return true;

        int min = Integer.MAX_VALUE ;

        for(int num: nums1){
            if(num % 2 != 0){
                min = Math.min(min , num) ;
            }
        }

        for(int num : nums1){
            if(num % 2 == 0){
                if( (num - min) <= 0) return false; 
            }
        }
        return true;
    }
}