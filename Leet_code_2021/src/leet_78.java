import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leet_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,2,3};
	 	List<List<Integer>> resList = subsets(nums);
		
		for(List<Integer> rLists : resList) {
			for(Integer i : rLists ) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

    public static List<List<Integer>> subsets(int[] nums) {
        
    	List<List<Integer>> res = new ArrayList<>();
    	
    	cal(res,new ArrayList<Integer>(), nums,0);
    	
    	return res;
    }
    
    public static void cal(List<List<Integer>>res,List<Integer>list,int[]nums,int begin  ) {
    	
    	if(begin == nums.length) {
    		res.add(list);
    		return;
    	}
    	
    	List<Integer> extra = new ArrayList<Integer>(list);
    	extra.add(nums[begin]);
    	
    	cal(res, list, nums, begin+1);
    	cal(res, extra, nums, begin+1);
    }
    
}
