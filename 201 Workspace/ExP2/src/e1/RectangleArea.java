package e1;

import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner input = new Scanner(System.in);
		
		int width, height;
		
		System.out.println("What is the rectangle's width?");
		width = input.nextInt();
		
		System.out.println("What is the rectangle's height?");
		height = input.nextInt(); 
		
		Rectangle box = new Rectangle(10,10,width,height);
		System.out.println("The area of the rectangle is " + (box.height * box.width));
		
		/*
What is the rectangle's width?
2
What is the rectangle's length?
3
The area of the rectangle is 6
		 */
	}

}
