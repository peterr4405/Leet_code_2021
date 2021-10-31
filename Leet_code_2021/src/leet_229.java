import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet_229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,3};
		majorityElement(nums);
	}
	  public static List<Integer> majorityElement(int[] nums) {
	        
	        List<Integer> res = new ArrayList();
	        int sign = nums.length/3;
	        Map<Integer,Integer> map = new HashMap();
	        
	        for(int n : nums){
	            map.put(n,map.getOrDefault(n,0)+1);
	        }
	        
	        for(Integer key : map.keySet()){
	            int val = map.get(key);
	            if(val > sign){
	                res.add(key);
	            }
	            
	        }
	        return res;
	    }
}
