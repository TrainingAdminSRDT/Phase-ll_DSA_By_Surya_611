class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> result(n, -1);
        
        int windowSize = 2 * k + 1;
        if (windowSize > n) return result; // no valid window fits
        
        long long sum = 0;
        for (int i = 0; i < windowSize; i++) sum += nums[i];
        
        result[k] = sum / windowSize; // center of first window
        
        for (int i = windowSize; i < n; i++) {
            sum += nums[i] - nums[i - windowSize];
            result[i - k] = sum / windowSize; // center of current window
        }
        
        return result;
    }
};