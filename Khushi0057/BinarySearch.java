//Order agnostic Binary Search

public class BinarySearch {

    public static int Binary(int arr[], int t) {

        int mid, start, end;

        start = 0;
        end = arr.length - 1;
        if (arr[0] < arr[arr.length - 1]) {
            while (start <= end) {
                mid = (start + end) / 2;
                if (t < arr[mid]) { 

                    end = mid - 1;
                } else if (t > arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;

                }
            }
        } else {
            while (start <= end) {
                mid = (start + end) / 2;
                if (t > arr[mid]) {

                    end = mid - 1;
                } else if (t < arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;

                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8,7,6,5,4,3,2,1};
        int target = 11;
        int n = Binary(arr, target);
        if (n == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at" + n);
        }
    }
}