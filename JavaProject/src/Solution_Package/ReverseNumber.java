package Solution_Package;

public class ReverseNumber {
	public static void main(String args[])
	   {
	      int number=234564;
	      int reverse = 0;
	 
	      while(number != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + number%10;
	          number = number/10;
	      }   
	      if(reverse == number)
	      {
	    	  System.out.println("The number is Palindrone");
	      }
	      else
	      {
	    	  System.out.println("The number is Not Palindrone");
	      }  
	      
	      
	 
	      System.out.println("Reverse of the number is " + reverse);
	   }
}
