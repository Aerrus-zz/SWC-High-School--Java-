package L12;

import java.util.Scanner;

public class exercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		//I put some questions in comments so i can test the last one easier
		
		//1.
		/*
		int j = -123;
		while(j<=1)
		{
			//code
			j++;
		}
		*/
		
		
		
		
		//2.
		/*
		do
		{
			//code
		}
		while(j<=1);
		*/
		
		
		
		
		//3.
		/*
		int m = 97;
		int k = 0, p = 0;
		while(m<=195)
		{
			k = k * k + 3 * m;
			p = p + m + 1;
		}
		*/
		
		
		
		
		//4.
		/*
		int q = 0, v = 0;
		do
		{	
			k = k*k + 3 * v;
			q = (int) Math.sqrt(q + v + 1);
		}
		while(v<=195);
		*/
		
		
		
		//5. i<1
		
		//6. the while is right behind the brackets
		
		//7. infinite times, there is no code to increase j
		
		//14. 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int a = input.nextInt();
		System.out.println(a*a);
		while (a!=0)
		{
			System.out.println("Please enter an integer.");
			a = input.nextInt();
			System.out.println(a*a);
		}
		/*
		Please enter an integer.
		1
		1
		Please enter an integer.
		2
		4
		Please enter an integer.
		3
		9
		Please enter an integer.
		0
		0
		 */
	}

}
