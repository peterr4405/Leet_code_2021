
public class leet_122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int maxProfit(int[] prices) {
        
        int res = 0;
        
        for(int i =1 ; i<prices.length ; i++){
            if(prices[i] > prices[i-1]){
                res += prices[i]-prices[i-1];
            }
        }
        return res;
    }
}
