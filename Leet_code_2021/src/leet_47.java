import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>(); 
    	if(nums.length<1) return resList;
    	Arrays.sort(nums);
    	permute(resList,new ArrayList<Integer>(),nums,new boolean[nums.length]);
    	
    	return resList;
    }
    
    public static void permute(List<List<Integer>> resList,List<Integer> list,int[]nums,
    		boolean[] isvisted) {
    	
    	if(list.size() == nums.length) {
    		resList.add(new ArrayList<>(list));
    		return;
    	}
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		if(isvisted[i]) {
    			continue;
    		}
    		if(i>0 && nums[i] == nums[i-1] && !isvisted[i-1]) {
    			continue;
    		}
    		
    		list.add(nums[i]);
    		isvisted[i] =true;
    		permute(resList,list,nums,isvisted);
    		list.remove(list.size()-1);
    		isvisted[i] = false;
    	}
    }
}
