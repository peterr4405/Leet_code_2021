import java.util.HashMap;
import java.util.Map;

public class leet_299 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getHint("1123","0111");
	}
	   public static String getHint(String secret, String guess) {
	        
		   if(secret.length() != guess.length()){
	            return "";
	        }
	        int A_count = 0;
	        int B_count = 0;
	        
	        Map<Character,Integer>map = new HashMap();
	        
	        for(int i=0 ; i<secret.length() ; i++ ){
	            if(secret.charAt(i) == guess.charAt(i) ){
	                A_count++;
	            }else {
	            	map.put(secret.charAt(i),map.getOrDefault(secret.charAt(i),0)+1);	
	            }
	            
	        }
	        
	        for(int j = 0; j < guess.length(); j++ ) {
	        	if(map.getOrDefault(guess.charAt(j),-1) >0 && guess.charAt(j) != secret.charAt(j)) {
                   map.put(guess.charAt(j),map.get(guess.charAt(j))-1);
	        		B_count++;
                   
	        	}
	        }
	        
	        return A_count+"A"+B_count+"B";
	    }
}
