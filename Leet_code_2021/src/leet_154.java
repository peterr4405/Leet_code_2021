
public class leet_154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,2,4,6,0,7};
		findMin(nums);
		
	}
	 public static int findMin(int[] nums) {
	        
	        int left=0;
	        int right = nums.length-1;
	        while(left < right){
	            
	            int mid = (left+right)/2;
	            if(nums[mid] < nums[right]){
	                right = mid;
	            }else if (nums[mid] > nums[right]){
	                left = mid +1;
	            }else{
	                right --;
	            }
	            
	        }
	        return nums[left];
	    }
}
