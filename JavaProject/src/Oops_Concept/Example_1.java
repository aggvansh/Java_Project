package Oops_Concept;

public class Example_1 {
	
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	void StuData(String Name, int ID)
	{
		Sname=Name;
		SID=ID;
		
	}
	
	void StuMarks(int num1, int num2, int num3)
	{
		Sub1=num1;
		Sub2=num2;
		Sub3=num3;
	}	
	
	void TotalMarks()
	{
		System.out.println("Name:"+Sname);
		System.out.println("SID:"+SID);
		System.out.println("Subject Marks:"+Sub1+" "+Sub2+" "+Sub3);
		System.out.println("Total Marks:"+(Sub1+Sub2+Sub3));
	}
	
	
	
	public static void main(String[] args) {
		
		Example_1 Stu1=new Example_1();
		
		Stu1.StuData("Vansh", 101);
		Stu1.StuMarks(70, 60, 80);
		Stu1.TotalMarks();
		
        Example_1 Stu2=new Example_1();
		
		Stu2.StuData("Naman", 102);
		Stu2.StuMarks(45, 85, 70);
		Stu2.TotalMarks();
		
		
		
		
		

	}

}
