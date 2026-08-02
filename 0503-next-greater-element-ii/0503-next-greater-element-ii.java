class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                map.put( stack.pop() , nums[i] );
            }
            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                map.put( stack.pop() , nums[i] );
            }
        }
        for(int key: map.keySet()){
            ans[key] = map.get(key);
        }
        return ans;
    }
}