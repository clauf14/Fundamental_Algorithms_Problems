package sorting;

import java.util.Scanner;

public class MergeSort {
	static int[] a;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			a = new int[n];
			System.out.println("Write the elements:");
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			mergesort(0, n - 1);
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}

	}

	public static void mergesort(int p, int u) {
		if (p < u) {
			int m = (p + u) / 2;
			mergesort(p, m);
			mergesort(m + 1, u);
			interclassing(p, m, u);
		}

	}

	public static void interclassing(int p, int m, int u) {
		int i = p;
		int j = m + 1;
		int k = 0;
		int[] b = new int[u - p + 1];// *****//
		while (i <= m && j <= u)
			if (a[i] < a[j])
				b[k++] = a[i++];
			else
				b[k++] = a[j++];

		for (int l = i; l <= m; l++)
			b[k++] = a[l];
		for (int l = j; l <= u; l++)
			b[k++] = a[l];
		for (i = 0; i < k; i++)
			a[p + i] = b[i];

	}
}