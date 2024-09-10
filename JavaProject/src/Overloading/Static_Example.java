package Overloading;

public class Static_Example {
	// Static keyword applicable for variables and method
	static int x=10;
	static String s="Welcome";
	int y=20;

	static void m1()
	{
		System.out.println("This is m1 - Static Method");
	}
	
	void m2()
	{
		System.out.println("This is m2 - Non-Static Method");
	}
	
	void m3()
	{
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
	/*	System.out.println(Static_Example.x);//Static method can only static stuff(Directly means without creating an object)
		Static_Example.m1();// when main method is on separate class then call a method by this 
		
		Static_Example St=new Static_Example();
		
		System.out.println(St.y);//Static method can also access Non-static stuff but by creating an object)
		St.m2();
		
		
		St.m3();// Non-Static method can access both static and non-static stuff directly.
		*/
		
		System.out.println(Static_Example.s.length());
		

	}

}
