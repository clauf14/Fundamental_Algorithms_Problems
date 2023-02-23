package quadratic_matrix;

import java.util.Scanner;

public class IfAllElementsAboveTheMainDiagAreNotNull {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			boolean notnull = true;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			for (int i = 0; i <= n - 2; i++)
				for (int j = i + 1; j <= n - 1; j++) {
					if (a[i][j] == 0)
						notnull = false;
				}

			if (notnull == false)
				System.out.print("Not all elements above the main diagonal are not null");
			else
				System.out.print("All elements above the main diagonal are not null");
		}
	}
}
