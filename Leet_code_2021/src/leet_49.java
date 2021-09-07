import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(strs);
	}

    public static List<List<String>> groupAnagrams(String[] strs) {
    
    	List<List<String>> result = new ArrayList<>();
    	if(strs.length <1) return result;

    	Map<String, List<String>> map = new HashMap<>();
    	for(int i=0;i<strs.length;i++) {
    		char [] ch = strs[i].toCharArray();
    		Arrays.sort(ch);
    		String key = String.valueOf(ch);
    		if(!map.containsKey(key)) {
    			map.put(key, new ArrayList<String>());
    		}
    		map.get(key).add(strs[i]);
    	}
    	for(List<String> list : map.values()) {
    		result.add(new ArrayList<>(list));
    	}
    	
    	return result;
    }
    

    
}
