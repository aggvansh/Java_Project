package Oops_Concept;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	Student(int id, String S, char g)
	{
		sid=id;
		sname=S;
		grade=g;
	}
	
	
	
	void getvalues(int id, String S, char g)
	{
		sid=id;
		sname=S;
		grade=g;
	}
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	
	
	
	

}
