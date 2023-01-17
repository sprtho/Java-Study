
package javaStudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
//		System.out.println(iarray.length);
		
		for(int i=1; i<= iarray.length; i++) {
			
			iarray[i-1] = i;
			
		}
		
		int sum = 0;
		for(int i=1; i<= iarray.length; i++) {
			
			sum = sum + iarray[i-1];
		}
		
//		System.out.println(sum);
	
		// 2차원배열
		int [][] array4 = new int[3][4];
		
		array4[0][0] = 10;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				
				
			}
		}
		
		System.out.println(array4[0][0]);
		System.out.println(array4.length);
		
	}
}
