import java.util.Stack;

public class leet_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   
    Stack<Integer> st1;
    Stack<Integer> st2;
    public leet_155() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(!st2.isEmpty() && val <= st2.peek())
        {
            st2.push(val);
            st1.push(val);
        }
        else if(st2.isEmpty())
        {
            st2.push(val);
            st1.push(val);
        }
        else
            st1.push(val);
    }
    
    public void pop() {
        if(!st1.isEmpty())
        {
            int val = st1.pop();
            if(val == st2.peek())
            {
                st2.pop();
            }
        }
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}
