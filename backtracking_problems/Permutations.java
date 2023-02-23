package backtracking_problems;

import java.util.Scanner;

public class Permutations {

	static int a[];

	static int x[];

	public static void backtracking() {
		for (int i = 0; i < x.length; i++)
			x[i] = -1;
		int k = 0;
		while (k >= 0)
			if (k == x.length) {
				retainSol();
				k--;
			} else if (x[k] < x.length - 1) {
				x[k]++;
				if (continues(k))
					k++;
			} else
				x[k--] = -1;

	}

	public static void retainSol() {
		for (int i = 0; i < x.length; i++)
			System.out.print(a[x[i]] + " ");
		System.out.println();
	}

	public static boolean continues(int k) {
		for (int i = 0; i < k; i++) {
			if (x[k] == x[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			a = new int[n];
			System.out.println("Write vector items: ");
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			x = new int[n];
		}
		backtracking();

	}

}
