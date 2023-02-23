package vector_problems;

import java.util.Scanner;

public class MaximOf3Numbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a=");
			int a = sc.nextInt();
			System.out.print("b=");
			int b = sc.nextInt();
			System.out.print("c=");
			int c = sc.nextInt();
			int max = -1;
			if (a > b)
				max = a;
			else
				max = b;
			if (c > max)
				max = c;
			System.out.print("Maximum is: " + max);
		}

	}

}
