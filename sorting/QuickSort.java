package sorting;

import java.util.Scanner;

public class QuickSort {

	static int[] a;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n = sc.nextInt();
			a = new int[n];
			System.out.println("Write the elements:");
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			quicksort(0, n - 1);
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}

	}

	public static void quicksort(int p, int u) {
		if (p < u) {
			int m = partitioning(p, u);
			quicksort(p, m - 1);
			quicksort(m + 1, u);
		}

	}

	public static int partitioning(int p, int u) {
		int pivot = a[u];
		int i = p;
		for (int j = p; j <= u - 1; j++) {
			if (a[j] < pivot) {
				int aux = a[i];
				a[i] = a[j];
				a[j] = aux;
				i++;
			}
		}
		int aux = a[i];
		a[i] = a[u];
		a[u] = aux;
		return i;

	}
}
