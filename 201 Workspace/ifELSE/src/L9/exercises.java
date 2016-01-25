package L9;

import java.util.Scanner;

public class exercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		//14. Not equal
		
		//15. Equal
		
		//16. 200
		//	  20
		
		//17.
		Scanner input = new Scanner(System.in);
		System.out.println("Is ___ equal to 34?");
		int g = input.nextInt();
		boolean b;
		if (g==34)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		System.out.println(b);
		
		//18. b was declared in 17
		System.out.println("Is ___ an even number?");
		int k = input.nextInt();
		if ((k %2)==0)
			b = true;
		else
			b= false;
		System.out.println(b);
		
		//19.
		Scanner pass = new Scanner(System.in);
		System.out.println("What is the password?");
		String password = pass.nextLine();
		if(password.equals("XRay"))
			System.out.println("Password entered successfully.");
		else
			System.out.println("Incorrect password.");
		
		/*
		 * Is ___ equal to 34?
		   35
		   false
		   Is ___ an even number?
		   68
		   true
		   What is the password?
		   XRay
		   Password entered successfully.
		 */
		
	}

}
