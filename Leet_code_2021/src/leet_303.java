
public class leet_303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static int num[];
	    public  leet_303(int[] nums) {
	        this.num = nums;
	    }
	    
	    public static int sumRange(int left, int right) {
	        
	        int sum =0;
	        
	        while(left <= right){
	            sum +=num[left++];
	            
	        }
	        return sum;
	    }
}
