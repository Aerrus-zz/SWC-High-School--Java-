package L7;

import java.util.Scanner;

public class RadiusOfCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the area of your circle?");
		double a = input.nextDouble();
		double r = Math.sqrt(a / Math.PI);
		System.out.println("Radius of your circle is " + r + ".");
		
		/*
		 * What is the area of your circle?
			10
			Radius of your circle is 1.7841241161527712.

		 */
		
		
	}

}
