
public class leet_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,0,0};
		System.out.println(canJump(nums));
	}
	
    public static boolean canJump(int[] nums) {
        
    	int begin = nums[0];
    	if(nums.length == 1) {
    		return true;
    	}
    	
    	for(int i=0;i<=begin;i++) {
    		
    		if(begin >= nums.length-1) {
    			return true;
    		}
    		if(begin < (i+nums[i]) ) {
    			begin = i+nums[i];
    		}
    	}
    	
    	
    	return false;
    }

}
