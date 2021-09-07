import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leet_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		combinationSum2(candidates, target);
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		 	Arrays.sort(candidates);
	        Set<List<Integer>> result = new HashSet();
	        backtracking(result, candidates, target, 0, new ArrayList());
	        return new ArrayList(result);
	}

	public static void backtracking(Set<List<Integer>> result, int[] candidates, int target, int startIdx, List<Integer> temp)
    {
        if(target < 0) return;
        else if(target == 0) result.add(new ArrayList(temp));
        else
        {
            int prev = -1;
            for(int i = startIdx; i < candidates.length ; i++ )
            {
                if(prev != candidates[i])
                {
                    temp.add(candidates[i]);
                    backtracking(result, candidates, target - candidates[i], i+1, temp);
                    temp.remove(temp.size() - 1);
                }
                
                prev = candidates[i];
            }
        }
                
    }

}
