//2090 = First Approach =O(n^2)
/* 
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int b[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i < k || i > (nums.length - k - 1)) {
                b[i] = -1;
            } 
            else {
                long sum = 0;

                for (int j = i - k; j <= i + k; j++) {
                    sum = sum + nums[j];
                }

                b[i] = (int)(sum / ((2 * k) + 1));
            }
        }

        return b;
    }
}

*/

//Second Approach

import java.util.Arrays;

public class K_Radius_Subarray_Average {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;

        int[] ans = obj.getAverages(nums, k);

        System.out.println(Arrays.toString(ans));
    }
}

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int b[] = new int[nums.length];
        Arrays.fill(b, -1);

        long s = 0;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];

            if (i >= k * 2) {
                b[i - k] = (int)(s / (k * 2 + 1));
                s -= nums[i - k * 2];
            }
        }

        return b;
    }
}

