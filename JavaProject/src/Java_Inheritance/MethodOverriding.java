package Java_Inheritance;


class Bank
{
	double rateofInterest()
	{
		return 0;
	}
}
	
class SBI extends Bank
{
	double rateofInterest()
	{
		return 10.5;
	}
}
	
class ICICI extends Bank
{
	double rateofInterest()
	{
		return 12;
	}
}	
	
class Axis extends Bank
{
	double rateofInterest()
	{
		return 15;
	}
}	
public class MethodOverriding {
	
public static void main(String[] args) {
		
      SBI sbi=new SBI();
      System.out.println(sbi.rateofInterest());
      
      ICICI icici=new ICICI();
      System.out.println(icici.rateofInterest());
      
      Axis axis=new Axis();
      System.out.println(axis.rateofInterest());
      
      
	
	
	
	}

}
