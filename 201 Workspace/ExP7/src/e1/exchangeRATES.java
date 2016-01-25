package e1;

import java.util.Scanner;

public class exchangeRATES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Scanner outer = new Scanner(System.in);
		System.out.print("Please enter current exchange rates from USD to Euros.  ");
		double rates = outer.nextDouble();
		double conv = 0;
		boolean x = true;
		do
		{
			Scanner inner = new Scanner(System.in);
			System.out.println("Enter your USD.");
			String USD = inner.next();
			
			if(USD.equalsIgnoreCase("q"))
			{
				x = false;
			}
			else
			{
				conv = Double.parseDouble(USD);
				System.out.println(USD + " USD is " + (conv * rates) + " Euros");
			}
				
		}
			while(x == true);
		System.out.println("Ending Program");
		
		/*
		Please enter current exchange rates from USD to Euros.  2
		Enter your USD.
		1
		1 USD is 2.0 Euros
		Enter your USD.
		2
		2 USD is 4.0 Euros
		Enter your USD.
		3
		3 USD is 6.0 Euros
		Enter your USD.
		q
		Ending Program
		 */
	}

}
