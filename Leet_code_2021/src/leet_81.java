
public class leet_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {2,5,6,0,0,1,2};
		int target = 3;
		System.out.print(search(nums, target));
	}

    public static boolean search(int[] nums, int target) {
        
    	if(nums.length == 0 ) {
    		return false;
    	}
    	int left = 0,right = nums.length-1;
    	
    	while(left <= right) {
    		
    		if(nums[left] == target || nums[right] == target) {
    			return true;
    		}
    		left++;
    		right--;
    	}
    	
    	return false;
    }
}
