
public class leet_540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int singleNonDuplicate(int[] nums) {
        
        int x =0;
        
        for(int n : nums){
            x ^= n;
        }
        return x;
    }
}
