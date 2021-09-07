
public class leet_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(divide(-250,-10));
		System.out.println(13<<1);
	}
	
    public static int divide(int dividend, int divisor) {
        
		// checking for overflow
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;
		
		// deciding the sign of the quotient
        boolean sign = (dividend>=0) == (divisor >=0) ? true : false;
		
		//using absolute values for the answer
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
		
		// our answer
        int result=0; 
		
        while(dividend - divisor >= 0 ){
		 // the number of times we need to left shift (or double our divisor)
            int count=0;
			
			// increment count till we can subtract the doubled divisor form dividend
            while(dividend  - (divisor << 1 << count) >= 0 ){
                count++; 
            }
			
			 // incrementing quotient by the power of 2 by which we multiplied divisor
			// 2 power x can be written as 1<<x
            result += 1 << count;
			
			// decrease the dividend by the maximum value we can subtract
			//which is divisor*(2 power count)
            dividend -= divisor << count ; 
        }
		 // if sign is false it means negative quotient
        return sign?result: -result ;
    }

}
