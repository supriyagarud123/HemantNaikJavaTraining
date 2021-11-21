package Basics;

public class SVPM {
	// public static void main(String[] args)-->This is my entry point
	// public static void main(String[] args)--> This is also one type of method in
	// JAVA, It is Called as Main method
	public static void main(String[] args) {

		System.out.println("I am in SVPM class");

		// ----------------------------Integral data type----------------------------
		byte _byte = 100; // 8 bits and Range from -128 to 127 (like u can use this type for Marks)
		short _short = 10000; // 16 bits and Range from -32,768 to 32,767 (like u can use this type for ....)
		int _int = 1000000; // 32 bits and Range from -2,147,483,648 to 2,147,483,647 (like u can use this
							// type for ....)
		long _long = 100000000; // 64 bits and Range from -9,223,372,036,854,775,808 to
								// 9,223,372,036,854,775,807 (like u can use this type for ....)

		// -----------------------------Floating data
		// type--------------------------------
		float _float = 1; // 32 bits and Range from 1.23e100f, -1.23e-100f, .3f, 3.14F
		double _double = 100000.262262; // 64 bits and Range from 1.23456e300d, -1.23456e-300d, 1e1d

		char _char = 'A'; // 16 bits
		boolean _boolean = true; // No size allocated to boolean

		String _string = "Supriya Naik"; // It is non primitive data type bec it is a class in JAVA
		System.out.println(_string + " Ahmednagar"); // when u see "+" symbol that time, it is used for concatenation

		// Static methode use in same Class
		System.out.println("My college address is " + getAddress());

		// Example for static method call from other class
		Student student = new Student();

		// Example for Parametrized constructor
		Student student2 = new Student("Supriya");

		// Non static method invoke
		SVPM svpm = new SVPM();
		System.out.println(svpm.getCollegeDetails("SVPM College Details..."));
	}

	// Static method
	public static String getAddress() {
		String address = "Malegaon";

		return address;
	}

	// Non Static method
	public String getCollegeDetails(String detail) {
		
		//Created the object because class is different
		Student student=new Student();
		System.out.println(student.getStudentDetails("Student details..."));
		
		//Don't need the object to call non static method bec it is in same class 
		System.out.println(getCollegeLocation());
		
		return detail;
	}
	
	// Non Static method
	public String getCollegeLocation()
	{
		return "Baramati";
	}	
}
