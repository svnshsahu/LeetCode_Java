class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
        HashSet<Integer> numSet = new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=lower;i<=upper;i++){
           if(!numSet.contains(i)){
                list.add(i);
           }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(list.get(i));
            while( i+1!= list.size() &&  ( (list.get(i)+1) == list.get(i+1) ) ){
                i++;
            }
            temp.add(list.get(i));
            ans.add(temp);
        }
        return ans ;
    }
}