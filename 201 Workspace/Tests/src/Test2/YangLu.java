package Test2;

import java.util.Scanner;

public class YangLu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		//Scanner is imported in early on
		Scanner input = new Scanner(System.in);
		
		//The line
		System.out.println("______________________________________________________________________");
		System.out.println("Program to calculate the commission earned by a clothing salesperson:");
		
		//Name input
		System.out.println("What is the employee's name?:");
		String name = input.nextLine();
		
		//Sales on day 1 input
		System.out.println("What was the value of sales on day 1?");
		double s1 = input.nextDouble();
		
		//Sales on day 2 input
		System.out.println("What was the value of sales on day 2?");
		double s2 = input.nextDouble();
		
		//Sales on day 3 input
		System.out.println("What was the value of sales on day 3?");
		double s3 = input.nextDouble();
		
		//Sales on day 4 input
		System.out.println("What was the value of sales on day 4?");
		double s4 = input.nextDouble();
		
		//Sales on day 5 input
		System.out.println("What was the value of sales on day 5?");
		double s5 = input.nextDouble();
		
		//total sales, simply add them together
		double st = s1 + s2 + s3 + s4 + s5;
		
		//commission calculation, 9% = 0.09
		double com= st * 0.09;
		
		//declared to bonus so it's easier to utilise in the if/else
		double bonus;
		
		if(st>=2000)
			bonus = 600; //600 dollars if bonus is 2k or over
		else
			//The code would not run here if it was already over 2k
			if(st>=1000)
				bonus = 250; //250 dollars if bonus is between 2k and 1k
			else
				bonus = 0; //Still need a value for the bonus
		
		//Here is the output, the 2 "/n" are new lines
		System.out.println("\n" + "\n" + "Sales Report:");
		System.out.println("Name:                  " + name);
		System.out.println("Sales:");
		System.out.println("Day one:               " + "$" + s1);
		System.out.println("Day two:               " + "$" + s2);
		System.out.println("Day three:             " + "$" + s3);
		System.out.println("Day four:              " + "$" + s4);
		System.out.println("Day five:              " + "$" + s5);
		System.out.println("Total Sales:           " + "$" + st);
		System.out.println("Commission:            " + "$" + com + " at 9.0%");
		System.out.println("Total salary earned:   " + "$" + (bonus + com + 200) + " (including basic rate of 200.0)");
		System.out.println("______________________________________________________________________");
		//Advertisements!   :D
		System.out.println("                                                      By: Yang Lu");
		
		/*
______________________________________________________________________
Program to calculate the commission earned by a clothing salesperson:
What is the employee's name?:
Mr Blakey
What was the value of sales on day 1?
200
What was the value of sales on day 2?
200
What was the value of sales on day 3?
200
What was the value of sales on day 4?
200
What was the value of sales on day 5?
200


Sales Report:
Name:                  Mr Blakey
Sales:
Day one:               $200.0
Day two:               $200.0
Day three:             $200.0
Day four:              $200.0
Day five:              $200.0
Total Sales:           $1000.0
Commission:            $90.0 at 9.0%
Total salary earned:   $540.0 (including basic rate of 200.0)
______________________________________________________________________
                                                      By: Yang Lu

		 */
	}

}
