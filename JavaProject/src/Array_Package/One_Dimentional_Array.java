package Array_Package;

public class One_Dimentional_Array {

	public static void main(String[] args) {
		
		/* Array is a variable can hold multiple values of same data types

         Two Types of Arrays
        1)Single Dimensional
        2)Multi Dimensional/2 Dimensional Array
        
        Single Dimensional Array/ Two Dimensional Array
        1)Declare an Array
        2)Insert values into array
        3)Find Size of Array
        4)Read values from Array
         */

		// Static Array
      //1)Declaration
		
	   // int a[]=new int[5];
		
	 //2)Insert Values into Array
	/*	 
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;  
      */
		
  // Dynamic Array: (1&2) Cover in single line
		
		int a[]= {100,200,300,400,500,600};// Declare an array without specifying the size.

      //   System.out.println(a.length);// To find Size of Array

    //     System.out.println(a[4]);// Reading single value from array
         
         // Reading Multiple value to find single value from array
         
         //1) CLasic for loop
         
     /*    for(int i=0;i<=a.length-1;i++)
         {
        	 System.out.println(a[i]);
         }  */

        //2) For..each loop/also called as a enhanced for loop(this loop is only use in array)
         
         for(int i:a)
         {
        	 System.out.println(i);
         }
         




















	}

}
