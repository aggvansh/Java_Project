package Java_InterfaceOverridingsuperfinalkeyword;

/*Interface
--------------------------
An Interface in java is a blueprint of a class
Interface contains final and static variables
Interface contains abstract method.
An abstract method is a method contains definition but not body
Method in interface are public by default
Interface support the functionality of multiple inheritance.
We can define interface with interface keyword
A class extends another class, an interface extends another interface but a class implements an interface
We can create Object reference for Interface but we can not instantiate interface

*/

interface A
{
	int a=10;  // by default variables in interface are static and final
	
	 void m1(); // abstract method, by default public
	
}



public class Java_Inheritance implements A
{
    public void m1()
    {
    	System.out.println(a);
    }
    
	public static void main(String[] args) {
		
		Java_Inheritance obj=new Java_Inheritance();
        obj.m1();
        
		/*A obj1=new Java_Inheritance();
         obj1.m1();*/
        
	}

}
