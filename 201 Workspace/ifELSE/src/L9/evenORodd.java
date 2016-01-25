package L9;

import java.util.Scanner;

public class evenORodd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:  ");
		int a = input.nextInt();
		if((a %2)==0)
			System.out.println("The integer " + a + " is even.");
		else
			System.out.println("The integer " + a + " is odd.");
		
		/*
		 * Enter an integer:  45644564
		   The integer 45644564 is even.

		 */
	}

}
