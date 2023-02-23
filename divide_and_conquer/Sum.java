package divide_and_conquer;

import java.util.Scanner;

public class Sum {

	public static int SumDC(int p, int u, int a[]) {
		if (p == u)
			return a[p];
		int m = (p + u) / 2;
		return SumDC(p, m, a) + SumDC(m + 1, u, a);

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("The sum of the elements is " + SumDC(0, n - 1, a) + ".");
		}
	}

}
