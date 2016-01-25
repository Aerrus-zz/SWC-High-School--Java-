package L11;

import java.util.Scanner;

public class nameREVERSAL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner input = new Scanner(System.in);
		int a, b, length;
		System.out.print("Please enter your name. ");
		String purename = input.nextLine();
		String name = purename.toLowerCase();
		length = name.length();
		for(a=(length-1), b=length; b>0; a--, b--)
			System.out.print(name.substring(a,b));
		/*
		 Please enter your name. Peter Ustinov
		 vonitsu retep
		 */
	}

}
