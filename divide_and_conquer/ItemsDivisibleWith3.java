package divide_and_conquer;

import java.util.Scanner;

public class ItemsDivisibleWith3 {
	
	public static int nr3(int p, int u, int a[]) {
		if (p == u) {
			if (a[p] % 3 == 0)
				return 1;
			else
				return 0;
		}
		int m = (p + u) / 2;
		return nr3(p, m, a) + nr3(m + 1, u, a);

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("The number of elements divisible by 3 is " + nr3(0, n - 1, a) + ".");
		}
	}
}
