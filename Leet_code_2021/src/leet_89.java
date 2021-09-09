import java.util.ArrayList;
import java.util.List;

public class leet_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<Integer> list =grayCode(n);
		for(int i : list) {
			System.out.printf(i+"\t");
		}
		
	}

    public static List<Integer> grayCode(int n) {
        
    	List<Integer> res =new ArrayList<>();
    	for(int i =0;i<(1 << n);i++) {
    		res.add(i^ ( i >> 1 ));
    	}
    	
    	
    	return res;
    }
}
