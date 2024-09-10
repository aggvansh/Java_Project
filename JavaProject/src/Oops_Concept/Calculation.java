package Oops_Concept;

public class Calculation {
	

	  int A=10;
	  int B=20;
	  
	    void sum()//Case1 Not taking any Parameter and also not returned any value
	    {
		  System.out.println(A+B);
	    }
	  
	    int sum1()//Case2 Not taking any Parameter but returning some value
	  
	  {
		return(A+B);
	  }
	  
        void sum(int x,int y)//Case3 Taking Parameter but not returning any value
	  
	     {
		   System.out.println(x+y);
	     }
	  
        int sum1(int x,int y)//Case4 Taking Parameter and also returning some value
  	  
	     {
		    return(x+y);
	     }
	  

	   public static void main(String[] args) {
		
		 Calculation Cal=new Calculation();
		 
		 //1
		 Cal.sum();	
		 
		//2    
		 System.out.println(Cal.sum1());
		
        //3	
		  Cal.sum(10, 20);
		  
		//4
		    System.out.println(Cal.sum1(20, 80));
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
