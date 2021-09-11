import java.util.HashMap;
import java.util.Map;

public class leet_97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 ="aadbbcbcac";
		
		System.out.print(isInterleave(s1,s2,s3));
	}
	
    public static boolean isInterleave(String s1, String s2, String s3) {
     
    	if(s1 ==null || s2 == null || s3 ==null) {
    		return false;
    	}
    	if(s1.length()+s2.length() != s3.length() ) {
    		return false;
    	}
    	boolean[][] match = new boolean[s1.length()+1][s2.length()+1];
    	match[0][0] = true;
    	
    	for(int i=0;i<s1.length()+s2.length();i++) {
    		for(int s1_len = 0;s1_len<=i+1 && s1_len <= s1.length();s1_len++) {
    			int s2_len = i+1-s1_len;
    			if(s2_len> s2.length()) {
    				continue;
    			}
    			if((s2_len>0 && match[s1_len][s2_len-1] && s3.charAt(i) == s2.charAt(s2_len-1))
    					|| (s1_len >0 && match[s1_len-1][s2_len] && s3.charAt(i) == s1.charAt(s1_len-1)) ) {
    				match[s1_len][s2_len] =  true;
    			}
    		}
    	}
    	
    	
    	return match[s1.length()][s2.length()];
    }
    

}
