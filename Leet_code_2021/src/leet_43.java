import java.util.Arrays;

public class leet_43 {

	public static void main(String[] args) {
		int a= 5;
		System.out.println(multiply("12", "11"));
		System.out.println(a);
		System.out.println((char)a+'0');
		System.out.println((char)(a+'0'));
		
		
	}

	public static String multiply(String num1, String num2) {

		StringBuilder sb = new StringBuilder();
		int l1 = num1.length();
		int l2 = num2.length();

		char[] ch1 = num1.toCharArray();
		char[] ch2 = num2.toCharArray();
		char[] res = new char[l1 + l2];
		Arrays.fill(res, '0');

		for (int j = l2 - 1; j >= 0; j--) {
			for (int i = l1 - 1; i >= 0; i--) {
				int val = (ch1[i] - '0') * (ch2[j] - '0');
				int tmp = (res[i + j + 1] - '0') + val;
				res[i + j + 1] = (char) (tmp % 10 + '0');
				res[i + j] = (char) ((res[i + j] - '0' + tmp / 10) + '0');
			}

		}
		boolean seen = false;

		for (char c : res) {
			if (c == '0' && !seen) {
				continue;
			}
			sb.append(c);
			seen = true;
		}

		return sb.toString();
	}

}
