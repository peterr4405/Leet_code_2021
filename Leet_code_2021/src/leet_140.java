import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class leet_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<String> wordBreak(String s, List<String> wordDict) {
		HashSet<String> dict = new HashSet(wordDict);
		HashMap<Integer, List<String>> records = new HashMap();

		return helper(s, 0, dict, records);
	}

	public static List<String> helper(String s, int start, HashSet<String> dict,
			HashMap<Integer, List<String>> records) {
		if (records.containsKey(start)) {
			return records.get(start);
		}
		List<String> result = new ArrayList();
		for (int i = start + 1; i < s.length(); i++) {
			if (dict.contains(s.substring(start, i))) {
				StringBuilder sb = new StringBuilder();
				sb.append(s.substring(start, i));

				List<String> remains = helper(s, i, dict, records);
				for (String s2 : remains) {
					sb.append(" ");
					sb.append(s2);
					result.add(sb.toString());
					sb = new StringBuilder(s.substring(start, i));
				}
			}
		}
		if (dict.contains(s.substring(start, s.length()))) {
			result.add(s.substring(start, s.length()));
		}
		records.put(start, result);
		return result;
	}
}
