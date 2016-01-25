package exercises;

import java.util.Scanner;

public class exercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. int and char
		
		//2. -4
		
		//3. 
		Scanner input = new Scanner(System.in);
		System.out.println("G to increment y by 1");
		System.out.println("M to decrement y by 1");
		System.out.println("any other to increment y by 100");
		String choice = input.nextLine();
		char myChar = choice.charAt(0);
		int y = 100;
		switch(myChar)
		{
		case 'G':
		case 'g':
			y++;
			break;
		case 'M':
		case 'm':
			y--;
			break;
		default:
			y = y + 100;
		}
		System.out.println(y);
		
		//4. 0
		
		//5.
		char chr = 'z';
		
		//6. a) The sum is 1012
		//   b) The sum is 22
		
		//7. The scanner was declared back in question 3
		System.out.println("What is your speed?");
		int speed = input.nextInt();
		switch(speed)
		{
		case 75:
			System.out.println("Exceeding speed limit");
			break;
		case 69:
		case 70:
			System.out.println("Getting close");
			break;
		case 65:
			System.out.println("Cruising");
			break;
		default:
			System.out.println("Very slow");
		}
		
		//8. No
		
		//9. chr was used earlier, so i used chr2
		String s = "X";
		char chr2 = s.charAt(0);
		
		/*
		 * G to increment y by 1
		   M to decrement y by 1
		   any other to increment y by 100
		   g
		   101
		   What is your speed?
		   75
		   Exceeding speed limit
		 */
	}

}
