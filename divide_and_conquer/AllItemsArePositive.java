package divide_and_conquer;

import java.util.Scanner;

public class AllItemsArePositive {
	public static boolean allPositiveDC(int p, int u, int a[]) {
		if (p == u) {
			if (a[p] > 0)
				return true;
			else
				return false;
		}
		int m = (p + u) / 2;
		return allPositiveDC(p, m, a) && allPositiveDC(m + 1, u, a);

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n=");
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			if (allPositiveDC(0, n - 1, a))
				System.out.println("All items are positive.");
			else
				System.out.println("Not all items are positive.");
		}
	}
}
