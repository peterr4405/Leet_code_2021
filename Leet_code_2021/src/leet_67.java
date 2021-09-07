
public class leet_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二進制 binary
		
		String a = "11",b="1";
		System.out.print(addBinary(a,b));
		
	}

    public static String addBinary(String a, String b) {
        
    	int la = a.length()-1;
    	int lb = b.length()-1;
    	StringBuilder sb = new StringBuilder();
    	int count = 0;
    	
    	while(lb>=0 || la >=0) {
    		int sum = count; 
    		if(la>=0) {
    			sum+= (a.charAt(la)-'0');	
    		}
    		if(lb>=0) {
    			sum+= (b.charAt(lb)-'0');	
    		}
    		sb.append(sum%2);
    		count = sum/2;
    		la--;
    		lb--;
    	}
    	
    	if(count !=0) {
    	sb.append(count);	
    	}
    	return sb.reverse().toString();
    }
	
}
