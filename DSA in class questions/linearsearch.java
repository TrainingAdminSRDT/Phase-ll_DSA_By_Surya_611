public class linearsearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}