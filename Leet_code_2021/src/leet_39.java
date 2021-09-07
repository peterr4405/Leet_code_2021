import java.util.ArrayList;
import java.util.List;

public class leet_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;

		combinationSum(candidates, target);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> result = new ArrayList();

		backTrack(result, new ArrayList(), candidates, target, 0, 0);

		return result;

	}

	public static void backTrack(List<List<Integer>> result, List<Integer> combination, int[] candidates, int target,
			int sum, int start) {
		if (sum == target) {
			result.add(new ArrayList(combination));
		} else if (sum < target) {
			for (int i = start; i < candidates.length; ++i) {
				combination.add(candidates[i]);
				backTrack(result, combination, candidates, target, sum + candidates[i], i);
				combination.remove(combination.size() - 1);
			}
		}

	}

}
