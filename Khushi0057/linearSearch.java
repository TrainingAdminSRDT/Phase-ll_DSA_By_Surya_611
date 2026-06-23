import java.util.Scanner;
class linearSearch{

    
    static int Linear(int[] arr ,int target){      // static means=This belongs to the class, not to any object


        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return 1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {            // void means this method does not return anything
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array size");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target=sc.nextInt();

        int x=Linear(arr, target);
        if(x==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found");
        }
    }

}