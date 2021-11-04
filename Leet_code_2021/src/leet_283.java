
public class leet_283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int idx =0;
        
        for(int n : nums){
            if(n !=0){
                nums[idx++] = n;
            }
        }
        while(idx <= nums.length-1){
            nums[idx++] = 0;
        }
    }
}
