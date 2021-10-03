import java.util.ArrayList;
import java.util.List;

public class leet_119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idx = 3;
		getRow(idx);
	}

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> tmp = new ArrayList<>();
        List<Integer> res = tmp;
        for(int i = 0; i <= rowIndex; i++){
        	tmp = new ArrayList<>();
            for(int j = 0; j <= i; j++)
                if(j == 0 || j == i)
                	tmp.add(1);
                else
                	tmp.add(res.get(j) + res.get(j-1));
            res = tmp;
        }
        return res;  
    }
}
