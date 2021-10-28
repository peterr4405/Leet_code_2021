import java.util.HashMap;
import java.util.Map;

public class leet_219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
               int tmp = Math.abs(i-map.get(nums[i]));
                if(k >= tmp){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        
        return false;
    }
}
