package vector_problems;

import java.util.Scanner;

public class SumOfStrictlyPositiveItems {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int[] a = new int[n];
			int s = 0;
			System.out.println("Give vector elements: ");
			for (int i = 0; i <= n - 1; i++) {
				a[i] = sc.nextInt();
				if (a[i] >= 0) {

					s += a[i];
				}

			}
			if (s != 0)
				System.out.print("Sum is = " + s);
			else
				System.out.print("Does not exist");
		}

	}

}
