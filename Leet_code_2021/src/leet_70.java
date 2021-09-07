
public class leet_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(climbStairs(n));
	}

    public static int climbStairs(int n) {
     
    	if (n < 2)return n;
    	
    	int[] res = new int[n+1];
    	res[0] = 0;
    	res[1] = 1;
    	res[2] = 2;
    	
    	for(int i=3;i<=n;i++) {
    		res[i] = res[i-2] + res[i-1];
    	}
    	
    	return res[n];
    }
}
