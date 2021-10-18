import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leet_187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="AAAAAAAAAAA";
		findRepeatedDnaSequences(s);
		
	}
	  public static List<String> findRepeatedDnaSequences(String s) {
	        Set<String> res = new HashSet();
	        Set<String>seen = new HashSet();
	        
	        for(int i=0;i<s.length();i++){
	            while(i+10 <= s.length()){
	                String tmp = s.substring(i,i+10);
	                if(!seen.add(tmp)){
	                    res.add(tmp);
	                }
	                i++;
	            }
	        }
	        return new ArrayList<String>(res);
	    }
}
