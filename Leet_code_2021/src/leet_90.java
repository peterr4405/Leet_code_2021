import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,2};
		subsetsWithDup(nums);
		
		
	}
	
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        
    	List<List<Integer>> res = new ArrayList<>();
    	Arrays.sort(nums);
    	backtracking(res,nums,new ArrayList<Integer>(),0);
    	
    	return res;
    }

    public static void backtracking(List<List<Integer>>res, int[] nums,List<Integer> cur, int begin  ) {
    	

    		res.add(new ArrayList<Integer>(cur));

    	
    	
    	for(int i =begin;i<nums.length;i++) {
    		if(i != begin && nums[i] == nums[i-1]) {
    			continue;
    		}
    		cur.add(nums[i]);
    		backtracking(res,nums,cur,i+1);
    		cur.remove(cur.size()-1);
    		
    	}
    	
    }
}
