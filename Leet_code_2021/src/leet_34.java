
public class leet_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {5,7,7,8,8,10};
		int target = 8;
		
		int [] result = searchRange(nums,target);
		for(int j =0;j<result.length;j++) {
			System.out.println(result[j]);
		}
	}
	
    public static int[] searchRange(int[] nums, int target) {
        
    	int[] result = new int[2];
    	for(int i =0;i<result.length;i++) {
    		result[i] = -1;
    	}
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		if(nums[i] == target) {
    			result[0] = i;
    			while(i<nums.length && nums[i] == target ) {
    				i++;
    			}
    			result[1] = i-1;
    		}
    		
    	}
    	
    	
    	return result;
    }

}
