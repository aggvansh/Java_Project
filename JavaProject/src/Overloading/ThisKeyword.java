package Overloading;

public class ThisKeyword {
	
	// Every variable can take some storage so try to minimize use of no of variables

	int a,b;// instance variable or class variables
	
	void add(int a, int b) // method variables or external variable
	{
		this.a=a;
		this.b=b;
	}
	
	
	void add1()	
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		
		th.add(10, 20);
		th.add1();
		
	}

}
