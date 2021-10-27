import java.util.Arrays;

public class leet_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
