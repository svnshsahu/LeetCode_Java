class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put( nums[i] , map.getOrDefault( nums[i], 0 ) + 1 );
        }
        int[] ans = new int[k];

        HashMap<Integer , ArrayList<Integer>> map2 = new HashMap<>();

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (map2.containsKey(frequency)) {
                map2.get(frequency).add(key);
            } else {
                map2.put(frequency, new ArrayList<>());
                map2.get(frequency).add(key);
            }
        }
        int index = 0 ;
        for(int i=nums.length ; i>=0 && index<k; i-- ){
            if(map2.containsKey(i)){
                for(int num : map2.get(i)){
                    ans[index] = num ;
                    index++;
                    if(index == k){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}