package greedy_method;

import java.util.Scanner;

public class MinimisingAverageWaitingTime {

	/*
	 * Minimising average waiting time 
	 * A service station (processor, service,doctor's office, etc.) 
	 * serves n customers. For each customer i, the time t[i]needed
	 * to serve him is known to determine an order of serving customers 
	 * that minimizes the average waiting time.
	 */
	
	static int[] t;

	public static void quicksort(int p, int u) {
		if (p < u) {
			int m = partitioning(p, u);
			quicksort(p, m - 1);
			quicksort(m + 1, u);
		}
	}

	private static int partitioning(int p, int u) {
		int aux;
		int pivot = t[u];
		int i = p;
		for (int j = p; j < u; j++)
			if (t[j] < pivot) {
				aux = t[j];
				t[j] = t[i];
				t[i] = aux;
				i++;
			}
		aux = t[u];
		t[u] = t[i];
		t[i] = aux;
		return i;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Give number of clients:");
			int n = sc.nextInt();
			t = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Waiting time for client" + " " + (i + 1) + ":");
				t[i] = sc.nextInt();
			}
			quicksort(0, n - 1);
			int totaltime = 0;
			for (int i = 0; i < n; i++) {
				System.out.println("For client with waiting time " + t[i]);
				totaltime = totaltime + ((n - i) * t[i]);
			}
			System.out.println("Average waiting time: " + ((float) totaltime / n));
		}
	}
}
