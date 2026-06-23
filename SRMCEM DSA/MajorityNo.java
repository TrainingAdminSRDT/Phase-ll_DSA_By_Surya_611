public class MajorityNo {
    public static void main(String[] args) {
        int[] nums ={3,2,3};
        int count =0;
        int m =0;
        for(int x : nums){
            if(count == 0){
                m=x;
                count = 1;
            }
            else{
//                count += m == x ? 1 : -1;
                if(m== x){
                    count = count+ 1;
                }
                else{
                    count = count -1;
                }
            }
        }
        System.out.println(m);
    }
}
// if m == x , counter = counter + 1 ,
//else counter = counter - 1