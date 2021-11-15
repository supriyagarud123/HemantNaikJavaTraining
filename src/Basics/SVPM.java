package Basics;

public class SVPM {
	public static void main(String[] args) {

		//This is my entry point		
		System.out.println("I am in SVPM class");
		
		//----------------------------Integral data type----------------------------
		byte _byte=100; 		//8 bits and Range from -128 to 127 (like u can use this type for Marks)
		short _short=10000;		//16 bits and Range from -32,768 to 32,767 (like u can use this type for ....)
		int _int=1000000;		//32 bits and Range from -2,147,483,648 to 2,147,483,647 (like u can use this type for ....)
		long _long=100000000;	//64 bits and Range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (like u can use this type for ....)
		
		
		//-----------------------------Floating data type--------------------------------
		float _float=1;					//32 bits and Range from 1.23e100f, -1.23e-100f, .3f, 3.14F
		double _double=100000.262262; 	//64 bits and Range from 1.23456e300d, -1.23456e-300d, 1e1d
		
		char _char='A';					//16 bits
		boolean _boolean=true;			//No size allocated to boolean
		
		
		String _string="Supriya Naik";					//It is non primitive data type bec it is a class in JAVA		
		System.out.println(_string + " Ahmednagar");	// when u see "+" symbol that time, it is used for concatenation
			
		
	}
}
