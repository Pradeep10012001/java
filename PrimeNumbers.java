package BasicPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			boolean flag = false;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}

			}
			if (flag == false) {
				System.out.println(n + " is prime");
			}
		}
	}

}
