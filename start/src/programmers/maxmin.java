package programmers;

import java.util.*;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1 2 3 4 5 6 7";
		
		String answer;
		
//		System.out.println(s.length());
		
		String s2[] = s.split(" ");
		
//		System.out.println(s2.length);
		
		int snum[] = new int[s2.length];
		
		for(int i=0; i<snum.length; i++) {
			
			snum[i] = Integer.parseInt(s2[i]);
			
		}
		
		
		
		Arrays.sort(snum);
		
		answer = String.valueOf(snum[0] + "" + snum[snum.length-1]);
		
		System.out.println(answer);
		
		
		
//		System.out.println(s);
		
	//	System.out.println(s.charAt(0));
		
		
	/*	for(int i = 0 ; i<s.length() ; i++) {
			
			if(Integer.parseInt(s.charAt(i)) > 0) 
				snum[i] = s.charAt(i);
		}*/
		
		//System.out.println(snum.length);
		
		
		

	}

}
