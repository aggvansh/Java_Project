package Overloading;

public class Overloading_As {
	
	int getvalues(int a, int b, int c)//1
	{
		return(a+b+c);
	}
	
	int getvalues(int a, int b)//2
	{
		return(a+b);
	}
	
	double getvalues(double a, double b, double c)//3
	{
		return(a+b+c);
	}
	
	double getvalues(double a, double b)//4
	{
		return(a+b);
	}

	public static void main(String[] args) {
		
		Overloading_As Agn=new Overloading_As();
		
		int result=Agn.getvalues(10, 20, 30);
		double result1=Agn.getvalues(10.3, 20.5, 30.9);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(Agn.getvalues(10, 20));
		System.out.println(Agn.getvalues(10, 20, 30));
		System.out.println(Agn.getvalues(10.1, 20.4));
		System.out.println(Agn.getvalues(10.3, 20.5, 15.2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
