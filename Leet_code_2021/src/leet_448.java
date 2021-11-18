import java.util.ArrayList;
import java.util.List;

public class leet_448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList();
        int idx = 0;
        while( idx < nums.length){
            if(nums[idx] == idx+1){
                idx++;
            }else{
                int tmpidx = nums[idx]-1;
                if(nums[idx] == nums[tmpidx]){
                    idx++;
                    continue;
                }
                int tmp = nums[tmpidx];
                nums[tmpidx] = nums[idx];
                nums[idx] = tmp;
                
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                res.add(i+1);
            }
        }
        
        return res;
    }
}
