public class min_max_array {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 2, 3, 12, 15, 3, 6};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}