import java.util.HashMap;

public class leet_205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean isIsomorphic(String s, String t) {
	        
	        if(s == null || t == null){
	            return true;
	        }
	        HashMap<Character,Character> map = new HashMap();
	        
	        for(int i=0;i<s.length();i++){
	            char sc = s.charAt(i);
	            char st = t.charAt(i);
	            
	            if(map.containsKey(sc)){
	                if(map.get(sc) != st){
	                    return false;
	                }
	            }else{
	                if(map.containsValue(st)){
	                    return false;
	                }
	                map.put(sc,st);
	            }
	            
	        }
	     return true;   
	    }
}
