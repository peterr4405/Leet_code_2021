
public class leet_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KMP演算法
		//https://www.youtube.com/watch?v=dgPabAsTFa8
		System.out.println(strStr("aaaaab", "aaab"));

	}

	public static int strStr(String haystack, String needle) {
		int idx = -1;

		int n = haystack.length();
		int m = needle.length();

		int[] pi = new int[m];
		if (m == 0) {
			return 0;
		}
		computePrefix(needle, pi);
		int k = -1;
		for (int i = 0; i < n; i++) {
			while (k >= 0 && needle.charAt(k + 1) != haystack.charAt(i)) {
				k = pi[k];
			}
			if (needle.charAt(k + 1) == haystack.charAt(i)) {
				k++;
			}
			if (k == m - 1) {
				return i - m + 1;
			}
		}

		return idx;
	}

	public static void computePrefix(String p, int[] pi) {

		pi[0] = -1;
		int k = -1;

		for (int i = 1; i < p.length(); i++) {

			while (k >= 0 && p.charAt(k + 1) != p.charAt(i)) {
				k = pi[k];
			}
			if (p.charAt(k + 1) == p.charAt(i)) {
				k++;
			}
			pi[i] = k;
		}

	}

}
