package student;

public class Student {
	
	public Student (String inName, int inAge, int inMark)
	{
		name = inName;
		age = inAge;
		mark = inMark;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAttendance() {
		return attendance;
	}
	
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		
		this.mark = mark;
		total += mark;
		numMarks++;
	}

	public double getAverage() {
		double average = (double)total/ numMarks;
		return average;
	}
	
	
	
	String name;
	private int age;
	private int attendance;
	private int mark;
	private int total;
	private int numMarks;

	

}
