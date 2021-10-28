
public class leet_220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,1};
		int k = 3;
		int t = 0;
		containsNearbyAlmostDuplicate(nums,k,t);
		
	}
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        for(int i=0;i<nums.length;i++){
            for(int j = i+1 ; j<=i+k && j<nums.length ;j++ ){
                long tmp = Math.abs((long)nums[i]-(long)nums[j]);
                if(tmp <=t){
                    return true;
                }
            }
        }
        return false;
    }
}
