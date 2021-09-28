import java.util.HashMap;
import java.util.Map;

public class leet_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] nums = {1,2,2};
		System.out.println(singleNumber(nums));
	}

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0) + 1);
        }
        for(int j : map.keySet()){
            if(map.get(j) == 1){
                return j;
            }
        }
        return -1;
    }
}
