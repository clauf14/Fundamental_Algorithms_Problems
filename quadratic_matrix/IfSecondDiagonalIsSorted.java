package quadratic_matrix;

import java.util.Scanner;

public class IfSecondDiagonalIsSorted {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			boolean sorted = true;
			for (int i = 0; i <= n - 2; i++)
				if (a[i][n - i - 1] > a[i + 1][n - i - 2])
					sorted = false;
			if (!sorted)
				System.out.print("The secondary diagonal is sorted ascending.");
			else
				System.out.print("The secondary diagonal is not sorted ascending.");
		}
	}
}
