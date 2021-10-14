
public class leet_167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int[] twoSum(int[] numbers, int target) {
	        
         int left =0;
         int right = numbers.length-1;
         int[] ans = new int[2];
     
     while(left<right){
         if(numbers[left]+numbers[right] == target){
             ans[0] = left+1;
             ans[1] = right+1;
             return ans;
         }else if(numbers[left]+numbers[right] > target ){
             right--;
         }else{
             left++;
         }
         
     }
     return ans;
 }

}
