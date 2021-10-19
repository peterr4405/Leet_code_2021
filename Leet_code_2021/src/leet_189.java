
public class leet_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {1,2,3,4,5,6,7};
			int k = 4;
			rotate(nums,k);
			
	}
	
    public static void rotate(int[] nums, int k) {
    	
    	k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
	
	 public static void reverse(int[] nums,int left,int right){
	       while(left < right) {
		 	int tmp = nums[left];
	        nums[left] = nums[right];
	        nums[right] = tmp;
	        left++;
	        right--;
	       }
	    }
}
