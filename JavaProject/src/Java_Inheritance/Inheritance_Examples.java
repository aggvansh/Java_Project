package Java_Inheritance;

/*Inheritance: Aquiring all the properties & behavior from one class to another class is called as inheritance.

	Types of Inheritance
1)Single
2)Multilevel
3)Hierarchical
4)Multiple
5)Hybrid*/

  class A
     {
      int a;
      void display()
      {
	   System.out.println(a);
      }
     }
  
  class B extends A
    {
     int b;
     void print()
     {
	  System.out.println(b);
     }
    }

 class C extends B
    {
	  int c;
	  void show()
	  {
		System.out.println(c);
	  }
    }

public class Inheritance_Examples
   {
	
	public static void main(String[] args) {
		
		   
	/*	A aobj=new A();//1
		   
		   aobj.a=10;
		   aobj.display();
		   
		B bobj=new B();//2
		
		bobj.a=20;
		bobj.b=40;
		bobj.display();
		bobj.print();
		*/
		
		C cobj=new C();//3
		
		cobj.a=40;
		cobj.b=30;
		cobj.c=50;
		cobj.display();
		cobj.print();
		cobj.show();
	
	}


}