import java.util.Arrays;
public class ValidAnagram {
    public static void main(String[] args) {
        String str = "Ali";
        String t ="ik";
        str = str.toLowerCase();
        t = t.toLowerCase();


        if (str.length() != t.length()) {
            System.out.println("Not an anagram");
            return;
        }


        char[] char1 = str.toCharArray();
        char[] char2 = t.toCharArray();


        Arrays.sort(char1);
        Arrays.sort(char2);


        if (Arrays.equals(char1, char2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }

    }
}
