package Test4;

import java.util.Scanner;

public class YangLu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		
		//Scanner declared early on
		Scanner input = new Scanner(System.in);
		
		//Intro
		System.out.println("Program to traffic light student mark to benchmark value");
		
		//Setting the benchmark value
		System.out.println("Please enter the benchmark value.");
		int bench = input.nextInt();
		
		//Asking how many students are being tested
		System.out.println("How many students are being tested?");
		int number = input.nextInt();
		
		//initial if else to see if the user is entering a valid number of students. It cannot be equal or less than zero
		if(number<=0)
		{
			System.out.println("Please enter a valid number.");
		}
		else
		{
			//Looping the number of times the user entered before
			for(int count = 0; count <number; count++)
			{
				System.out.println("Please enter the student mark:");
				int mark = input.nextInt();
				
				//Detect if marks were 10% above
				if(mark >= (bench + 10))
				{
					System.out.println("Green!!: the student has scored 10% above the benchmark.");
				}
				else 
				{
					//Detect if marks were 10% below
					if(mark<(bench - 10))
					{
						System.out.println("Red!!: the student has scored 10% below the benchmark.");
					}
					else
					{
						//It is Amber if it didn't match either
						//Put 'in the middle' last because it's easier to not have a range detection
						System.out.println("Amber!!: the student has scored within 10% of the benchmark.");
					}
				}	
			}
		}
		
		//Advertisements!!!
		System.out.println("\nEnd of traffic light testing, this program was brought to you by Yang Lu.");
		
		/*
Please enter the benchmark value.
75
How many students are being tested?
4
Please enter the student mark:
85
Green!!: the student has scored 10% above the benchmark.
Please enter the student mark:
84
Amber!!: the student has scored within 10% of the benchmark.
Please enter the student mark:
65
Amber!!: the student has scored within 10% of the benchmark.
Please enter the student mark:
64
Red!!: the student has scored 10% below the benchmark.

End of traffic light testing, this program was brought to you by Yang Lu.
		 */
		
	}

}
