import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class leet_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums =  {3,2,2,3,4,1};
		int v = 3;
		removeElement(nums, v);
		
	}

    public static int removeElement(int[] nums, int val) {
     
    	Arrays.sort(nums);
    	
    	int result = 0;
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		if(nums[i] == val) {
    			continue;
    		}

    		nums[result++] = nums[i];
    	}
    	
    	
    	
    	return result;
    }
}
