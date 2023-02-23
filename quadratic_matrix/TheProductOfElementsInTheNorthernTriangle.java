package quadratic_matrix;

import java.util.Scanner;

public class TheProductOfElementsInTheNorthernTriangle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n=");
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			int p = 1;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			for (int i = 0; i <= (n - 1) / 2 - 1; i++) {
				for (int j = i + 1; j <= n - 2 - i; j++)
					p = p * a[i][j];
			}

			System.out.print("The product of the elements in the northern triangle " + p);
		}
	}

}
