//leetcode=1295. Find Numbers with Even Number of Digits
public class EvenLinearElements{

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            int c = 0;

            while (s != 0) {
                s = s / 10;
                c++;
            }

            if (c % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        EvenLinearElements obj = new EvenLinearElements();

        int[] nums = {12, 345, 2, 6, 7896};

        int result = obj.findNumbers(nums);

        System.out.println("Count of numbers with even number of digits: " + result);
    }
}