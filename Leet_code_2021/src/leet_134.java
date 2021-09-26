
public class leet_134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int canCompleteCircuit(int[] gas, int[] cost) {
     
    	int tmpgas = 0;
    	int totalGas = 0;
    	int totalCost = 0;
    	int idx = 0;
    	
    	for(int i=0;i<gas.length;i++) {
    		totalGas +=gas[i];
    		totalCost +=cost[i]; 
    	}
    	if(totalCost > totalGas) {
    		return -1;
    	}
    	
    	for(int i=0;i<gas.length;i++) {
    		
    		tmpgas += gas[i]-cost[i];
    		if(tmpgas < 0) {
    			idx = i+1;
    			tmpgas=0;
    		}
    	}
    	return idx;
    }
}
