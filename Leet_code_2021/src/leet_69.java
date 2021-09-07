
public class leet_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		
		System.out.println(mySqrt(x));
	}

    public static int mySqrt(int x) {
        
    	long start =1;
    	long end = x;
    	
    	
    	while (start+1 <end ) {
    		long mid = start+(end-start)/2;
    		if (mid * mid == x) {
    			return (int)mid;
    		}else if (mid * mid <x) {
    			start = mid;
    		}else {
    			end = mid;
    		}
    		
    	}
    	
    	return end *end <=x ? (int)end : (int)start;
    }
}
