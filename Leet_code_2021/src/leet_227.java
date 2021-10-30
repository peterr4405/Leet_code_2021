import java.util.Stack;

public class leet_227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3+2*2";
		calculate(s);
	}

	public static int calculate(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack();
		int cur = 0;
		char sign = '+';
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				cur = cur * 10 + s.charAt(i) - '0';
			}

			if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i ==s.length()-1) {

				if (sign == '+') {
					stack.push(cur);
				} else if (sign == '-') {
					stack.push(-cur);
				} else if (sign == '*') {
					stack.push(stack.pop() * cur);
				} else if (sign == '/') {
					stack.push(stack.pop() / cur);
				}
				sign = s.charAt(i);
				cur = 0;
			}
		}

		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}
}
