public class reverse_a_number {
    
    // Method to reverse a number
    static int reverseNumber(int num) {
        int reversed = 0;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        
        return reversed;
    }
    
    public static void main(String[] args) {
        int n = 125;
        
        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + reverseNumber(n));
    }
}