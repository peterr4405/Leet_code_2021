import java.util.Arrays;

public class leet_26 {

	public static void main(String[]args) {
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		
	}
	
    public static int removeDuplicates(int[] nums) {
     
    	if(nums.length == 0) {
    		return 0;
    	}
    	int count = 1;
    	
    	Arrays.sort(nums);
    	for(int i =1;i<nums.length;i++) {
    		if(nums[i] == nums[i-1]) {
    			continue;
    		}
    		nums[count++] = nums[i];
    		
    	}
    	
    	
    	return count;
    }
}
