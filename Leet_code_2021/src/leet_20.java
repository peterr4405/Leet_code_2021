import java.util.Stack;

public class leet_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = ")(";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (stack.isEmpty()) {
				return false;
			}else if (c == ')') {
				char tmp = stack.pop();
				if(tmp != '(') {
					return false;
				}
			}else if (c == ']') {
				char tmp = stack.pop();
				if(tmp != '[') {
					return false;
				}
			}else if (c == '}') {
				char tmp = stack.pop();
				if(tmp != '{') {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
}
