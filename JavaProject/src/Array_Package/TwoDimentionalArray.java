package Array_Package;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		/*
		  Two Types of Arrays
        1)Single Dimensional
        2)Multi Dimensional/2 Dimensional Array
        
        Single Dimensional Array/ Two Dimensional Array
        1)Declare an Array
        2)Insert values into array
        3)Find Size of Array
        4)Read values from Array
		*/
		
/*	int a[][]= new int[3][2];
	
	  a[0][0]=100;
	  a[0][1]=200;
		
	  a[1][0]=300;
	  a[1][1]=400;	
		
	  a[2][0]=500;
	  a[2][1]=600;	
		
		System.out.println(a[1][0]);
		*/
		
		//System.out.println(a.length); To find the number of row
		//System.out.println(a[0].length); To find the number of column
		
	   int a[][]={{100,200}, {300,400} , {500,600}};
	   
	   System.out.println(a.length); // To Find length of Row
	   
	   System.out.println(a[1].length); // To find length of column we have to mention 1 row for reference
		
	  // cLassic for loop
	   
	/*   for(int r=0;r<=a.length-1;r++)
	   {
		   
		 for(int c=0;c<=a[r].length-1;c++) 
		 {
			System.out.println(a[r][c]); 
		 }   
		   
	   }   */
		
	// For each..loop/ Enhanced for Loop	
		
	for(int r[]:a)
	{
		for(int i:r)
		{
			System.out.println(i);
		}
	}
		
	   
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
