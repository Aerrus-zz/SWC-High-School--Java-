package e4;

import java.awt.Rectangle;

public class RectangleOverlap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Rectangle r1 = new Rectangle(0,0,10,20);
		Rectangle r2 = new Rectangle(5,5,20,10);
		
		Rectangle r3 = r1.intersection(r2);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		/*
java.awt.Rectangle[x=0,y=0,width=10,height=20]
java.awt.Rectangle[x=5,y=5,width=20,height=10]
java.awt.Rectangle[x=5,y=5,width=5,height=10]
		 */
	}

}
