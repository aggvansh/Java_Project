package Java_Inheritance;

public class Animal {
	
 String color="white";
  Animal()
	{
		System.out.println("Animal is Created");
	}
  /*void eating()
 {
	 System.out.println("Eating............");
 }*/
}

class Dog extends Animal
{
	String color="Black";
	Dog()
	{
		super();//Invoked parent class constructor
		System.out.println("Dog is Created");
	}
	
	/*void dispalycolor()
	  {
		 System.out.println(color);
		 System.out.println(super.color);
	  }
	void eating()
	{
		System.out.println("Eating Bread.........");
		super.eating();
	}*/
}