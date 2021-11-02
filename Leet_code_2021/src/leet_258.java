
public class leet_258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int addDigits(int num) {

		int tmp = 0;
		while (num >= 10) {

			tmp += num % 10;
			num /= 10;
			if (num < 10 || tmp >= 10) {
				num += tmp;
				tmp = 0;
			}

		}
		return num;
	}
}
