package Test1;

import java.util.Scanner;

public class YangLu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		//Declare the scanner early on
		Scanner input = new Scanner(System.in);
		
		//Title to indicate that this is the info gathering session
		System.out.println("Student Information");
		
		//First name asked, variable is simply called first
		System.out.print("First name: ");
		String first = input.next();
		System.out.println(first);
		
		//Last name asked, variable is last
		System.out.print("Last name: ");
		String last = input.next();
		System.out.println(last);
		
		//This line indicates it means module marks
		System.out.println("Marks for modules:");
		
		//I used double since half marks are often given and marks are rarely exactly a whole percent
		
		//Module 1 mark
		System.out.print("Module 1:         ");
		double m1 = input.nextDouble();
		System.out.println(m1);
		
		//Module 2 mark
		System.out.print("Module 2:         ");
		double m2 = input.nextDouble();
		System.out.println(m2);
		
		//Module 3 mark
		System.out.print("Module 3:         ");
		double m3 = input.nextDouble();
		System.out.println(m3);
		
		//Performance mark
		System.out.print("Performance:      ");
		double perf = input.nextDouble();
		System.out.println(perf);
		
		//Module average with weight considered and in percent form
		double module = (((m1/50)+(m2/50)+(m3/50))/3)*(0.9)*100;
		
		//Performance average with weight considered and in percent form
		double performance = (perf/10)*0.1*100;
		
		//Find the overall average by adding two averages together
		//It goes very far into decimals, but precision is good, worst case scenario is simply ignoring the really far ones 
		double ave = (module + performance);
		
		//The marks output
		//The System.out.println(); is to create an empty line as the sample shows
		System.out.println("_______________________________________");
		System.out.println("Student Marks for Rugby Module:");
		System.out.println();
		System.out.println("Name:              " + first + " " + last);
		System.out.println();
		System.out.println("Marks for modules:");
		System.out.println("Module 1:          " + m1);
		System.out.println("Module 2:          " + m2);
		System.out.println("Module 3:          " + m3);
		System.out.println("Performance:       " + perf);
		System.out.println();
		System.out.println("Student Average:   " + ave + "%");
		System.out.println();
		System.out.println("_______________________________________");
		//As most programs have, there are credits/advertisement
		System.out.println("                            By: Yang Lu");
		
		/*
Student Information
First name: Joe
Joe
Last name: Soap
Soap
Marks for modules:
Module 1:         25
25.0
Module 2:         35
35.0
Module 3:         45
45.0
Performance:      9
9.0
_______________________________________
Student Marks for Rugby Module:

Name:              Joe Soap

Marks for modules:
Module 1:          25.0
Module 2:          35.0
Module 3:          45.0
Performance:       9.0

Student Average:   72.00000000000001%

_______________________________________
                            By: Yang Lu

		 */
		
	}

}
