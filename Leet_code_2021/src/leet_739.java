
public class leet_739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int[] dailyTemperatures(int[] temperatures) {
        
        
        
        int[] res = new int[temperatures.length];
        if(temperatures.length ==0) return res;
        for(int i =0; i< temperatures.length ; i++){
            for(int j =i+1; j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    res[i] = j-i;
                    break;
                }else if( j == temperatures.length-1 ){
                    res[i] = 0;
                }
            }
        }
        return res;
    }
}
