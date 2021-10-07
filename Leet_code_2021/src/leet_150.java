import java.util.Stack;

public class leet_150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(s.equals("-")){
                int b= stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if (s.equals("/")){
                int b= stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
