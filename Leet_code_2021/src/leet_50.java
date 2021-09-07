
public class leet_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 2.0;
		int n = 10;
		System.out.println(myPow(x,n));
	}

    public static double myPow(double x, int n) {
        
    	double res = 1.0;
    	long N = n;
    	if(n < 0) {
    		N = -N;
    		x = 1/x;
    	}
    	double  tmp = x;
    	for(long i = N;i >0;i/=2) {
    		if(i % 2 ==1) {
    			res *= tmp;
    		}
    		tmp *= tmp;
    	}
    	
    	return res;
    }
    
    
}
