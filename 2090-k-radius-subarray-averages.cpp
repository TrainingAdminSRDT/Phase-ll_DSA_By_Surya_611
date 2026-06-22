class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> result(n, -1);
        if (2 * k + 1 > n) return result;
        long long windowSum = 0;
        for (int i = 0; i < 2 * k + 1; i++) windowSum += nums[i];
        result[k] = windowSum / (2 * k + 1);
        for (int i = k + 1; i < n - k; i++) {
            windowSum += nums[i + k] - nums[i - k - 1];
            result[i] = windowSum / (2 * k + 1);
        }
        return result;
    }
};
