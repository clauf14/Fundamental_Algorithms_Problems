package vector_problems;

import java.util.Scanner;

public class Interchange {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a=");
			int a = sc.nextInt();
			System.out.print("b=");
			int b = sc.nextInt();
			int aux;
			aux = a;
			a = b;
			b = aux;
			System.out.print("a=" + a);
			System.out.print(" b=" + b);
		}

	}

}
