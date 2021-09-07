
public class leet_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]  digits = {1,2,3,9,9};
		int[] res = plusOne(digits);
		for(int i : res) {
			System.out.print(i);
		}
		
	}

    public static int[] plusOne(int[] digits) {
        
    	int len = digits.length-1;
    	while(len >=0 && digits[len] ==9) {
    		if(len == 0) {
    			int[] newdig = new int[digits.length+1];
    			newdig[len] = 1;
    			return newdig;
    		}
    		digits[len] = 0;
    		len--;
    	}
    	digits[len] +=1;
    	
    	
    	return digits;
    }
}
