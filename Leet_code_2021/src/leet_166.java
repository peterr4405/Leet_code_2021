import java.util.HashMap;
import java.util.Map;

public class leet_166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static String fractionToDecimal(int numerator, int denominator) {
        
       if(numerator == 0) return "0";
    	
       StringBuilder sb = new StringBuilder();
       if(numerator > 0 && denominator <0 || numerator < 0 && denominator > 0 ) {
    	   sb.append("-");
       }
       
       long dividend = Math.abs((long)numerator);
       long divisor = Math.abs((long) denominator);
       
       sb.append(dividend/divisor);
    	
       long remaninder = dividend % divisor;
       
       if(remaninder ==0) {
    	   return sb.toString();
       }
       
       sb.append(".");
       Map<Long, Integer>map = new HashMap<>(); 
       while(remaninder !=0) {
    	   if(map.containsKey(remaninder)) {
    		   sb.insert(map.get(remaninder), "(");
    		   sb.append(")");
    		   break;
    	   }
    	   map.put(remaninder, sb.length());
    	   remaninder *=10;
    	   sb.append(remaninder/divisor);
    	   remaninder %= divisor;
       }
       
       return sb.toString();
    }

}
