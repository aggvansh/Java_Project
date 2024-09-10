package Oops_Concept;

public class Example_2 {
	
	int x;
	int y;
	int z;
	
	    Example_2(int a, int b, int c)
	    {
	    	x=a;
	    	y=b;
	    	z=c;
	    }
	
	   void sum()
	   {
		   System.out.println("Sum of the values are:"+(x+y+z));
	   }
	
	public static void main(String[] args) {
		
		Example_2 Exp=new Example_2(100,200,300);
		
		Exp.sum();

	}

}
