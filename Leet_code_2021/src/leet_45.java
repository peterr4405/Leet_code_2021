
public class leet_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));
	}

    public static int jump(int[] nums) {
    	
    	int max =0;
    	int curMax = 0;
    	int res =0;
    	
    	for(int i=0;i<nums.length-1;i++) {
    		max = Math.max(max, nums[i]+i);
    		if(curMax == i) {
    			res++;
    			curMax = max;
    		}
    	}
    	
    	return res;
    }
}
