package quadratic_matrix;

import java.util.Scanner;

public class MaximumOnTheMainDiagonal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++)
				a[i][i] = sc.nextInt();
			int max = a[0][0];

			for (int i = 1; i < n; i++) {
				if (a[i][i] > max)
					max = a[i][i];

			}
			System.out.print("The maximum on the main diagonal is " + max);
		}
	}
}
