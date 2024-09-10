package Overloading;

public class Constructor_Overloading {

     Constructor_Overloading (int a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructor_Overloading (int a, double b)
	{
		System.out.println(a+b);
	}
	
	Constructor_Overloading (double a, double b)
	{
		System.out.println(a+b);
	}
	
	Constructor_Overloading (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		Constructor_Overloading obj1=new Constructor_Overloading(10,20);
		Constructor_Overloading obj2=new Constructor_Overloading(10,20,40);
		Constructor_Overloading obj3=new Constructor_Overloading(10, 40.5);
		Constructor_Overloading obj4=new Constructor_Overloading(10.4,20.8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
