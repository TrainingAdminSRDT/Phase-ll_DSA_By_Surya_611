class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];

        // Initialize all values to -1
        Arrays.fill(avgs, -1);

        int windowSize = 2 * k + 1;

        if (windowSize > n) {
            return avgs;
        }

        long windowSum = 0;

        // First window sum
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }

        avgs[k] = (int) (windowSum / windowSize);

        // Slide the window
        for (int right = windowSize; right < n; right++) {
            windowSum += nums[right];
            windowSum -= nums[right - windowSize];

            int center = right - k;
            avgs[center] = (int) (windowSum / windowSize);
        }

        return avgs;
    }
}