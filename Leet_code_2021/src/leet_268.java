import java.util.Arrays;

public class leet_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0; i< nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    /*
    public static int missingNumber(int[] nums) {
        int tmp =nums.length;
         for(int i=0;i<nums.length;i++){
             tmp ^=i;
             tmp ^=nums[i];
         }

         return tmp;
     }
     */
}
