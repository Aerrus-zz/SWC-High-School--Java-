package e3;

public class stackingINTEREST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		SavingsAccount SA = new SavingsAccount(1000);
		
		SA.addInterest();
		SA.addInterest();
		SA.addInterest();
		SA.addInterest();
		SA.addInterest();
		
		System.out.println(SA.getBalance());
		
		
		/*
		 * 1610.51
		 */
	}

}
