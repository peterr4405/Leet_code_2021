import java.util.HashSet;

public class leet_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,100,200,3,4,2};
		System.out.println(longestConsecutive(nums));
		
		
	}
	  public static int longestConsecutive(int[] nums) {
          int max_len = 0;
      HashSet<Integer> set = new HashSet();
      for(int i : nums){
          set.add(i);
      }
      
      for(int i =0;i<nums.length;i++){
          int cur_num = nums[i];
          int cur_len = 1;
          if(!set.contains(cur_num-1)){
          while(set.contains(cur_num+1)){
              cur_len+=1;
              cur_num+=1;
          }   
          if(cur_len > max_len){
              max_len = cur_len;
          }   
      }
          
      }
      return max_len;
  }
}
