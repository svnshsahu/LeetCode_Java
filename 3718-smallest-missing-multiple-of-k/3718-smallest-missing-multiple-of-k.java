class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int idx = 0 ;
        for(int num:nums){
            set.add(num);
        }
        for(int i=k ; i<=100 ; i+=k){
            if(!set.contains(i)) return i;
            idx = i ;
        }
        return idx + k ;
    }
}