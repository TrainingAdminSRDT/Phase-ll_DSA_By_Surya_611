class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length, m = 2 * k + 1;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        if (m > n) return ans;

        long sum = 0;
        for (int i = 0; i < m; i++) sum += nums[i];

        for (int i = k, j = m; ; i++, j++) {
            ans[i] = (int)(sum / m);
            if (j == n) break;
            sum += nums[j] - nums[j - m];
        }
        return ans;
    }
}
