class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        if (k == 0)
            return nums;

        int window = 2 * k + 1;
        if (window > n)
            return ans;

        long sum = 0;

        // First window
        for (int i = 0; i < window; i++) {
            sum += nums[i];
        }

        ans[k] = (int)(sum / window);

        // Slide the window
        for (int i = window; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - window];

            int center = i - k;
            ans[center] = (int)(sum / window);
        }

        return ans;
    }
}
