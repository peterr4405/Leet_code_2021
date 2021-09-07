import java.util.ArrayList;
import java.util.List;

public class leet_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		permute(nums);
	}
    public static List<List<Integer>> permute(int[] nums) {
        
    	List<List<Integer>> result = new ArrayList<>();
    	Permutations(result,new ArrayList<Integer>(),nums,new boolean[nums.length]);
    	
    	return result;
    }
    
    public static void Permutations(List<List<Integer>> result ,List<Integer> list,int[] nums
    		,boolean [] visited) {
    	if(list.size() == nums.length) {
    		result.add(new ArrayList<>(list));
    		return;
    	}
    	for(int i=0;i<nums.length;i++) {
    		
    		if(visited[i]) {
    			continue;
    		}
    		list.add(nums[i]);
    		visited[i] = true;
    		Permutations(result,list,nums,visited);
    		list.remove(list.size()-1);
    		visited[i] = false;
    	}
    	
    }
}
