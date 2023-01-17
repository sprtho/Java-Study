package programmers;

import java.util.Arrays;


public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,4,2};
		
		int B[] = {5 , 4 , 4};
		
		int answer = 0;
		
		Arrays.sort(A);
		
		Arrays.sort(B);
		
		System.out.println(B[0]);
		
		for(int i = 0; i<A.length; i++) {
			
			answer = answer + (A[i] * B[A.length-1-i]);
			
			
		}
		
		System.out.println(answer);
		
		
		
		//for(int i = 0 ; i<)

	}

}
