//9 test cases failed as it is increasing the int range when we do rev=rev*10 for large values
class Solution {
    public int reverse(int x) {
        int rev=0,t;
        while(x!=0){
        t=x%10;
         if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            }

            // Check for negative overflow
            if (rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
        rev=rev*10+t;
        x=x/10;

        
        }
        return rev;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.reverse(123));
    }
}