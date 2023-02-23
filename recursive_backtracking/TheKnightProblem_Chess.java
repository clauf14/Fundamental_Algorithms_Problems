package recursive_backtracking;

import java.util.Scanner;

/*
Give a chessboard n*n(n>=5)
Cover in all possible ways with a knight starting from the top left
and passes through all squares.
*/

public class TheKnightProblem_Chess {
	
	static int n;
    static int[][] x;

    public static void retainSol(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }
    public static void knightProblem(int k, int l, int c){
        if( 0<=l && l<n && 0<=c && c<n && x[l][c] == 0){
            x[l][c] = k;
            if(k==n*n) {
            	retainSol();
                System.out.println();
            }
            else{
            	knightProblem(k+1,l-1,c-2);
            	knightProblem(k+1,l-2,c-1);
            	knightProblem(k+1,l-2,c+1);
            	knightProblem(k+1,l-1,c+2);
            	knightProblem(k+1,l+1,c+2);
            	knightProblem(k+1,l+2,c+1);
            	knightProblem(k+1,l+2,c-1);
            	knightProblem(k+1,l+1,c-2);
            }
            x[l][c] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number of lines and columns:");
        n = sc.nextInt();
        x = new int[n][n];
        knightProblem(1,0,0);
    }
}

