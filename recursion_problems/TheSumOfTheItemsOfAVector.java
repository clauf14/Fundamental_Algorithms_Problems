package recursion_problems;

import java.util.Scanner;

public class TheSumOfTheItemsOfAVector {

	public static int sumOfItems(int a[], int i, int n) {
		if (i == a.length)
			return 0;
		return sumOfItems(a, i + 1, n) + a[i];

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.print("The sum of the items is " + sumOfItems(a, 0, n) + ".");
		}

	}

}
