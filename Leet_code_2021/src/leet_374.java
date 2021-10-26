
public class leet_374 {

	/** 
	 * Forward declaration of guess API.
	 * @param  num   your guess
	 * @return 	     -1 if num is lower than the guess number
	 *			      1 if num is higher than the guess number
	 *               otherwise return 0
	 * int guess(int num);
	 */	
	static int res = 12;
	public static int guess(int num) {
		if(num < res) {
			return 1;
		}else if (num > res) {
			return -1;
		}else {
			return 0;
		}
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(guessNumber(17));
		
	}
	public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = left +(right-left)/2;
        int tmp = 0;
        
        while(left <= right){
            mid = left + (right-left)/2;
            tmp = guess(mid);
            if(tmp == -1){
                right = mid-1;
            }else if (tmp == 1){
                left = mid+1;
                
            }else{
                return mid;
            }
            
        }
        
        return 0;
    }

}
