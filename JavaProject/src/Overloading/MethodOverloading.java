package Overloading;

public class MethodOverloading {
	
	
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add (int a, double b)
	{
		System.out.println(a+b);
	}
	
	void add (double a, double b)
	{
		System.out.println(a+b);
	}
	
	void add (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		MethodOverloading MO=new MethodOverloading();
		
		MO.add(10, 20);
		MO.add(10, 20.5);
		MO.add(10.12, 20.38);
		MO.add(10, 20, 40);
		
		
		
	
		
		
		
		
	}

}
