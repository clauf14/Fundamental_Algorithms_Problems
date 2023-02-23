package vector_problems;

import java.util.Scanner;

public class DetermineTheLargestNegativeElement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n= sc. nextInt();
			int max = Integer.MIN_VALUE;
			int i;
			for (i = 1; i <= n; i++) {
				if(i==1)
					System.out.print("Give "+i+"st"+" element=");
				if(i==2)
					System.out.print("Give "+i+"nd"+" element=");
				if(i==3)
					System.out.print("Give "+i+"rd"+" element=");
				if(i>=4)
					System.out.print("Give "+i+"th"+" element=");
				int x = sc.nextInt();
				if (x < 0 && x > max)
					max = x;
			}
			if (max == Integer.MIN_VALUE)
				System.out.print("There are no negative numbers.");
			else
				System.out.print("The maximum negative number is: " + max);
		}

	}

}
