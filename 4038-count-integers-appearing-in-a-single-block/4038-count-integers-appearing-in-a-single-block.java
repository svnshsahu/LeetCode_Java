class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0 ;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                count++;
                while(i!=nums.length-1 && nums[i] == nums[i+1]){
                    i++;
                }   

            }else{
                if(!set.contains(-nums[i])){
                    set.add(0-nums[i]);
                    count--;
                    while(i!=nums.length-1 && nums[i] == nums[i+1]){
                        i++;
                    }
                }
            }
        }
        return count;
    }
}