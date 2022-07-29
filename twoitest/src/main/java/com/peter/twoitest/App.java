package com.peter.twoitest;

/**
 * 2i Test
 *
 */
public class App 
{
	/*
	 * Method Assumptions
	 * parameters 'a' and 'x' are positive non zero
	 * parameters 'a' must be less than 'x'
	 */
	public static void testMethod( int a, int x) {
		
		if(a <= 0 || x <=0 ) {
			System.out.println("Argument error: 'a' and 'x' should be positive integers");
			return;
		}
		if( a >= x) {
			System.out.println("Argument error: 'a' must be less than 'x'");
			return;
		}
		
		System.out.println("Iterate for a is [" + a + "] and x ["  + x + "]");
		
		for (int i = 0; i < 3; i++) {
			
			int start = a + i;
			System.out.println("Start " + start);
			
			int end  = (i + 1) * x;
			System.out.println("End " + end);
			
			for (int j = start; j <= end; j+= (a+i)) {
				System.out.print(j + ", ");
			}	
			System.out.println("");
			System.out.println("");
		}
		
		System.out.println("Done");
		System.out.println("");
	}
	
	
    public static void main( String[] args )
    {
    	testMethod(1, 10);
    	
    	testMethod(1, 20);
    	
    	testMethod(2, 20);
        
    }
}
