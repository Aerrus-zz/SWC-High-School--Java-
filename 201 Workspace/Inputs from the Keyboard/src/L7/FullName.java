package L7;

import java.util.Scanner;

public class FullName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner first = new Scanner(System.in);
		Scanner last = new Scanner(System.in);
		System.out.println("What is your first name?");
		String a = first.nextLine();
		System.out.println("What is your last name?");
		String b = last.nextLine();
		System.out.println("Your full name is " + a + " " + b + ".");
		
		/*
		 * What is your first name?
			Yang
			What is your last name?
			Lu
			Your full name is Yang Lu.

		 */
		
		
	}

}
