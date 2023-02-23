package vector_problems;

import java.util.Scanner;

public class NumberOfAppearancesOfTheMaximumFigure {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give n:");
			int n= sc.nextInt();
			int fmax=-1;
			int ap=0;
			while(n!=0){
			    if(n%10>fmax) {
			    	fmax=n%10;
			    	ap=1;
			    }
			    else
			    	if(n%10==fmax) {
			    		ap++;
			    	}
			    n=n/10;
			  }
			System.out.println("Maximum figure is: " +fmax);
			System.out.println("Number of appearances is: "+ap);
		}
		
	}

}

