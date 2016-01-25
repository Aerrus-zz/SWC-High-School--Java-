package e2;

import java.awt.Rectangle;
import java.util.Scanner;

public class RectanglePerimeter {

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
		System.out.println("The perimeter of the rectangle is " + ((box.width *2)+(box.height * 2)));
		
		/*
What is the rectangle's width?
2
What is the rectangle's height?
3
The perimeter of the rectangle is 10
		 */
	}

}
