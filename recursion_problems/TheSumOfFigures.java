package recursion_problems;

import java.util.Scanner;

public class TheSumOfFigures {

	public static int sumRecursion(int n) {
		if (n == 0)
			return 0;
		else
			return sumRecursion(n / 10) + n % 10;

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			System.out.print("The sum of figures is " + sumRecursion(n));
		}

	}

}
