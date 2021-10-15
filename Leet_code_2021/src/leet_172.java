
public class leet_172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int trailingZeroes(int n) {
        
        int res = 0;
        while(n !=0){
            int tmp = n/5;
            res +=tmp;
            n = tmp;
        }
        return res;
    }
}
