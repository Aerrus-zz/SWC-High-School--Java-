package e3;

import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTranslation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int width, height;
		
		System.out.println("What is the rectangle's width?");
		width = input.nextInt();
		
		System.out.println("What is the rectangle's height?");
		height = input.nextInt(); 
		
		Rectangle box1 = new Rectangle(0,0,width,height);
		Rectangle box2 = new Rectangle(width,0,width,height);
		Rectangle box3 = new Rectangle(0,height,width,height);
		Rectangle box4 = new Rectangle(width,height,width,height);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		
		/*
What is the rectangle's width?
2
What is the rectangle's height?
3
java.awt.Rectangle[x=0,y=0,width=2,height=3]
java.awt.Rectangle[x=2,y=0,width=2,height=3]
java.awt.Rectangle[x=0,y=3,width=2,height=3]
java.awt.Rectangle[x=2,y=3,width=2,height=3]
		 */
	}

}
