import java.util.Stack;

public class leet_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static String simplifyPath(String path) {
     
    	Stack<String> stack = new Stack<String>();
    	String[] arr = path.split("/");
    	
    	for(int i=0;i<arr.length;i++) {
    		String tmp = arr[i].trim();
    		if(tmp == null || tmp.length() ==0 || tmp.equals(".")) {
    			continue;
    		}
    		if(tmp.equals("..")) {
    			if(!stack.isEmpty()) {
    				stack.pop();
    			}
    		}else {
    			stack.push(tmp);
    		}
    		
    	}
    	String res = "";
    	while(!stack.isEmpty()) {
    		res = "/" + stack.pop() + res;
    	}
    	
    	return res.length() == 0? "/" : res; 
    }

}
