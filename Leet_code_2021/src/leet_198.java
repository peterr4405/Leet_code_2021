
public class leet_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] n = {1,2,3,1};
			rob(n);
	}
	public static int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i =1;i<nums.length;i++){
            dp[i+1] = Math.max(dp[i],nums[i]+dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
