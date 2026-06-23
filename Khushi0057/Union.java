/*You are given two arrays a[] and b[], return the Union of both the arrays in any order.
The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.
Note: Elements of a[] and b[] are not necessarily distinct.
Note that, You can return the Union in any order but the driver code will print the result in sorted order only. */

/* 
import java.util.*;
public class Union {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            boolean found=false;
            for(int j=0;j<result.size();j++)
            {
                if(a[i]==result.get(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                result.add(a[i]);
            }
        }
        
        for(int i=0;i<b.length;i++){
            boolean found=false;
            for(int j=0;j<result.size();j++)
            {
                if(b[i]==result.get(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                result.add(b[i]);
            }
        }
        return result;
        
    }
    public static void main(String[args]){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int b[]=new int[m];
    for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
    }

    ArrayList<Integer> union =findUnion(a, b);
    
    for(int num:union){
        System.out.println(num+" ");
    }
}
}
*/

//simple way is to use HashSet
import java.util.*;
public class Union {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set <Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(set);   
        /* ArrayList<Integer> list → Declares a variable list of type ArrayList<Integer>.
           new ArrayList<>(set) → Calls the ArrayList constructor that takes a Collection (like Set, List, etc.). */
        return list;
    }

    public static void main(String[] args) {
        int[] a={7,1,2,3,4,5};
        int b[]={7,3,4,2,5};

        ArrayList<Integer> union=findUnion(a, b);
        System.out.println(union);
    }
}

//HashSet stores elements using a hash table.For small integers, the hash value is close to the number itself, so elements often get placed in buckets in a way that looks sorted.