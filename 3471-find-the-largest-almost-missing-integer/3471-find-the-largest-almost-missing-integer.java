class Solution {
    public int largestInteger(int[] nums, int k) {
        int max = -1;
        if(k==nums.length){
            for(int num : nums){
                max = Math.max(num , max);
            }
            return max;
        }
        else if(k==1){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put( nums[i] , map.getOrDefault(nums[i] , 0 )+1);
            }

            int ans = -1;
            for(int key : map.keySet()){
                if(map.get(key) == 1) ans = Math.max(ans , key);
            }
            return ans;
        }
        int a = 0 ;
        int start = nums[0];
        int b = 0 ;
        int end = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == start) a++;
            else if(nums[i] == end) b++;
        }
        if(a==1 && b>1) return start;
        else if(b==1 && a>1) return end;
        else if(a==1 && b==1) return Math.max(start,end);
        else return -1;
    }
}