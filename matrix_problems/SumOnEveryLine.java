package matrix_problems;

import java.util.Scanner;

public class SumOnEveryLine {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			System.out.print("Give m:");
			int m = sc.nextInt();
			int s = 0;
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					s = s + a[i][j];
				System.out.println("Sum on line " + i + " is " + s);
				s = 0;

			}
		}
	}
}