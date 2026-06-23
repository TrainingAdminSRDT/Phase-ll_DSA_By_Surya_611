// leetcode problem number : 2235. Add Two Integers
class Solution {
public:
    int sum(int num1, int num2) {
        return num1 + num2;
    }
};


//  leetcode problem number: 7. Reverse Integer
class Solution {
public:
    int reverse(int x) {
        long long int n = x;
        if(n < 0)
        {
            n = -n;
        }
        string s = to_string(n);
        for(int i = 0 ; i < s.size() / 2 ;i++)
        {
            swap(s[i],s[s.size()- 1 - i]);
        }
        long long int k  = stoll(s);//stl convert srign
        if(x < 0)
        {
            k = -k;
        }
        if(k < INT_MIN || k > INT_MAX)
        {
            return 0;
        }
        return k;

    }
};
//  leetcode problem number: 136. Single Number
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for (const int num : nums){
            ans ^=num;
        }
        return ans;
    }
};

//  leetcode problem number:169. Majority Element
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int cnt=0;
        int m =0;
        for(int x : nums){
            if (cnt==0){
                m = x;
                cnt=1;
            
            }else {
                cnt += m == x ? 1 : -1;
            }
        }
        return m;

        
    }
};
//  leetcode problem number:169. Majority Element
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int cnt=0;
        int m =0;
        for(int x : nums){
            if (cnt==0){
                m = x;
                cnt=1;
            
            }else {
                cnt += m == x ? 1 : -1;
            }
        }
        return m;

        
    }
};
//  leetcode problem number: 26. Remove Duplicates from Sorted Array
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        for (int j=1; j<nums.size(); j++){
            if (nums[j]!=nums[i]){
                nums[i+1] = nums[j];
                i++; 
            }               
        }
    return i+1;
    }
};
//  leetcode problem number: 1480. Running Sum of 1d Array
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        for (int i = 1; i < nums.size(); ++i) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
};
//  leetcode problem number:53. Maximum Subarray
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        int n = nums.size();

        for (int i = 1 ; i<n ; i++){
            currsum = max(nums[i], currsum + nums[i]);
            maxsum = max(currsum, maxsum);

        }
        return maxsum;
    }
};
//  leetcode problem number: 1. Two Sum
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int num1 = 10;
        int num2 = 20;
        
        int sum = num1 + num2;
        
        
    }
};

//  leetcode problem number: 283. Move Zeroes
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int k = 0,n = nums.size();
        for (int i = 0; i<n ; ++i){
            if(nums[i]){
                swap(nums[i], nums[k++]);
            }
        }
         
        
    }
};
//  leetcode problem number:643. Maximum Average Subarray I
 class Solution {
public:
    double findMaxAverage(std::vector<int>& nums, int k) {
        // Calculate sum of the first window of size k
        double current_sum = std::accumulate(nums.begin(), nums.begin() + k, 0.0);
        double max_sum = current_sum;
        
        // Slide the window across the array
        for (int i = k; i < nums.size(); ++i) {
            current_sum += nums[i] - nums[i - k];
            max_sum = std::max(max_sum, current_sum);
        }
        
        // Return the maximum average
        return max_sum / k;
    }
};
//  leetcode problem number: 2090. K Radius Subarray Averages
class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
          int n = nums.size();
          vector<int> avg(n, -1);
          if (2*k+1>n) return avg;
          unsigned long long sum=0;

          for(int i=0; i<=2*k; i++){
            sum+=nums[i];
          }
          avg[k]= sum/(2*k+1);
          for(int i = k+1; i<n-k; i++){
            sum+=nums[k+i]-nums[i-k-1];
            avg[i]=sum/(2*k+1);
          }
          return avg;
        
    }
};
//  leetcode problem number: 704. Binary Search
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;

        
    }
};
//  leetcode problem number: 35. Search Insert Position
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low=0;
        int high=nums.size();
        int mid;
        if(target>nums[high-1]){
            return high;
        }
        while(low<=high){
              mid=(low+high)/2;
            if(nums[mid]==target){  
                return mid;
            }
          
            if(target<nums[mid]){     
            high=mid-1;    
            }else{
            low=mid+1;        
            }
          
        }
         return  low;   
    }
};
//  leetcode problem number: 367. Valid Perfect Square
class Solution {
public:
    bool isPerfectSquare(int num) {

        long long left = 1;
        long long right = num;

        while (left <= right) {

            long long mid = left + (right - left) / 2;
            long long square = mid * mid;

            if (square == num)
                return true;

            if (square < num)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
};
//  leetcode problem number: 342. Power of Four
class Solution {
public:
    bool isPowerOfFour(int n) {
        // Iterate through powers of 4 from 4^0 to 4^15
        for (int i = 0; i <= 15; i++) {
            int powerOfFour = pow(4, i);
            
            // If we find a power of four equal to 'n', return true
            if (powerOfFour == n)
                return true;
            
            // If the current power of four is greater than 'n', there's no need to continue
            if (powerOfFour > n)
                return false;
        }
        
        // 'n' is not a power of four
        return false;
    }
};
//  leetcode problem number: 242. Valid Anagram

 class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());
        return s==t;
    }
};
//  leetcode problem number: 56. Merge Intervals
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n = intervals.size();
        sort(intervals.begin(), intervals.end());

        vector<vector<int>> ans;
        for (int i = 0; i < n; i++) {
            if(ans.empty() || intervals[i][0] > ans.back()[1]) {
                ans.push_back(intervals[i]);
            } else {
                ans.back()[1] = max(ans.back()[1], intervals[i][1]);
            }
        }
        return ans;
        
    }
};
//  leetcode problem number: 160. Intersection of Two Linked Lists
 
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *t1=headA;
        ListNode *t2=headB;
        while(t1 != t2){
            t1=t1->next;
            t2=t2->next;

            if(t1 == t2) return t1;

            if(t1 == NULL) t1=headB;
            if(t2 == NULL) t2=headA;
        }
        return t1;
    }
};
//  leetcode problem number:206. Reverse Linked List
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = nullptr;
        ListNode* curr = head;

        while (curr != nullptr) {
            ListNode* temp = curr->next; // Step 1
            curr->next = prev;           // Step 2
            prev = curr;                 // Step 3
            curr = temp;                 // Step 4
        }

        return prev;
    }
};
//  leetcode problem number: 21. Merge Two Sorted Lists
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* curr1 = list1;
        ListNode* curr2 = list2;
        ListNode* dummyNode = new ListNode(-1);
        ListNode* temp = dummyNode;

        while(curr1 && curr2) {
            if(curr1->val < curr2->val) {
                temp->next = curr1;
                temp = curr1;
                curr1 = curr1->next;
            }
            else {
                temp->next = curr2;
                temp = curr2;
                curr2 = curr2->next;
            }
        }
        if(curr1) temp->next = curr1;
        if(curr2) temp->next = curr2;
        return dummyNode->next;
    }
};
//  leetcode problem number: 509. Fibonacci Number
class Solution {
public:
    int fib(int n) {
        int fib_nums[] = {
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
            6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
            1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986,
            102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903
        };

        return fib_nums[n];
    }
};
//  leetcode problem number: 

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--; k--;
            }
            else{
                nums1[k] = nums2[j];
                j--; k--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--; k--;
        }
    }
};
//  push and pop operation
 #include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> st;

    st.push(9);
    st.push(7);
    st.pop();

    st.push(11);
    st.push(13);
    st.push(17);

    st.pop();
    st.pop();

    st.push(32);

    st.pop();
    st.pop();

    st.push(31);

    st.pop();

    cout << "Final Stack (Top to Bottom):\n";

    while (!st.empty()) {
        cout << st.top() << " ";
        st.pop();
    }

    return 0;
}

