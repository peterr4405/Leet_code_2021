import java.util.ArrayList;
import java.util.List;

public class leet_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "25525511135";
		restoreIpAddresses(s);
	}

    public static List<String> restoreIpAddresses(String s) {
        
    	
    	List<String> res = new ArrayList<>();
    	backstracking(res, 0, s, "");
    	
    	return res;
    }
    
    public static void backstracking(List<String> res,int index,String s , String sub) {
    	if(index == 4 || s.length() ==0) {
    		if(index == 4 && s.length() ==0) {
    			res.add(sub.substring(0,sub.length()-1));
    		}
    		return;
    	}
    	
    	backstracking(res, index+1, s.substring(1), sub+s.substring(0,1)+".");
    	if(s.length()>1 && s.charAt(0) !='0') {
    		backstracking(res, index+1, s.substring(2), sub+s.substring(0,2)+".");
    		if(s.length()>2 && Integer.valueOf(s.substring(0,3) ) <=255 ) {
    			backstracking(res, index+1, s.substring(3), sub+s.substring(0,3)+".");
    		}
    	}
    	
    }
    
}
