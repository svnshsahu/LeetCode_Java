class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans = new ArrayList<>();

        int n = security.length;

        int[] left = new int[n];
        left[0] = 0;

        // Number of non-increasing days ending at i
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (security[i - 1] >= security[i]) {
                count++;
                left[i] = count;
            } else {
                count = 0;
            }
        }

        int[] right = new int[n];
        right[n - 1] = 0;

        // Number of non-decreasing days starting at i
        count = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                count++;
                right[i] = count;
            } else {
                count = 0;
            }
        }

        // A good day needs at least `time` days on both sides
        for (int i = 0; i < n; i++) {
            if (left[i] >= time && right[i] >= time) {
                ans.add(i);
            }
        }

        return ans;
    }
}
