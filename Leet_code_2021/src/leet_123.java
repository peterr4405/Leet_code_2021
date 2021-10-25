
public class leet_123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxProfit(int[] prices) {
	     
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;
        
        
        for(int price : prices){
            
            int buy1_tmp = buy1;
            int sell1_tmp = sell1;
            int buy2_tmp = buy2;
            int sell2_tmp = sell2;
            
            buy1 = Math.max(0-price,buy1_tmp);
            sell1 = Math.max(buy1+price,sell1_tmp);
            buy2 = Math.max(sell1-price,buy2_tmp);
            sell2 = Math.max(buy2+price,sell2_tmp);
        }
        return Math.max(sell1,sell2);
    }
}
