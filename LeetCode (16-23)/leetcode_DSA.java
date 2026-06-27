//question 7 reverse an integer

class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int temp = x;

        while (temp != 0) {
            int digit = temp % 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
               (reverse == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            if (reverse < Integer.MIN_VALUE / 10 ||
               (reverse == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return reverse;
    }
}

//question 136 single number

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num: nums){
            result ^=num;
        }
        return result;
    }   

}

// question 169 majority element

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;

        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;

    }
}

// question 268 missing number

class Solution {
    public int missingNumber(int[] nums) {
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor ^= i ^ nums[i];
        }
        return xor;
    }

}

// question 26 remove duplicates from sorted array 

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] !=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

//question 283 move zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int inserpos=0;
        for(int num :nums){
            if(num!=0){
                nums[inserpos++]=num;

            }
        }
        while(inserpos<nums.length){
            nums[inserpos++]=0;
        }
    }
}

//question 88 sorted arrays

class Solution {
    public void moveZeroes(int[] nums) {
        int inserpos=0;
        for(int num :nums){
            if(num!=0){
                nums[inserpos++]=num;

            }
        }
        while(inserpos<nums.length){
            nums[inserpos++]=0;
        }
    }
}

//question 977 squares of a sorted array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i] * nums[i];

            }
            java.util.Arrays.sort(result);
            return result;
    }
    
}

//question 2090 k radius subarray averages

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        
        java.util.Arrays.fill(ans, -1);

        long sum = 0;
        int window = 2 * k + 1;

        if (window > n) return ans;

        for (int i = 0; i < window; i++) {
            sum += nums[i];
        }

        ans[k] = (int)(sum / window);

        for (int i = window; i < n; i++) {
            sum += nums[i] - nums[i - window];
            ans[i - k] = (int)(sum / window);
        }

        return ans;
    }
}

//question 1732 find the highest altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int maxalt=0;
        for (int g :gain){
            alt +=g;
            maxalt=Math.max(alt,maxalt);
        }
        return maxalt;
    }
}

//question 66 plus one

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;


            }
            digits[i]=0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

//question 35 search insertion position

class Solution {
    public int searchInsert(int[] nums, int target) {
         int left =0, right=nums.length-1;
         while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
         }
         return left;
    }
}

//question 367 valid perfect square

class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

//question 56 merge intervals

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] =
                    Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}

//question 242 valid anagram

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

// question 58 length of last word

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}

//question 125 valid palindrome

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
} 

//question 709 to lower case

class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr);
    }
}

//question 160 intersection of two linked list

class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr);
    }
}

//question 141 linked list cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

//question 206 reverse linked list

class Solution {
    public ListNode reverseList(ListNode head) {
           ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next; // save next node
            curr.next = prev;          // reverse link

            prev = curr;               // move prev
            curr = next;               // move curr
        }

        return prev;
    }
}

//question 876 middle of linked list

class Solution {
    public ListNode reverseList(ListNode head) {
           ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next; // save next node
            curr.next = prev;          // reverse link

            prev = curr;               // move prev
            curr = next;               // move curr
        }

        return prev;
    }
}

//question 21 merge of two sorted list

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}

//question 20 valid parenthesis

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

//question 204 maximum depth of binary tree

class Solution {
    public int maxDepth(TreeNode root) {
         if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}

//question 100 same tree

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}

//question 101 symmetric tree

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}

//question 222 count complete tree nodes

class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    private int getRightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}

//question 144 binary tree preorder traversal

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.val);      // Root
        preorder(node.left, result);  // Left
        preorder(node.right, result); // Right
    }
}

//question 94 binary tree inorder traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorder(node.left, result); //right
        result.add(node.val);      // Root
        inorder(node.right, result); // Right
    }
}

//question 154 binary tree postorder traversal

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postorder(node.left, result);  // Left
        postorder(node.right, result); // Right
        result.add(node.val);      // Root
    }
}

//question 700 search in a binary search tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }
}

//question 701 insert in a binary search tree

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}

//question 1791 find centre of star graph

class Solution {
    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }
        return edges[0][1];
    }
}