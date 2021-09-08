import java.util.HashMap;
import java.util.Map;

public class leet_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
	}

    public static int removeDuplicates(int[] nums) {
        
    	int p = 2;
    	for(int i= 2;i<nums.length;i++ ) {
    		if(nums[i] !=nums[p-2]) {
    			nums[p++] = nums[i];
    		}
    	}
    	return p;
    }
    

    
}
