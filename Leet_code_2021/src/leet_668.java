
public class leet_668 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public static int findKthNumber(int m, int n, int k) {
	        
	        int left = 1;
	        int right = m*n;
	        
	        while(left < right){
	            
	            int val = left + (right-left)/2;
	            if(equalorsmall(val,m,n)< k){
	                left = val+1;
	            }else{
	                right = val;
	            }
	        }
	        return left;
	    }
	    
	    public static int equalorsmall(int val,int m,int n){
	        
	        int count =0;
	        for(int i = 1;i<=m;i++){
	            count +=Math.min(n,val/i);
	        }
	        return count;
	    }
	    
}
