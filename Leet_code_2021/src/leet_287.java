import java.util.HashSet;
import java.util.Set;

public class leet_287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int findDuplicate(int[] nums) {
	     
	        Set<Integer> set = new HashSet();
	        
	        for(int n : nums){
	            if(set.contains(n)){
	                return n;
	            }else{
	                set.add(n);
	            }
	        }
	        return -1;
	    }
}
