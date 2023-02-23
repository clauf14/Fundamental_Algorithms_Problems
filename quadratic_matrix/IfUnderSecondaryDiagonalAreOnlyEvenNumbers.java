package quadratic_matrix;

import java.util.Scanner;

public class IfUnderSecondaryDiagonalAreOnlyEvenNumbers {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n=");
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			boolean even = true;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			for (int i = 1; i <= n - 1; i++) {
				for (int j = n - i; j <= n - 1; j++)
					if (a[i][j] % 2 == 1)
						even = false;
			}
			if (!even)
				System.out.print("Not all items under the secondary diagonal are even.");
			else
				System.out.print("All items under the secondary diagonal are even.");
		}
	}

}
