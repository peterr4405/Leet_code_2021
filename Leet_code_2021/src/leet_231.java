
public class leet_231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPowerOfTwo(int n) {

		if (n != 1 && n % 2 != 0) {
			return false;
		}

		for (int i = 0; i < n; i++) {

			int tmp = (int) Math.pow(2, i);
			if (tmp == n) {
				return true;
			} else if (tmp > n) {
				return false;
			}
		}

		return false;
	}
}
