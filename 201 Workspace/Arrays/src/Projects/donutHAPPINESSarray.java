package Projects;

import java.util.Scanner;

public class donutHAPPINESSarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner input = new Scanner(System.in);
		

		
		
		System.out.println("How many student's are been polled for these DELICIOUS JELLY DONUTS?");
		int num = input.nextInt();
		
		double rating = 2;
		int tot[] = new int [num+1];
		double counter = 0;
		
		for(int count = 0; count<num; count++)
		{	
			System.out.println("How much did you like our jolly golly belly filling donuts?\nPlease rate on a scale of 1-4!!!");
			rating = input.nextInt();
			
			
			
			if(rating<1 || rating>4)
			{
				System.out.println("Only enter a value between 1 and 4!!!\nPlease try again.");
				count--;
			}
			else
			{
				System.out.println("Thank you for your feed back!\nEnjoy the rest of your day!\n\n");
				tot[count] += rating;
			}
		}
		
		int times = 1;
		for(int count = 1; count<=4; count++)
		{
			for(times = 0; times<=num; times++)
			{
				if(tot[times] == count)
				{
					counter++;
				}
			}
			System.out.println("The number " + count + " has a " + ((counter/num)*100) + "% chance of appearing");
			counter = 0;
		}
			
		
		System.out.println("That's everyone!");
		
		/*
How many student's are been polled for these DELICIOUS JELLY DONUTS?
5
How much did you like our jolly golly belly filling donuts?
Please rate on a scale of 1-4!!!
1
Thank you for your feed back!
Enjoy the rest of your day!


How much did you like our jolly golly belly filling donuts?
Please rate on a scale of 1-4!!!
1
Thank you for your feed back!
Enjoy the rest of your day!


How much did you like our jolly golly belly filling donuts?
Please rate on a scale of 1-4!!!
1
Thank you for your feed back!
Enjoy the rest of your day!


How much did you like our jolly golly belly filling donuts?
Please rate on a scale of 1-4!!!
2
Thank you for your feed back!
Enjoy the rest of your day!


How much did you like our jolly golly belly filling donuts?
Please rate on a scale of 1-4!!!
3
Thank you for your feed back!
Enjoy the rest of your day!


The number 1 has a 60.0% chance of appearing
The number 2 has a 20.0% chance of appearing
The number 3 has a 20.0% chance of appearing
The number 4 has a 0.0% chance of appearing
That's everyone!

		 */
	}

}
