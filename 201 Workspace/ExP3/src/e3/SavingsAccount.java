package e3;

public class SavingsAccount{
	
	
	public SavingsAccount (double inBalance)
	{
	balance = inBalance;
	}

	
	public void addInterest()
	{
		this.balance = (balance + (balance * 0.1));
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	private double balance;
	
	
	
}
