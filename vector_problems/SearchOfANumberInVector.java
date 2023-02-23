package vector_problems;

import java.util.Scanner;

public class SearchOfANumberInVector {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n=");
			int n = sc.nextInt();
			boolean found = false;
			int y = 0;
			int a[] = new int[n];
			System.out.println("Give vector elements: ");
			for (int i = 0; i <= n - 1; i++) {
				a[i] = sc.nextInt();
				if (y == a[i]) {
					System.out.print(i + "  ");
					found = true;
				}
			}
			if (!found)
				System.out.println("Empty crowd");
		}
	}

}
