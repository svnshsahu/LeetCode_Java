class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int mid = n / 2;
        int count = 0;
        long leftSum = 0;
        long rightSum = 0;
        
        for (int i = 0; i < mid; i++) {
            leftSum += nums[i];
            rightSum += nums[mid + i];
        }
        if (leftSum > rightSum) count++;
         
        for (int i = 0; i < n - 1; i++) {
            int midElem = nums[(mid + i) % n];

            leftSum -= nums[i];
            leftSum += midElem;
            rightSum -= midElem;
            rightSum += nums[i];
            
            if (leftSum > rightSum) count++;
        }
        return count;
    }
}