package JavaFirstPackage;

public class Operators {


	public static void main(String[] args)
	{
		
		int a=10;
		int b=20;
		
		// Arithmetic operators ---> + - * / %
		System.out.println("-----------------------Arithmetic operator---------------------");
		
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Sum of a and b is:" +(b-a));
		System.out.println("Sum of a and b is:" +(a*b));
		System.out.println("Sum of a and b is:" +(a/b));
		System.out.println("Sum of a and b is:" +(a%b));
		
		// Relational Operators (Comparison operators)--->  == < >  <=  >= !=
		
		//Always return boolean value
		System.out.println("-----------------------Relational operator---------------------");
		
		System.out.println(a==b);//false
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		
		// Logicals Operators &&  ||   !
		
		boolean x=true;
		boolean y=false;
		System.out.println("-----------------------Logiacl operator---------------------");
		
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		System.out.println("-----------------------Incremental/decrement operator---------------------");
		
		// Incremental/decrement Operators  ++  --
		
		a=10;
		b=20;
		a=a+1;
		a++;
		int c=a;
		
		c++;
		
		b=b+1;
		b++;
		
		int d=c++;
		
		System.out.println(a);//12
		System.out.println(b);//22
		System.out.println(c);//14
		System.out.println(d);//13
		
		// Assignment operator  = (It is only assigned a values to the variable)

	}

}
