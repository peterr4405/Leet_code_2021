import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet_442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        List<Integer> res = new ArrayList();
        if(nums.length < 2) return res;
        for(int i : nums){
            if(map.containsKey(i)){
                res.add(i);
            }
            map.put(i,1);
        }
        return res;
    }
}
