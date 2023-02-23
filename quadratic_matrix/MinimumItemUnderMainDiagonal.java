package quadratic_matrix;

import java.util.Scanner;

public class MinimumItemUnderMainDiagonal {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			int min = Integer.MAX_VALUE;

			for (int i = 1; i < n; i++) {
				for (int j = 0; j <= i - 1; j++)
					if (a[i][j] < min)
						min = a[i][j];
			}
			System.out.println("The minimum under the main diagonal is " + min);
		}
	}

}
