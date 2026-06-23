/*1672. Richest Customer Wealth =leetcode
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,3]]
Output: 8
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 3 = 8
so return 8 */

class RichestLS2 {

    public int maximumWealth(int[][] accounts) {
        int n = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > n) {
                n = sum;
            }

            sum = 0;
        }

        return n;
    }

    public static void main(String[] args) {
        RichestLS2 obj = new RichestLS2();

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };

        int result = obj.maximumWealth(accounts);

        System.out.println("Maximum Wealth: " + result);
    }
}
