
public class leet_204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int countPrimes(int n) {

		boolean[] primes = new boolean[n];
		int count = 0;

		for (int i = 2; i * i < n; i++) {
			for (int j = i; j * i < n; j++) {
				if (!primes[i]) {
					primes[i * j] = true;
				}
			}
		}

		for (int i = 2; i < primes.length; i++) {
			if (!primes[i]) {
				count++;
			}
		}
		return count;
	}
}
