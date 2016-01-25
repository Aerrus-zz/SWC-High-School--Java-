package e2;

import account.bankACCOUNT;

public class interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankACCOUNT momsavings = new bankACCOUNT(1000,0);
		
		momsavings.setInterest(10);
		momsavings.addBalance();
		
		System.out.println(momsavings.getBalance());
		
		
		/*
		 * 1100.0
		 */
		
	}

}
