package e4;

public class Employee {

	public Employee(String inName, double inSalary)
	{
		name = inName;
		salary = inSalary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	
	private String name;
	private double salary;
	
}
