class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0) nums[i] = 0 ;
        }

        int max =  0;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max , nums[i]);
            set.add(nums[i]);
        }

        for(int i=1;i<=max;i++){
            if(set.contains(i)) continue;
            else return i;
        }

        return max+1 ;


    }
}