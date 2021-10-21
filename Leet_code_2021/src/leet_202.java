
public class leet_202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isHappy(int n) {

		while (n >= 10) {
			n = helper(n);
		}
		if (n == 1 || n == 7) {
			return true;
		}
		return false;
	}

	public static int helper(int n) {
		if (n <= 0) {
			return 0;
		}

		return (n % 10) * (n % 10) + (int) helper(n / 10);
	}
}
