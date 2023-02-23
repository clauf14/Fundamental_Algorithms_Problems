package divide_and_conquer;

import java.util.Scanner;

public class Product {

	public static int productDC(int p, int u, int a[]) {
		if (p == u)
			return a[p];
		int m = (p + u) / 2;
		return productDC(p, m, a) * productDC(m + 1, u, a);

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n=");
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("The product of the elements is " + productDC(0, n - 1, a) + ".");
		}
	}

}
