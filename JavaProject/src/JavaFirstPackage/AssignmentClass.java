package JavaFirstPackage;
    

public class AssignmentClass {
 
	public static void main(String[] args){
		
	//Assignments:
//----------------------------------------------------------------------------------------------
	/* int x=74;
	 int y=36;
	
	    int z=74;
	    x=y;
	    y=z;
			 
	 System.out.println("The value of x is"+" "+x);
	 System.out.println("The value of y is"+" "+y);
	 */
//------------------------------------------------------------------------------------------------------
	/* int x=5;
	 int y=1;
	
	 while(y<=10)
		 {
		 System.out.println(("5x")+y+"="+x);
		 x=x+5;
		 y++;
		 }
	*/	 
//------------------------------------------------------------------------------------------------------	

	/*
	   int x=99999999;
	   int y=1;
	 
	 while(x>=9)
	 {
		if(x==9)
		{
			System.out.println(y);//No of digit output should be 8
		}
		 x=x/10;
		 y++;
	 }
	 */
//------------------------------------------------------------------------------------------------------------	
	 
	/* int x=50;
	 int y=-50;
	 
	 if(x>0)
	 {
		 System.out.println("Number is Positive"+" "+x);
	 }
	 else
	 {
		 System.out.println("Number is Negative"+" "+y);
	 }
	 */
//---------------------------------------------------------------------------------------------------------------- 
	 
/*	 int a=10;
	 int b=8;
	 int c=5;
	 
	 if(a>b & a>c)
	 {
		 System.out.println("a is the greatest of three number"+" "+a);
	 }
	 else 
		 if(b>a & b>c)
		 {
			 System.out.println("b is the greatest of three number"+" "+b); 
		 }
	 else
	 {
		 System.out.println("c is the greatest of three number"+" "+c);
	 }
	 */
//-------------------------------------------------------------------------------------------------------------------------------------	 
     
	int reverse=0;
	int i=12345678;
	
	 for(;i!=0;i=i/10)
	 {
	    int rem=i%10;
	    
		reverse=reverse*10+rem;
	 }
	 
	 if(reverse== i)
	 {
		 System.out.println("The reverse Number is Palindrome");
	 }
	 else
	 {
		 System.out.println("The reverse Number is Non-Palindrome");
	 }
	 System.out.println("The reverse of the given number is: " + reverse);
		
		 
	 
	 
	 
//---------------------------------------------------------------------------------------------------------------------- 
	 
	
	  
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
}
