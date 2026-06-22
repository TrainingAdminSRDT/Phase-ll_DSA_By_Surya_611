class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        if (intervals.empty()) return {};
        
        // Step 1: sort by start time
        sort(intervals.begin(), intervals.end());
        
        vector<vector<int>> result;
        result.push_back(intervals[0]);
        
        // Step 2: walk through, merge or push new
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals[i][0] <= result.back()[1]) {
                // overlap: extend the end of last merged interval
                result.back()[1] = max(result.back()[1], intervals[i][1]);
            } else {
                // no overlap: start a new interval
                result.push_back(intervals[i]);
            }
        }
        
        return result;
    }
};