
public class leet_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,4,6,5,3};
		nextPermutation(nums);

		
	}
	

   public static boolean check(String s , int l,int r){
       
              
       while(l>=0 && r<=s.length() ){
           
           if(s.charAt(l) == s.charAt(r) ){
               l--;
               r++;
           }else{
               return false;
           }
           
       }
       return true;
   }
	
    public static  void nextPermutation(int[] nums) {
        
    	if(nums.length ==0  || nums == null)return ;
    	
    	int i = nums.length-2;
    	
    	while(i>=0 && nums[i+1] <=nums[i] ) {
    		i--;
    	}
    	if(i>=0) {
    		int j = nums.length-1;
    		while(j>=0 && nums[j] <= nums[i] ) {
    			j--;
    		}
    	swap(nums,i,j);
    	}
    	reverse(nums,i+1 ,nums.length -1);
    	
    }

    public static void swap (int[] nums,int i,int j) {
    	
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    	
    }
    
    public static void reverse (int[] nums,int i ,int j) {
    	while(i<j){
    		swap(nums, i++, j--);
    	}
    }
    
}
