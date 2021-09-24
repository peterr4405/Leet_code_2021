import java.util.ArrayList;
import java.util.List;

public class leet_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aab";
		partition(s);
		
	}

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
    	if(s.length()==0) return res; 
    	
    	helper(res, new ArrayList(), 0, s);
    	return res;
    }
    
    public static void helper(List<List<String>> res, List<String> cur,int begin,String s ) {
    	if(begin == s.length()) {
    		res.add(new ArrayList(cur));
    		return;
    	}
    	for(int i = begin ;i<s.length();i++) {
    		if(isPalindrome(s,begin,i)) {
    			cur.add(s.substring(begin,i+1));
    			helper(res, cur, i+1, s);
    			cur.remove(cur.size()-1);
    		}
    	}
    	
    	
    }
    
    public static boolean isPalindrome( String s,int left,int right ) {
    	while(left<=right) {
    		if(s.charAt(left) != s.charAt(right)) {
    			return false;
    		}
    		left++;
    		right--;
    	}
    	return true;
    } 
    
    
}