// lifo string processing
#include <bits/stdc++.h>
using namespace std;

int main() {
    string s = "abc#d###f";
    stack<char> st;

    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '#') {
            if (!st.empty())
                st.pop();
        } else {
            st.push(s[i]);
        }
    }

    string ans = "";

    while (!st.empty()) {
        ans += st.top();
        st.pop();
    }

    reverse(ans.begin(), ans.end());

    cout << ans;

    return 0;
}
//undo  redo operation 
#include <bits/stdc++.h>
using namespace std;

stack<char> st;

string undo(string &s) {
    if (!s.empty()) {
        char elem = s[s.length() - 1];
        st.push(elem);
        s.pop_back();
    }
    return s;
}

string redo(string &s) {
    if (!st.empty()) {
        char elem = st.top();
        st.pop();
        s += elem;
    }
    return s;
}

int main() {
    string s = "abcd";

    cout << "After Undo: " << undo(s) << endl;
    cout << "After Redo: " << redo(s) << endl;

    return 0;
}
//stack k application undo redoo
#include <bits/stdc++.h>
using namespace std;

stack<char> st;

string undo(string &s) {
    char elem = s[s.length() - 1];
    st.push(elem);
    s.pop_back();
    return s;
}

string redo(string &s) {
    char elem = st.top();
    st.pop();
    s += elem;
    return s;
}

int main() {
    string s = "abcd";

    cout << undo(s) << endl;
    cout << redo(s);

    return 0;
}
 //leetcode problem number: 104. Maximum Depth of Binary Tree
 class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == NULL) return 0;
        return 1 + max(maxDepth(root->left), maxDepth(root->right));
    }
};
// Leetcode Problem Number:100. Same Tree
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        
        // Base case: If both trees are empty
        if (p == NULL && q == NULL) {
            return true;
        }

        // If one tree is empty and the other is not
        if (p == NULL || q == NULL) {
            return false;
        }

        // Compare current node values
        if (p->val != q->val) {
            return false;
        }

        // Recursively check left and right subtrees
        return isSameTree(p->left, q->left) &&
               isSameTree(p->right, q->right);
    }
};
// Leetcode Problem Number:104. Maximum Depth of Binary Tree
class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }

        int left = maxDepth(root->left);
        int right = maxDepth(root->right);

        return 1 + max(left, right);
    }
};
// Leetcode Problem Number: 101. Symmetric Tree
class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if (root == nullptr) return true;
        return isMirror(root->left, root->right);
    }

    bool isMirror(TreeNode* rootleft, TreeNode* rootright) {
        // both null
        if (rootleft == nullptr && rootright == nullptr) {
            return true;
        }

        // one is null
        if (rootleft == nullptr || rootright == nullptr) {
            return false;
        }

        // value mismatch
        if (rootleft->val != rootright->val) {
            return false;
        }

        // recursive check
        if (!isMirror(rootleft->left, rootright->right)) {
            return false;
        }

        if (!isMirror(rootleft->right, rootright->left)) {
            return false;
        }

        return true;
    }
};