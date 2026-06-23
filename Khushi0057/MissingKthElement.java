/*1539. Kth Missing Positive Number (Leetcode)
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9. */

//O(n+k)=brute force solution
/* 
class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> num = new ArrayList<>();
        int missingCount=0;
        int j=1,i=0;
        
            while(missingCount<k){

                if(i<arr.length && arr[i]==j)
                {
                    i++;
                   
                }
               else
               {
                num.add(j);
                missingCount++;
               }
               j++;
            }
        return num.get(k-1); 
    }
}
*/

//second way using binary search=not understood
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + k;
    }
}