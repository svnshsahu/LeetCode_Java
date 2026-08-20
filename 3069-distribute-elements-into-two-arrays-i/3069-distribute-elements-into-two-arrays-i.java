class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int idx1 = 0 ;
        int idx2 = 0 ;
        for(int i=2;i<nums.length;i++){
            if(arr1[idx1] > arr2[idx2]){
                arr1[idx1+1] = nums[i];
                idx1++;
            }else{
                arr2[idx2+1] = nums[i];
                idx2++;
            }
        }
        for(int i=0;i<=idx1;i++){
            nums[i] = arr1[i];
        }
        for(int i=idx1+1 ; i<nums.length; i++){
            nums[i] = arr2[i-idx1-1];
        }
        return nums;
    }
}