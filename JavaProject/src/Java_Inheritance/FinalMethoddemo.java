package Java_Inheritance;

 final class Bike
{
	 final void run()// final method, so we cannot override this method in child class
	{
		System.out.println("Running.......");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Running late.......");
	}
}
  public class FinalMethoddemo {

	public static void main(String[] args) {
		
		Honda hm=new Honda();
		hm.run();
		

	}

}
