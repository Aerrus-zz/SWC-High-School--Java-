package e5;

import java.util.Scanner;

public class fibonacciSEQUENCE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, nn, a, nf;
		n1 = 0;
		n2 = 1;
		nf = 1;
		
		System.out.print("Enter your Fibonacci number term.   ");
		nn = input.nextInt();
		
		
		if(nn == 1)
			nf = 0;
		else
			for(a = 1; a < (nn-1); a++)
			{
				nf = n1 + n2;
				n1 = n2;
				n2 = nf;			
			}
		
		System.out.println("Your Fibonacci Number is " + nf + ".");
		
		/*
		Enter your Fibonacci number term.   8
		Your Fibonacci Number is 13.
		
		---another trial---
		
		Enter your Fibonacci number term.   1
		Your Fibonacci Number is 0.
		 */
	}

}
