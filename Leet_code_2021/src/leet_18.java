import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_18 {

	public static void main(String[] args) {

		int []nums =  {-2,-1,-1,1,1,2,2};
		int tar = 0;
		
		List<List<Integer>> result = fourSum(nums,tar);

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);

		if (nums.length < 4) {
			return result;
		}

		for (int i = 0; i < nums.length - 3; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int newTarget = target - nums[i];

			for (int j = i + 1; j < nums.length - 2; j++) {

				if (j != i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				
				int TmpTarget = newTarget - nums[j];


				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {

					if (left != j + 1 && nums[left] == nums[left - 1]) {
						left++;
						continue;
					}
					if (right != nums.length - 1 && nums[right] == nums[right + 1]) {
						right--;
						continue;
					}

					if (nums[left] + nums[right] == TmpTarget) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left ++;
						right --;
					} else if (nums[left] + nums[right] < TmpTarget) {
						left++;
					} else {
						right--;
					}

				}

			}

		}

		return result;

	}
}
