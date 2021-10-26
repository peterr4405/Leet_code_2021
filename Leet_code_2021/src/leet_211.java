import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leet_211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			leet_211 leet = new leet_211();
			leet_211.addWord("bad");
			leet_211.addWord("dad");
			leet_211.addWord("mad");
			
			System.out.println(leet_211.search("pad"));
			System.out.println(leet_211.search("bad"));
			System.out.println(leet_211.search(".ad"));
			System.out.println(leet_211.search("b.."));
			
	}
	  static Set<String> set;
	    
	    public  leet_211() {
	        set = new HashSet();
	    }
	    
	    public static void addWord(String word) {
	        
	        set.add(word);
	        
	    }
	    
	    public static boolean search(String word) {
	        
	    	ArrayList<String> list = new ArrayList<>();
	    	for(String string : set) {
	    		list.add(string);
	    	}
	    	
	    	list.sort(Comparator.naturalOrder());
	       
	       for(String s : list){
	         
	           if(s.length() != word.length()){
	                continue;
	            }
	          if(s.charAt(0) > word.charAt(0) && word.charAt(0) !='.' ) {
	        	  return false;
	          } 
	           
	   loop:        for(int i=0;i<s.length();i++){
	               
	               if(s.charAt(i) == word.charAt(i) || word.charAt(i) =='.' ){
	                   if(i == s.length()-1){
	                       return true;
	                   }
	               }
	                   if(word.charAt(i) == '.') {
	                	   continue;
	                   }
	                   
	                   if(s.charAt(i) != word.charAt(i)  ){
	                       break loop;
	                   }
	               
	               
	           }
	       } 
	        return false;
	    }
}
