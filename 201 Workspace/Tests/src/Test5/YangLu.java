package Test5;

import java.util.Random;
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
		
		//MakinG the number selection
		System.out.println("Lottery/Random Number Program\nWhat is the number you are selecting?");
		int user = input.nextInt();
		
		//Everything I need is declared
		Random rn = new Random();
		int num[] = new int[10001], extreme[] = new int[51];
		int appear = 0, numcount = 0, most1 = 0, most2 = 0, least1 = 10000, least2 = 10000, mostnum = 1, leastnum = 1;
		
		//Assignment of random numbers to the array
		for(int count = 0; count<=10000; count++)
		{
			num[count] = rn.nextInt(50);
		}
		
		
		//Counts how many times the user's number appears
		for(int count = 1; count<=10000; count++)
		{
			if(num[count] == user)
			{
				appear++;
			}
		}
		
		//Counting of all the other numbers
		//Assigning number of times each number appears in an array
		//Displaying how many times each number comes up
		int times = 1;
		for(int count = 0; count<50; count++)
		{
			for(times = 1; times<=10000; times++)
			{
				if(num[times] == count)
				{
					numcount ++;
				}
			}
			extreme[count] = numcount;
			System.out.println((count+1) + " : " + numcount);
			//Resetting the count
			numcount = 0;
		}
		
		//Detecting least number of times. The value comes up only when a less number is cycled through. It also recorsd which number it is by letting the count number go through
		for(int count = 0; count<50; count++)
		{
			least2 = extreme[count];
			if (least2 < least1)
			{
				leastnum = count;
				least1 = least2;
			}
		}
		
		//Detecting most number of times. The value comes up only when a larger number is cycled through. It also records which number it is by letting the count number go through
		for(int count = 0; count<50; count++)
		{
			most2 = extreme[count];
			if (most2 > most1)
			{
				mostnum = count;
				most1 = most2;
			}
		}
		
		for(int count = 0; count < num.length; count++)
		{
			if(num[count] == user)
			{
				System.out.println("\nYour number " + user + " appeared first at the " + (count+1) + " number.");
				break;
			}
				
		}
		
		//Print out of the major final results
		System.out.println("Your number " + user + " appeared " + appear + " times.");
		System.out.println("The most frequent appearances was " + mostnum + " at "+ most1);
		System.out.println("The least frequent appearances was " + leastnum + " at "+ least1);
		System.out.println("\nThis program was brought to you by Yang Lu");
		
		/*
Lottery/Random Number Program
What is the number you are selecting?
12
1 : 202
2 : 184
3 : 216
4 : 225
5 : 216
6 : 184
7 : 222
8 : 225
9 : 226
10 : 203
11 : 192
12 : 193
13 : 201
14 : 194
15 : 209
16 : 185
17 : 201
18 : 214
19 : 206
20 : 172
21 : 201
22 : 199
23 : 211
24 : 199
25 : 186
26 : 202
27 : 198
28 : 205
29 : 180
30 : 203
31 : 218
32 : 193
33 : 203
34 : 217
35 : 181
36 : 190
37 : 192
38 : 175
39 : 197
40 : 182
41 : 215
42 : 191
43 : 218
44 : 186
45 : 207
46 : 204
47 : 184
48 : 213
49 : 178
50 : 202

Your number 12 appeared first at the 22 number.
Your number 12 appeared 201 times.
The most frequent appearances was 8 at 226
The least frequent appearances was 19 at 172

This program was brought to you by Yang Lu

		 */
	}

}
