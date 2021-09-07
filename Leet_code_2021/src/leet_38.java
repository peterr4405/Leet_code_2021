
public class leet_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(4));
	}

    public static String countAndSay(int n) {
        
    	String str= "1";
    	
    	if(n ==1) return "1";
    	
    	for(int i=1;i<n;i++) {
    		int count = 0;
    		char pre = ',';
    		StringBuilder sb = new StringBuilder();
    		for(int j =0;j<str.length();j++) {
    			if(str.charAt(j) == pre || pre ==',') {
    				count++;
    			}else {
    				sb.append(count+Character.toString(pre));
    				count = 1;
    			}
    			pre = str.charAt(j);
    		}
    		sb.append(count+Character.toString(pre));
    		str = sb.toString();
    	}
    	
    	
    	return str;
    }
}
