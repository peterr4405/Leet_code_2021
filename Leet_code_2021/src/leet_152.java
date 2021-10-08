
public class leet_152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        
        for(int i =1;i<nums.length;i++){
            int curMin = Math.min(Math.min(nums[i] * min,nums[i] * max),nums[i]);
            int curMax = Math.max(Math.max(nums[i] * min,nums[i] * max),nums[i]);
            min = curMin;
            max = curMax;
            res = Math.max(res,max);
            
        }
        return res;
    }
}
