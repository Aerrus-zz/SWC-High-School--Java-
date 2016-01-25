package Test3;

import java.util.Scanner;

public class YangLu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		//import scanner early on
		Scanner input = new Scanner(System.in);
		
		//my integers declared
		int count, guess, answer;
		
		//this is where the answer is. Right at the top so its easy to change later
		answer = 45;
		
		//instructions and the initial guess
		System.out.println("Try to guess the number in the least number of steps.\nWhat is your first guess?");
		guess = input.nextInt();
		count = 1;
		
		//count starts at 1 because of the guess taken initially
		//the loop will loop infinitely unless the answer was entered, which will not perform the loop
		while(guess!=answer)
		{

			//Used an if/else to determine if the number was too big or too small and asks for the next guess
			//if: guess is bigger than answer, it says its too big
			//else: guess is smaller than answer, it says its too small
			if(guess>answer)
			{
				System.out.println("That's not it! The number is too high.\nWhat is your next guess?");
				guess = input.nextInt();
				count++;
			}
			else
			{
				System.out.println("That's not it! The number is too low.\nWhat is your next guess?");
				guess = input.nextInt();
				count++;
			}
		}
		
		//The final if/else will apply appropriate grammar in case the user guessed it in one try
		//It also has advertisements!!!
		if(count==1)
			System.out.println("Amazing! You got the answer on your first try!\nThis program was brought to you by Yang Lu.");
		else
			System.out.println("Congratulations! You got it! It took you " + count + " tries.\nThis program was brought to you by Yang Lu.");
		
		/*
Try to guess the number in the least number of steps.
What is your first guess?
50
That's not it! The number is too high.
What is your next guess?
46
That's not it! The number is too high.
What is your next guess?
41
That's not it! The number is too low.
What is your next guess?
42
That's not it! The number is too low.
What is your next guess?
44
That's not it! The number is too low.
What is your next guess?
45
Congratulations! You got it! It took you 6 tries.
This program was brought to you by Yang Lu.

===========next trial with first try==========

Try to guess the number in the least number of steps.
What is your first guess?
45
Amazing! You got the answer on your first try!
This program was brought to you by Yang Lu.
		 */
		
	}

}
