
public class leet_441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public static int arrangeCoins(int n) {
	        int res =0;
	        if(n ==0) return 0;
	        
	        
	        for(int i=1;i<=n;i++){
	            n -=i;
	            if(n>=0){
	                res ++;
	            }else{
	                return res;
	            }
	        }
	        return res;
	    }
	 /*
	  public int arrangeCoins(int n) {
	    	    
	         return (int)(-0.5 + Math.sqrt(0.25 + 2 * (long)n ) );
	 }
	   */
}
