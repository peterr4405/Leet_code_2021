import java.util.HashMap;
import java.util.Map;

public class leet_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int majorityElement(int[] nums) {
	        Map<Integer,Integer> map = new HashMap();
	        for(int i : nums){
	            map.put(i, map.getOrDefault(i,0)+1);
	        }
	        
	       Map.Entry<Integer, Integer> maxEntry = null;
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
	                maxEntry = entry;
	            }
	        }
	        return maxEntry.getKey();
	        
	    }
}
