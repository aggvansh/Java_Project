package Java_Inheritance;

 class Parent
 {
	 int a;
	 void display()
	 {
		 System.out.println(a);
	 }
 }

 class Child1 extends Parent
 {
	 int b;
	 void print()
	 {
		 System.out.println(b);
	 }
 }

 class Child2 extends Parent
 {
	 int c;
	 void show()
	 {
		 System.out.println(c);
	 }
 }

public class HierarchyInheritance {

	public static void main(String[] args) {
		
      Child1 ch1=new Child1(); 
      ch1.a=100;
      ch1.b=200;
      ch1.display();
      ch1.print();
		
	  Child2 ch2=new Child2();	
	  ch2.a=10;
	  ch2.c=20;
	  ch2.display();
	  ch2.show();
		
	}

}
