
public class leet_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
		
	}

    public static int  lengthOfLastWord(String s) {
        
    	s =s.trim();
    	char[] c = s.toCharArray();
    	int res = 0;
    	
    	
    	for(char ch : c) {
    		
    		if(ch !=' ') {
    			res++;
    		}else if (ch == ' '  ) {
    			res = 0;
    		}
    	}
    	
    	return res;
    }
    
}
