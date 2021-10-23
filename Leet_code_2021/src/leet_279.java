
public class leet_279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 12;
			System.out.println(numSquares(i));
	}
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        if(n <=3)return n;
        
        for(int i=1;i<=n;i++){
            dp[i] = i;
            for(int j = 1;j*j<=i;j++){
             dp[i] = Math.min(dp[i],1+dp[i-j*j]);   
            }
        }
        return dp[n];
    }
}
