package weight;

import java.util.Scanner;

public class weightONotherPLANETS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		int weight = input.nextInt();
		System.out.println("Which planet do you want to go to? (select number)");
		System.out.println("We have:");
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		int planet = input.nextInt();
		switch(planet)
		{
		case 1:
			System.out.println("Your weight on Voltar is " + (weight*0.091));
			break;
		case 2:
			System.out.println("Your weight on Krypton is " + (weight*0.720));
			break;
		case 3:
			System.out.println("Your weight on Fertos is " + (weight*0.865));
			break;
		case 4:
			System.out.println("Your weight on Servontos is " + (weight*4.612));
			break;
		default:
			System.out.println("Only select from the planets above!");
		}
		
		/*
		 What is your weight?
		 100
		 Which planet do you want to go to? (select number)
		 We have:
		 1. Voltar
		 2. Krypton
		 3. Fertos
		 4. Servontos
	  	 2
		 Your weight on Krypton is 72.0

		 */
		
		
		
	}

}
