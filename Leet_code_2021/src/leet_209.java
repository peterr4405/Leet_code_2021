
public class leet_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int minSubArrayLen(int target, int[] nums) {
	        
	        int sum = 0;
	        int begin = 0;
	        int min = Integer.MAX_VALUE;
	        
	        for(int i=0;i<nums.length;i++){
	          sum += nums[i];  
	          while(sum > target ){
	              min = Math.min(min,i-begin+1);
	              sum -= nums[begin];
	              begin++;
	          }
	            if(sum == target){
	                min = Math.min(min,i-begin+1);
	            }
	            
	        }
	        return min == Integer.MAX_VALUE ? 0 : min;
	    }
}
