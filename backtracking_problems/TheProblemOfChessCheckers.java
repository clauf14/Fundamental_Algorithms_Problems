package backtracking_problems;

/*The Problem Of Chess Checkers is the problem of placing N chess queens on an NxN chessboard
so that no two queens attack each other, for which solutions exist for all
natural numbers n except n=2 and n=3.

A solution requires that no two queens share the same row, column, or diagonal.
*/

import java.util.Scanner;



public class TheProblemOfChessCheckers {

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
					k = k + 1;
			} else
				x[k--] = -1;

	}

	public static boolean continues(int k) {
		for (int i = 0; i < k; i++) {
			if (x[k] == x[i] || Math.abs(x[k] - x[i]) == k - i)
				return false;
		}
		return true;

	}

	public static void retainSol() {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++)
				if (j == x[i])
					System.out.print(" x ");
				else
					System.out.print(" 0 ");

			System.out.println();
		}
		System.out.println();

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			x = new int[n];
		}
		backtracking();
	}

}
