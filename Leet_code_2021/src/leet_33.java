
public class leet_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.println(search(nums,target));
		
	}
	
    public static int search(int[] nums, int target) {
        
    	int idx = Integer.MIN_VALUE;
    	
    	for(int i =0;i<nums.length;i++) {
    		if(nums[i] == target) {
    			idx = i;
    		}
    	}
    	
    	if(Integer.MIN_VALUE == idx) return -1;
    	rotated(nums,idx);
    	
    	return idx;
    }
    
    public static void rotated(int[] nums, int begin) {
    	
    	int [] tmp = new int[nums.length];
    	int count = 0;
    	
    	for(int j = begin ; j<nums.length;j++) {
    		tmp[count++] = nums[j];
    	}
    	for(int j = 0;j<begin ; j++) {
    		tmp[count++] = nums[j];
    	}
    	for(int j =0;j<nums.length;j++) {
    		nums[j] = tmp[j];
    	}
    }

}
