import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;



public class leet_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generateParenthesis(3));
		
	}

	
    public static List<String> generateParenthesis(int n) {
        
    	List<String> result = new ArrayList<>();
    	BackStrack(result, "", 0, 0, n);
    	
    	return result ;
    }
    
    public static void BackStrack(List<String> out_arr , String current_string , int open,int close, int max ) {
    	
    	if(current_string.length() == max*2) {
    		out_arr.add(current_string);
    	}
    	
    	if(open < max) BackStrack(out_arr, current_string+"(", open+1, close, max);
    	if(close < open)BackStrack(out_arr, current_string+")", open, close+1, max);
    }
    
}
