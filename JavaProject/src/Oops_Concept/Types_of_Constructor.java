package Oops_Concept;

public class Types_of_Constructor {
	
	int x;
	int y;
	 
	Types_of_Constructor() // Default Constructor
	
	{
		x=10;
		y=20;
	}
	
	Types_of_Constructor(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	
	
	

	public static void main(String[] args) {
		
		Types_of_Constructor cm=new Types_of_Constructor(); // Invoke Default Constructor
		cm.display();
		
		Types_of_Constructor cm1=new Types_of_Constructor(100,200);// Invoke Parameterized Constructor
		cm1.display();
		
		
		
		
		

	}

}
