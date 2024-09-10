 package Java_Inheritance;

public class FinalVariableDemo {

	final int speed=40;// final variable, so we cannot change this value
	
	public static void main(String[] args) {
		
		FinalVariableDemo fm=new FinalVariableDemo();
	//	fm.speed=100;// Compile time Error
		System.out.println(fm.speed);
		

	}

}
