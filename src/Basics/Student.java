package Basics;

public class Student {
	// Default Constructor
	public Student() {
		// Static methode use from different Class
		System.out.println("My college address is " + SVPM.getAddress() + " called from Student class");
	}

	// Parametrized Constructor
	public Student(String Name) {
		// Static methode use from different Class
		System.out.println(Name);
	}
	
	//Non static method
	public String getStudentDetails(String details)
	{
		return details;
	}
	
	public Boolean validatedStudent(String name)
	{
		//Add ur logic to validate student
		return true;
	}
}
