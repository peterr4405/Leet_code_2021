
public class leet_260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,2,3,1,5};
		singleNumber(nums);
	}

	public static int[] singleNumber(int[] nums) {

		int tmp = 0;
		int[] res = new int[2];

		for (int n : nums) {
			tmp ^= n;
		}
		int idx = tmp & -tmp;

		for (int n : nums) {
			if ((idx & n) == 0) {
				res[0] ^= n;
			} else {
				res[1] ^= n;
			}
		}
		return res;
	}
}
