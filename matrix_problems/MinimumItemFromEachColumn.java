package matrix_problems;

import java.util.Scanner;

public class MinimumItemFromEachColumn {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n=");
			int n= sc. nextInt();
			System.out.print("m=");
			int m= sc. nextInt();
			int a[][]= new int[n][m];
			int minimum;
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
					a[i][j]=sc. nextInt();
				
				for(int j=0; j<m; j++) {
					minimum=a[0][j];
					for(int i=1; i<n; i++)
						if(a[i][j]<minimum) 
							minimum=a[i][j];
					
						System.out.println("The minimum item from column "+j+" is "+minimum);
					
				}
		}
		}

}
