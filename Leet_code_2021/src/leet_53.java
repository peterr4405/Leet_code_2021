
public class leet_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1};
		System.out.println(maxSubArray(nums));
	}

    public static int maxSubArray(int[] nums) {
    	int res= Integer.MIN_VALUE;
    	int sum =0;
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		sum+= nums[i];
    		if(res<sum) {
    			res = sum;
    		}
    		if(sum < 0) {
    			sum = 0;
    		}
    	}
    	return res;
    }
    
}
