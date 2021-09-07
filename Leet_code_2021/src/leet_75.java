
public class leet_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,0,2,1,1,0};
 		sortColors(nums);
	}

    public static void sortColors(int[] nums) {
        
    	if(nums.length ==0 ||nums == null ) return ;
    	int one = -1;
    	int two = nums.length;
    	int i =0;
    	while(i<two) {
    		if(nums[i] == 1) {
    			i++;
    		}else if (nums[i] == 2) {
    			two --;
    			swap(nums,i,two);
    		}else {//0
    			one ++;
    			swap(nums,i,one);
    			i++;
    		}
    		
    	}
    	
    }
    
    public static void swap(int[] nums,int i,int j) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
}
