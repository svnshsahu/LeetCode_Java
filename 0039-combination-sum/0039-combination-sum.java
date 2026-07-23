class Solution {

    void sum(int[] candidates , int target , List<List<Integer>> ans , int idx , List<Integer> temp){

        if(idx == candidates.length || target<0) {
            return;
        } 
        if(target == 0 ){
            ans.add(new ArrayList<>(temp));
            return;
        }
        else{
            temp.add(candidates[idx]); 
            sum(candidates, target - candidates[idx], ans, idx, temp);
            temp.remove(temp.size() - 1) ;
            sum(candidates, target, ans, idx + 1, temp);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sum(candidates , target , ans , 0, temp);
        return ans;
    }
}