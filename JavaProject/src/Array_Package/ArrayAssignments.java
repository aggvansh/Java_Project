
package Array_Package;

public class ArrayAssignments {

	public static void main(String[] args) {
		
		//1) Sum of Array Elements
		
	/*	int a[]= {10,20,30,40,50,60};
		
		int sum=0;
		
		for(int num:a)
		{
			sum=sum+num;
		}

		System.out.println("Sum of Array Elements is :"+sum);
		*/
//-----------------------------------------------------------------------------------------------------------------		
	//2)
		
	/*	int a[]= {1,2,3,4,5,6,7,8,9,10};		
		
		System.out.println("Even Elements from Array");
		for(int i:a)
		{
			if(i%2==0)
			System.out.println(i);
		}
		
		System.out.println("Odd Elements from Array");
		for(int i:a)
		{
			if(i%2!=0)
			System.out.println(i);
		}
		*/
		
//----------------------------------------------------------------------------------------------------------------------------------------
 //3) Find Missing Number in Array
		
	/*	int a[]= {1,2,3,4,6,7,8,9,10};
		int sum=0;
		
		for(int num:a)
		{
			sum=sum+num;
		}
		
		int sum1=0;
		
		for(int num1=1;num1<=10;num1++)
		{
		   sum1=sum1+num1;
		}
		System.out.println("The Missing Number Element in Array is "+(sum1-sum));
		*/
//-----------------------------------------------------------------------------------------------------------------------------------------		
//4) Sorting Data in array		
		
	/*	int a[]= {25,5,10,2,80,50,150,75,200,60,100,40,90};
		
		Arrays.sort(a);
		
		for(int i:a)
		{
			
		System.out.println(i);
		
		} */

//----------------------------------------------------------------------------------------------------------------------------------------------
		
	/*	int A[]= {10,20,30,40,50,60};
		boolean flag=false;
	    
		for(int i:A)
		{
			if(i==20)
			{
				System.out.println("Element is found"+" "+i);
				flag=true;
				 break;
			}
		}
			if(flag==false)
			{
				System.out.println("Element is not found");
				
			}
			*/
//---------------------------------------------------------------------------------------------------------------------
		
	/*    String S[]= {"abc", "pqr", "mno", "xyz"};
	  
		String value="pqr";
		boolean flag=false;
	
		for(String i:S)
		{
		  if(i.equals(value))
			{
			 System.out.println("Element found");
			 flag=true;
			 break;
				
			}
			
		}
		
			if(flag==false)
			{
				System.out.println("Element not found");
				
			}
			*/
//---------------------------------------------------------------------------------------------------------------------
		
	/*	String s="Welcome to java";
		String rev="";
		
		for(int i=(s.length()-1);i>=0;i--)
        {
        	rev=rev+s.charAt(i);
        }
		
		System.out.println(rev);
		*/
//---------------------------------------------------------------------------------------------------------------------
	
		
		
		String a="Hello";
		String b="World";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

			
			
		
		
		
		
		
		
		
		
	}

}
