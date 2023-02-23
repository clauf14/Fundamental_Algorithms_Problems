package divide_and_conquer;

import java.util.Scanner;

public class Hanoi {

	public static void hanoi(int n, int i, int j) {
		if (n > 0) {
			hanoi(n - 1, i, 6 - i - j);
			System.out.println("Moves a disk from " + i + " on " + j);
			hanoi(n - 1, 6 - i - j, j);
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			hanoi(n, 1, 2);
		}

	}

}
