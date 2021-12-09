
public class leet_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 int[] index = new int[50001];
	    public boolean canReach(int[] arr, int start) {
	        
	        if(start < 0 || start >= arr.length ){
	            return false;
	        }else if( arr[start] == 0 ){
	            return true;
	        }else if (index[start] == 1){
	            return false;
	        }
	        index[start] = 1;
	        
	        if(canReach(arr,start-arr[start])){
	            return true;
	        }
	        if(canReach(arr,start+arr[start])){
	            return true;
	        }
	        return false;
	    }
}
